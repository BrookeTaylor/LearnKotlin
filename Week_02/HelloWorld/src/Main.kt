fun greet(name: String = "World"): String {
    return "Hello, $name!"
}

fun main() {
    /*
    *   For multiple-line comments,
    *   use forward slash and asterisks.
    */
    println(greet())
    println(greet("Brooke"))

    // double slash for single-line comments
    println(3 + 3)
}

