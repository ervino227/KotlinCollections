data class Student(val firstName: String, val grade: Int)

fun main() {
    //an array can hold different types
    val things = arrayOf(1,2,3,"one","two","three")
    //things[0] = "zero"
    for(thing in things) {
        println(thing)
    }

    val students = arrayOf<Student>(Student("Todd",6),
        Student("Daisy", 5))
    students[1] = Student("Vern", 7)
    for (student in students) {
        println(student)
    }

    //array constructor
    val fives = Array(5, ::fiver)
    fives.forEach { println(it) }

    println("fives has a ${fives.size} elements")
    println("indices = ${fives.indices}")
    println("lastIndex = ${fives.lastIndex}")

    //create an array of primitive types
    val pInts = intArrayOf(1,2,3)
}

fun fiver(index: Int): Int {
    return index*5
}