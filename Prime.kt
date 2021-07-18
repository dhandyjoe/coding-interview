

fun main() {
    val num = 20
    var flag = false
    for (i in 2..num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}

