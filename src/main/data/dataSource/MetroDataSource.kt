interface MetroDataSource {
    fun loadStations(): List<Station>
    fun GetTravelTime(): Int
}
