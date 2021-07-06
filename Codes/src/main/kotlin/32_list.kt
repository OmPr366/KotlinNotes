fun main() {
    /*There are two types of Lists :-
     1. Mutable List (Which can be changed)
     2. Immutable list  (Which can't be changed)
     */
    // Mutable List
    val num  = mutableListOf<Int>(2,3,4,5,6)
    println(num.indexOf(6))
    println(num.contains(4))
    println(num.contains(1))
    num[4] = 78

    num.add(5)
    num.remove(2)
    println(num)
    num.removeAt(2)
    println(num)


    val num2 = mutableListOf<Int>(11,22,33)
    num2.addAll(num)
    println("Here is Lis2:- $num2")
}