import java.io.File
import java.io.FileNotFoundException

fun main(args: Array<String>) {

    //Read input file
    try {
        var input = File("src/main/kotlin/input.txt").readLines()
        println(splitInput(input))
    }catch (e: FileNotFoundException){
        println("Input File not found")
    }

}
fun splitInput(input: List<String>): List<String> {
    val list : ArrayList<String> = ArrayList()

    input.toString().split(",", "<", ">").map { it.trim() }.run {
        for (value in 0 until (input.toString()).length){
            list.add(this[1])
            list.add(this[2])
            list.add(this[4])
            list.add(this[5])
            }

        return list
    }
}