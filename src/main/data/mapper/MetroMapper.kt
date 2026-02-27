package data.mapper

import MetroLine
import Station
import StationDto

object MetroMapper {
    fun todMain(dto: StationDto):Station{
        return Station(
            id =dto.id,
            name = dto.name,
            order = dto.order,
            isTransfer = dto.isTransfer,
            line = dto.line.toMetroLine(),
            transferLine = dto.transferLine.map { it.toMetroLine() }
        )
    }
    private  fun  String.toMetroLine():MetroLine=
        when(this.trim().uppercase()){
            "LINE_1","FIRST LINE","1"->MetroLine.LINE_1
            "LINE_2","SECAND","2"->MetroLine.LINE_2
            "LINE_3","THIRD LINE","3"->MetroLine.LINE_3
            else -> MetroLine.LINE_0
        }
}