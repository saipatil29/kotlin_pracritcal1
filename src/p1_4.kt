fun main() {

    print("Enter Number: ")
    val number = readLine()!!.toInt()

    println("$number is ${if (number % 2 == 0) "Even" else "Odd"}")
}