interface MetroDataSource {
    fun loadStations(): List<StationDto>
    fun GetTravelTime(): Int
}
