fun main(args: Array<String>) {
    val number = if(args.isNotEmpty()) args[0].toIntOrNull() else null
    println("$number is ${evenOrOdd(number)}.")
}

fun evenOrOdd(num: Int?): String {
    if (num != null) {
        return if (num % 2 == 0) "even" else "odd"
    }
    return "invalid input. Please enter a valid number"
}