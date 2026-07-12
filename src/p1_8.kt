fun main() {
    println("Create Array-1 by using arrayOf() method:")
    val arr1 = arrayOf(10, 90, 60, 80, 100)
    println(arr1.contentToString())

    println("\nCreate Array-2 by using Array<>():")
    val arr2 = Array(5) { 0 }
    println(arr2.contentToString())

    println("\nCreate Array-3 by using Array<> and lambda function:")
    val arr3 = Array(8) { it }
    println(arr3.contentToString())

    println("\nCreate Array-4 by using IntArray():")
    val arr4 = IntArray(5)
    println(arr4.joinToString())

    println("\nCreate Array-5 by using intArrayOf():")
    val arr5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println(arr5.joinToString())

    println("\nCreate 2D Array-6 by using arrayOf() and intArrayOf():")
    val arr6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println(arr6.contentDeepToString())

    val a = IntArray(5)

    println("\nPlease enter Array Value:")
    for (i in a.indices) {
        print("a[$i] = ")
        a[i] = readLine()!!.toInt()
    }

    println("\nEntered Array:")
    println(a.joinToString())

    println("\n************ With Built-in Function ************")
    val builtIn = a.copyOf()
    builtIn.sort()
    println("After sorting by built-in function:")
    println(builtIn.joinToString())

    println("\n************ Without Built-in Function ************")
    val manual = a.copyOf()

    println("Before Sorting:")
    println(manual.joinToString())

    for (i in 0 until manual.size - 1) {
        for (j in 0 until manual.size - i - 1) {
            if (manual[j] > manual[j + 1]) {
                val temp = manual[j]
                manual[j] = manual[j + 1]
                manual[j + 1] = temp
            }
        }
    }

    println("\nAfter Sorting without built-in function:")
    println(manual.joinToString())
}