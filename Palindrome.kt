

fun main() {
    println(isPalindrome1("put it up"))
    println(isPalindrome2("put it up"))
    println(isPalindrome3("put it up"))
}

// BEST PRACTICE -> recursive
private fun isPalindromeRecursive (names: String, i: Int): Boolean {
    var status: Boolean = true
    if (i < names.length / 2) {
        val indeksAwal = 0
        val indeksAkhir = names.length - i - 1

        if (names[indeksAwal] != names[indeksAkhir]) {
            status = false
        } else {
            isPalindromeRecursive(names, i + 1)
        }
    } else {
        status = true
    }
    return status
}

private fun isPalindrome3 (name: String): Boolean {
    val names = name.replace(" ", "")
    return isPalindromeRecursive(names, 0)
}

// tanpa varible temporary
private fun isPalindrome1(name: String): Boolean {
    val names = name.replace(" ", "")
    for (value in 0 until (names.length)) {
        val indeksAwal = value
        val indeksAkhir = names.length - value - 1

        if (names[indeksAwal] != names[indeksAkhir]) {
            return false
        }
    }
    return true
}

// menggunakan temporary variable
private fun isPalindrome2(name: String): Boolean {
    var temp = ""
    val names = name.replace(" ", "")
    for (values in (names.length-1) downTo 0) {
        temp += names[values]
    }

    return names == temp
}


