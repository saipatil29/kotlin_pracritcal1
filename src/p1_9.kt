fun main() {

    val list = ArrayList<Int>()

    println("Enter 5 numbers:")

    for (i in 0 until 5) {
        print("a[$i] = ")
        list.add(readLine()!!.toInt())
    }

    var max = list[0]

    for (i in 1 until list.size) {
        if (list[i] > max) {
            max = list[i]
        }
    }

    println("\nLargest element = $max")
}