fun main() {
    /*
    Function Overloading means Same name different parameters
     */
//    println(add(1,2))
    println(add(1.4,2.9))
    val fn = :: add
    println(fn(1.3,5.6))
}

//fun add(a:Int , b:Int)= a+b


fun add(a:Double , b:Double)= a+b

