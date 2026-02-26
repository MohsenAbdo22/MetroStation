package data.mapper

import MetroLine
import Station
import StationDto

object MetroMapper {
    fun todMain(dto:StationDto):Station{
        return Station(
            id =dto.id,
            name = dto.name,
            order = dto.order,
            isTransfer = dto.isTransfer,
            line = toMetroLine(dto.line),
            transferLine = dto.transferLine.map { toMetroLine(it) }
        )
    }
    private  fun  toMetroLine(line : String):MetroLine=
        when(line.trim().uppercase()){
            "LINE_1","FIRST LINE","1"->MetroLine.LINE_1
            "LINE_2","SECAND","2"->MetroLine.LINE_2
            "LINE_3","THIRD LINE","3"->MetroLine.LINE_3
            else -> MetroLine.LINE_0
        }
}