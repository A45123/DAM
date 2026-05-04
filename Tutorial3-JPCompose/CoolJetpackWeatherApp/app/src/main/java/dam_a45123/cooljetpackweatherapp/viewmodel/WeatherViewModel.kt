package dam_a45123.cooljetpackweatherapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dam_a45123.cooljetpackweatherapp.data.WeatherApiClient
import dam_a45123.cooljetpackweatherapp.ui.WeatherUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(WeatherUIState())
    val uiState: StateFlow<WeatherUIState> = _uiState.asStateFlow()

    init {
        fetchWeather()
    }

    fun updateLatitude(lat: Float) {
        _uiState.value = _uiState.value.copy(latitude = lat)
    }

    fun updateLongitude(lon: Float) {
        _uiState.value = _uiState.value.copy(longitude = lon)
    }

    fun fetchWeather() {
        viewModelScope.launch {
            val data = WeatherApiClient.getWeather(_uiState.value.latitude, _uiState.value.longitude)
            data?.let {
                val pressure = it.hourly?.pressure_msl?.firstOrNull() ?: 0f
                _uiState.value = _uiState.value.copy(
                    temperature = it.current_weather.temperature,
                    windspeed = it.current_weather.windspeed,
                    winddirection = it.current_weather.winddirection,
                    weathercode = it.current_weather.weathercode,
                    isDay = it.current_weather.is_day == 1,
                    time = it.current_weather.time,
                    seaLevelPressure = pressure
                )
            }
        }
    }
}
