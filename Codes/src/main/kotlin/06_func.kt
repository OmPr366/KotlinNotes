fun main() {
    val result  = sum(45,45)
    println(result)
    val result2  = sum(1234,4675)
    println(result2)
    println(evenOdd(45))
    println(evenOdd(40))
    println(evenOdd(90))

    printMessage(11) // It will print 6 times
    printMessage()   // (By Default it will print 2 times
}

//fun sum (num1 : Int, num2: Int):Int{
//    val sum = num1+num2
//    return sum
//}

//Inline Fucntion :-

//fun sum (num1 : Int, num2: Int):Int = num1+num2
fun sum (num1 : Int, num2: Int) = num1+num2

fun evenOdd (num :Int):String = when(num%2){
        0 -> "Even"
        else -> "Odd"
    }

fun printMessage(n : Int = 2){
    // n =5 (This will give error )
    // N variable can't be reassign


//    for (i in 1..n step(1)){
//        println("Hello World to :- $i")
//    }

    for (i  in n downTo 1 step(2)){
        println("Hello World to :- $i")
    }
}
