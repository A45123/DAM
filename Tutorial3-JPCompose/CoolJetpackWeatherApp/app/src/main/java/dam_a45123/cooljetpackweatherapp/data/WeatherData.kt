package dam_a45123.cooljetpackweatherapp.data

import kotlinx.serialization.Serializable

@Serializable
data class WeatherData(
    val latitude: Float,
    val longitude: Float,
    val current_weather: CurrentWeather,
    val hourly: Hourly? = null
)

@Serializable
data class CurrentWeather(
    val temperature: Float,
    val windspeed: Float,
    val winddirection: Int,
    val weathercode: Int,
    val is_day: Int = 1, // 1 para dia, 0 para noite
    val time: String
)

@Serializable
data class Hourly(
    val time: List<String>,
    val pressure_msl: List<Float>? = null
)
