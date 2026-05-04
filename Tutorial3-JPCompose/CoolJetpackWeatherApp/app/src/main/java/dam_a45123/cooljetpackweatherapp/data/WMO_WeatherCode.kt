package dam_a45123.cooljetpackweatherapp.data

enum class WMO_WeatherCode(val code: Int, val description: String, val image: String) {
    CLEAR_SKY(0, "Clear sky", "ic_weather_sunny"),
    MAINLY_CLEAR(1, "Mainly clear", "ic_weather_sunny"),
    PARTLY_CLOUDY(2, "Partly cloudy", "ic_weather_partly_cloudy"),
    OVERCAST(3, "Overcast", "ic_weather_cloudy"),
    FOG(45, "Fog", "ic_weather_fog"),
    DEPOSITING_RIME_FOG(48, "Depositing rime fog", "ic_weather_fog"),
    DRIZZLE_LIGHT(51, "Drizzle: Light", "ic_weather_rainy"),
    DRIZZLE_MODERATE(53, "Drizzle: Moderate", "ic_weather_rainy"),
    DRIZZLE_DENSE(55, "Drizzle: Dense", "ic_weather_rainy"),
    FREEZING_DRIZZLE_LIGHT(56, "Freezing Drizzle: Light", "ic_weather_rainy"),
    FREEZING_DRIZZLE_DENSE(57, "Freezing Drizzle: Dense", "ic_weather_rainy"),
    RAIN_SLIGHT(61, "Rain: Slight", "ic_weather_rainy"),
    RAIN_MODERATE(63, "Rain: Moderate", "ic_weather_rainy"),
    RAIN_HEAVY(65, "Rain: Heavy", "ic_weather_rainy"),
    FREEZING_RAIN_LIGHT(66, "Freezing Rain: Light", "ic_weather_rainy"),
    FREEZING_RAIN_HEAVY(67, "Freezing Rain: Heavy", "ic_weather_rainy"),
    SNOW_FALL_SLIGHT(71, "Snow fall: Slight", "ic_weather_snowy"),
    SNOW_FALL_MODERATE(73, "Snow fall: Moderate", "ic_weather_snowy"),
    SNOW_FALL_HEAVY(75, "Snow fall: Heavy", "ic_weather_snowy"),
    SNOW_GRAINS(77, "Snow grains", "ic_weather_snowy"),
    RAIN_SHOWERS_SLIGHT(80, "Rain showers: Slight", "ic_weather_rainy"),
    RAIN_SHOWERS_MODERATE(81, "Rain showers: Moderate", "ic_weather_rainy"),
    RAIN_SHOWERS_HEAVY(82, "Rain showers: Heavy", "ic_weather_rainy"),
    SNOW_SHOWERS_SLIGHT(85, "Snow showers: Slight", "ic_weather_snowy"),
    SNOW_SHOWERS_HEAVY(86, "Snow showers: Heavy", "ic_weather_snowy"),
    THUNDERSTORM_SLIGHT(95, "Thunderstorm: Slight or moderate", "ic_weather_thunderstorm"),
    THUNDERSTORM_HAIL_SLIGHT(96, "Thunderstorm with slight hail", "ic_weather_thunderstorm"),
    THUNDERSTORM_HAIL_HEAVY(99, "Thunderstorm with heavy hail", "ic_weather_thunderstorm");

    companion object {
        fun fromCode(code: Int): WMO_WeatherCode? {
            return values().find { it.code == code }
        }
    }
}

fun getWeatherCodeMap(): Map<Int, WMO_WeatherCode> {
    return WMO_WeatherCode.values().associateBy { it.code }
}
