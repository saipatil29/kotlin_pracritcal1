fun addition(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun subtraction(a: Int, b: Int, c: Int): Int {
    return a - b - c
}

fun multiplication(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

fun division(a: Int, b: Int): Int {
    return a / b
}

fun main() {

    val a = 111
    val b = 2222
    val c = -222

    println("Addition of $a, $b, $c is ${addition(a, b, c)}")
    println("Subtraction of $a, $b, $c is ${subtraction(a, b, c)}")
    println("Multiplication of $a, $b, $c is ${multiplication(a, b, c)}")
    println("Division of $b, $a is ${division(b, a)}")
}