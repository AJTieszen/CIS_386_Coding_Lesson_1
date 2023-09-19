fun main(args: Array<String>) {
    val number = if(args.isNotEmpty()) args[0].toIntOrNull() else null
    val input = if(args.size > 1) args[1] else ""

    println("$number is ${evenOrOdd(number)}.")
    println("$number! is ${factorial(number)}.")
    println("$number! is ${factorial2(number).toString()}.")
    println("$input is reversed to ${reverseStr(input)}")
    println("$input is ${if (isPalindrome(input)) "" else "not "}a palindrome")
}

fun evenOrOdd(num: Int?): String {
    if (num != null) {
        return if (num % 2 == 0) "even" else "odd"
    }
    return "invalid input. Please enter a valid number"
}

fun factorial(num: Int?) :String {
    if (num != null) {
        return if (num < 1) "unable to take the factorial of 0 or negative number" else {
            var x: Long = 1
            (1..num).forEach { n ->
                x *= n
            }
            x.toString()
        }
    }
    return "invalid input. Please enter a valid number"
}

fun factorial2(num: Int?) : Long? {
    return when (num) {
        null -> {
            null
        }
        0, 1 -> {
            1L
        }
        else -> {
            var result = 1L
            for (i in 2..num) {
                result *= i
            }
            return result
        }
    }
}

fun reverseStr(input: String): String {
    return input.reversed()
}

fun isPalindrome(str: String): Boolean {
    val cleanStr = str.lowercase().replace(Regex("[^a-zA-Z0-9]"), "")
    return cleanStr == reverseStr(cleanStr)
}