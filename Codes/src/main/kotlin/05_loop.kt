fun main() {
    // Note While and do while loop are same as in other language so i'm not mentioning this


    val numb = 9

    //This will print from 1 to 10
//    for (i in 1..10){
//        println("9 X "+i+" = "+i*numb )
//    }

    //This will print from 1 to 9
//    for (i in 1 until 10){
//        println("9 X "+i+" = "+i*numb )
//    }

    //This will print from 1 to 10 by increment of 2
//    for (i in 1 .. 10 step (2)){
//        println("9 X "+i+" = "+i*numb )
//    }

    // This will print from 10 to 1 in decreasing order
//    for (i in 10 downTo 1){
//        println("9 X "+i+" = "+i*numb )
//    }

    // This will print from 10 to 1 in decreasing order by decrement of 2
    for (i in 10 downTo 1 step (2)){
//        println( numb.toString() + " X "+i+" = "+i*numb )

    //String Templating :-
        println("$numb X $i = ${numb*i}")   //(V V I )
    }
}