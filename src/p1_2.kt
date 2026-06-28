fun main() {


        var i: Int = 10
        var d: Double = i.toDouble()

        var s: String = i.toString()

        var str1: String = "10"
        var i1: Int = str1.toInt()
        var i2: Int? = str1.toInt()

        var str2: String = "11.12"
        var d1: Double = str2.toDouble()

        println("Integer Value: " + i)
        println("Double Value (From Integer): " + d)
        println("String Value: " + s)
        println("Integer Value1 (From String): " + i1)
        println("Integer Value2 (From String): " + i2)
        println("Double Value (From String): " + d1)


}