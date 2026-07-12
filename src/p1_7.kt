fun factorial(n: Int): Long {
    return if (n == 0 || n == 1)
        1
    else
        n * factorial(n - 1)
}

tailrec fun tailFactorial(n: Int, result: Long = 1): Long {
    return if (n == 0 || n == 1)
        result
    else
        tailFactorial(n - 1, result * n)
}

fun main() {

    print("Enter Number: ")
    val num = readLine()!!.toInt()

    println("Factorial of $num = ${factorial(num)}")
    println("By TailRec Keyword, Factorial of $num = ${tailFactorial(num)}")
}