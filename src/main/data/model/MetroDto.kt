package data.model

import StationDto

data class MetroDto(
    val stations: List<StationDto>,
    val travel_time_between_stations_minutes: Int
)
