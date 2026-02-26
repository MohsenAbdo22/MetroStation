interface MetroRipository {
    fun GetStations(): List<StationDto>
    fun GetTravelTime(): Int
}