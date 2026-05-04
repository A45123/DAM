package dam_a45123.cooljetpackweatherapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dam_a45123.cooljetpackweatherapp.R

@Composable
fun WeatherCard(
    temperature: Float,
    windSpeed: Float,
    windDirection: Int,
    weatherCode: Int,
    seaLevelPressure: Float,
    time: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE9E5EE)
        ),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
        ) {
            WeatherRow(
                title = stringResource(R.string.sea_level_pressure_label),
                value = "${"%.1f".format(seaLevelPressure)} hPa"
            )
            WeatherRow(
                title = stringResource(R.string.wind_direction_label),
                value = "$windDirection°"
            )
            WeatherRow(
                title = stringResource(R.string.wind_speed_label),
                value = "$windSpeed km/h"
            )
            WeatherRow(
                title = stringResource(R.string.temperature_label),
                value = "$temperature°C"
            )
            WeatherRow(
                title = stringResource(R.string.weather_code_label),
                value = weatherCode.toString()
            )
            WeatherRow(
                title = stringResource(R.string.time_label),
                value = time
            )
        }
    }
}
