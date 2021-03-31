fun main() {
    val m1 = mapOf(1 to "alpha", 2 to "beta", 3 to "gamma", 4 to "delta")
    val m2 = mapOf(4 to "delta", 3 to "gamma", 2 to "beta", 1 to "alpha")

    //maps with identical elements will be equal, regardless of order
    println("m1 == m2? ${m1 == m2}")

    //returns the value of a key from the map
    println("m1[2] = ${m1[2]}")

    //prints a default message
    println("m1[5] = ${m1.getOrDefault(5, "not present")}")

    //creates a map that is mutable
    println()
    val cars = mutableMapOf(
        "ford" to 1903, "gm" to 1908,
        "dodge" to 1913, "tucker" to 1944
    )

    //adds a key value pair to a mutable map
    cars["tesla"] = 2003

    //removes a key value pair from the map
    println("removed tucker = ${cars.remove("tucker")}")

    //prints each key in the map
    for (key in cars.keys) {
        println(key)
    }

    //uses the 'in' operator to check for keys or values in a map
    println("has ford? ${"ford" in cars}")
    println("has 1908? ${1908 in cars.values}")

}