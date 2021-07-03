fun main() {
    val name = arrayOf("op","opr","one","two")
    val num = arrayOf(1,2,3,4)

    val num2 = arrayOf<Int>(98,76,6,45)

    for (i in name) print("$i ")
    println("")
    for ((i,e) in num2.withIndex()) print("$i - $e , ")

    println()
    println(num[0])
    println(num.get(1))
    println(num.get(2))

    num.set(3,99903)
    //num[3] = 99903
    println(num[3])
    println(num.size)
}