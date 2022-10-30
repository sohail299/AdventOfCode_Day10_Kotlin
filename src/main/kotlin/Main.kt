import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>) {

    //Read input file
    try {
        val input = File("src/main/kotlin/input.txt").readLines().map { splitInput(it) }
        minimum(input)

    } catch (e: FileNotFoundException) {
        println("Input File not found")
    }
}

//Get the  minimum time and map the data
fun minimum(input: List<StarPositionAndVelocity>){
    for(i in input.indices){
       var t = input.map { it.movement(i) }

        println("${t[i].posX}     ${t[i].posY}   ${t[i].t}")

    }
}
//split input values
fun splitInput(input: String): StarPositionAndVelocity {
    val list: ArrayList<String> = ArrayList()
    input.split(",", "<", ">").map { it.trim() }.run {
            list.add(this[1])
            list.add(this[2])
            list.add(this[4])
            list.add(this[5])
        return StarPositionAndVelocity((this[1].toInt()),
                (this[2].toInt()),
                (this[4].toInt()),
              (this[5].toInt()))
    }
}