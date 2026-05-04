package dam_a45123.cooljetpackweatherapp.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import dam_a45123.cooljetpackweatherapp.R
import dam_a45123.cooljetpackweatherapp.data.WMO_WeatherCode
import dam_a45123.cooljetpackweatherapp.viewmodel.WeatherViewModel

@Composable
fun WeatherUI(
    modifier: Modifier = Modifier,
    weatherViewModel: WeatherViewModel = viewModel()
) {
    val weatherUIState by weatherViewModel.uiState.collectAsState()
    val latitude = weatherUIState.latitude
    val longitude = weatherUIState.longitude
    val temperature = weatherUIState.temperature
    val windSpeed = weatherUIState.windspeed
    val windDirection = weatherUIState.winddirection
    val weatherCode = weatherUIState.weathercode
    val seaLevelPressure = weatherUIState.seaLevelPressure
    val time = weatherUIState.time
    val isDay = weatherUIState.isDay
    val configuration = LocalConfiguration.current
    val context = LocalContext.current

    val wmoCode = WMO_WeatherCode.fromCode(weatherCode)
    val wImage = when (wmoCode) {
        WMO_WeatherCode.CLEAR_SKY,
        WMO_WeatherCode.MAINLY_CLEAR,
        WMO_WeatherCode.PARTLY_CLOUDY -> if (isDay) "${wmoCode.image}_day" else "${wmoCode.image}_night"
        null -> "ic_weather_cloudy"
        else -> wmoCode.image
    }
    val wIconRes = context.resources.getIdentifier(wImage, "drawable", context.packageName)

    if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
        LandscapeWeatherUI(
            modifier = modifier,
            wIcon = wIconRes,
            latitude = latitude,
            longitude = longitude,
            temperature = temperature,
            windSpeed = windSpeed,
            windDirection = windDirection,
            weatherCode = weatherCode,
            seaLevelPressure = seaLevelPressure,
            time = time,
            onLatitudeChange = { newValue ->
                newValue.toFloatOrNull()?.let(weatherViewModel::updateLatitude)
            },
            onLongitudeChange = { newValue ->
                newValue.toFloatOrNull()?.let(weatherViewModel::updateLongitude)
            },
            onUpdateButtonClick = weatherViewModel::fetchWeather
        )
    } else {
        PortraitWeatherUI(
            modifier = modifier,
            wIcon = wIconRes,
            latitude = latitude,
            longitude = longitude,
            temperature = temperature,
            windSpeed = windSpeed,
            windDirection = windDirection,
            weatherCode = weatherCode,
            seaLevelPressure = seaLevelPressure,
            time = time,
            onLatitudeChange = { newValue ->
                newValue.toFloatOrNull()?.let(weatherViewModel::updateLatitude)
            },
            onLongitudeChange = { newValue ->
                newValue.toFloatOrNull()?.let(weatherViewModel::updateLongitude)
            },
            onUpdateButtonClick = weatherViewModel::fetchWeather
        )
    }
}

@Composable
fun PortraitWeatherUI(
    modifier: Modifier = Modifier,
    wIcon: Int,
    latitude: Float,
    longitude: Float,
    temperature: Float,
    windSpeed: Float,
    windDirection: Int,
    weatherCode: Int,
    seaLevelPressure: Float,
    time: String,
    onLatitudeChange: (String) -> Unit,
    onLongitudeChange: (String) -> Unit,
    onUpdateButtonClick: () -> Unit,
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color(0xFFF4F3F7)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            WeatherIcon(wIcon, modifier = Modifier.size(128.dp))
            Spacer(modifier = Modifier.height(14.dp))
            CoordinatesCard(
                latitude = latitude,
                longitude = longitude,
                onLatitudeChange = onLatitudeChange,
                onLongitudeChange = onLongitudeChange,
                modifier = Modifier.fillMaxWidth(0.96f)
            )
            Spacer(modifier = Modifier.height(10.dp))
            WeatherCard(
                temperature = temperature,
                windSpeed = windSpeed,
                windDirection = windDirection,
                weatherCode = weatherCode,
                seaLevelPressure = seaLevelPressure,
                time = time,
                modifier = Modifier.fillMaxWidth(0.96f)
            )
            Spacer(modifier = Modifier.height(14.dp))
            UpdateButton(
                onUpdateButtonClick = onUpdateButtonClick,
                modifier = Modifier.fillMaxWidth(0.96f)
            )
        }
    }
}

@Composable
fun LandscapeWeatherUI(
    modifier: Modifier = Modifier,
    wIcon: Int,
    latitude: Float,
    longitude: Float,
    temperature: Float,
    windSpeed: Float,
    windDirection: Int,
    weatherCode: Int,
    seaLevelPressure: Float,
    time: String,
    onLatitudeChange: (String) -> Unit,
    onLongitudeChange: (String) -> Unit,
    onUpdateButtonClick: () -> Unit,
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color(0xFFF4F3F7)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 18.dp, vertical = 14.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                WeatherIcon(
                    wIcon,
                    modifier = Modifier
                        .weight(1f)
                        .size(120.dp)
                )
                CoordinatesCard(
                    latitude = latitude,
                    longitude = longitude,
                    onLatitudeChange = onLatitudeChange,
                    onLongitudeChange = onLongitudeChange,
                    modifier = Modifier.weight(1.2f)
                )
                WeatherCard(
                    temperature = temperature,
                    windSpeed = windSpeed,
                    windDirection = windDirection,
                    weatherCode = weatherCode,
                    seaLevelPressure = seaLevelPressure,
                    time = time,
                    modifier = Modifier.weight(1.2f)
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            UpdateButton(
                onUpdateButtonClick = onUpdateButtonClick,
                modifier = Modifier.fillMaxWidth(0.48f)
            )
        }
    }
}

@Composable
private fun UpdateButton(
    onUpdateButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onUpdateButtonClick,
        modifier = modifier.height(46.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6750A4)),
        shape = MaterialTheme.shapes.extraLarge,
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 1.dp)
    ) {
        Text(
            text = stringResource(R.string.update_button),
            style = MaterialTheme.typography.titleSmall,
            color = Color.White
        )
    }
}

@Composable
fun WeatherIcon(resId: Int, modifier: Modifier = Modifier) {
    if (resId != 0) {
        Image(
            painter = painterResource(id = resId),
            contentDescription = null,
            modifier = modifier
        )
    } else {
        Icon(
            imageVector = Icons.Default.Cloud,
            contentDescription = null,
            modifier = modifier.size(120.dp),
            tint = MaterialTheme.colorScheme.outline
        )
    }
}
