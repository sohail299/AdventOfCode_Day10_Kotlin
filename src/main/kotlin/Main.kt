import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>) {

    //Read input file
    try {
        val input = File("src/main/kotlin/input.txt").readLines().map { splitInput(it) }
        //   minimum(input)
        val minimum = (0..1000).map { t -> input.map { it.movement(t) } }
            .minBy { d -> closestDistance(d) }
        println("t=${minimum.first().time}")
    } catch (e: FileNotFoundException) {
        println("Input File not found")
    }
}

//Get the closest minimum distance Time among stars
fun closestDistance(star: List<StarPositionAndVelocity>): Int {
    var minDistance = 0
    val maxX = star.map { it.positionX }.max()
    val minX = star.map { it.positionX }.min()
    val maxY = star.map { it.positionY }.max()
    val minY = star.map { it.positionY }.min()
    minDistance = maxX - minX + maxY - minY
    return minDistance
}

//split input values
fun splitInput(input: String): StarPositionAndVelocity {
    val list: ArrayList<String> = ArrayList()
    input.split(",", "<", ">").map { it.trim() }.run {
        list.add(this[1])
        list.add(this[2])
        list.add(this[4])
        list.add(this[5])
        return StarPositionAndVelocity(
            (this[1].toInt()),
            (this[2].toInt()),
            (this[4].toInt()),
            (this[5].toInt())
        )
    }
}