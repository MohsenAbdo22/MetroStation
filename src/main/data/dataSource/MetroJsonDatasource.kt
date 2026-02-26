import com.google.gson.Gson
import data.model.MetroDto
import java.io.File

class MetroJsonDatasource(private val psth : String):MetroDataSource {
    private  val gson = Gson()
    private val dto by lazy {
        gson.fromJson(File(psth).readText(),
            MetroDto::class.java)
    }

    override fun loadStations(): List<Station> {
        TODO("Not yet implemented")
    }

    override fun GetTravelTime(): Int {
        TODO("Not yet implemented")
    }

}
