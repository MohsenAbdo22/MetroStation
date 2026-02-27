package data.repo

import MetroDataSource
import MetroRipository
import Station
import data.mapper.MetroMapper

class MetroRepositoryImpl(private val dataSource: MetroDataSource):MetroRipository {
    override fun GetStations(): List<Station> {

        return dataSource.loadStations().map { MetroMapper.todMain(it) }
    }

    override fun GetTravelTime(): Int {
        return dataSource.GetTravelTime()
    }


}