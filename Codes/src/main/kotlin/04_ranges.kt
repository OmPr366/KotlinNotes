fun main(){
    var num = 10

    //Range in Kotlin :-
//    var check = num in 1..10
//    var check = num in 1 until 10
//    println(check)


    //When in Kotlin :-

    val idNum = 10
    if (idNum==10){
        println("Your Id numbert is 10")
    }else if(idNum == 20){
        println("Your Id Num is 60")
    }else if (idNum == 50){
        println("Your id numebr is 50")
    }else if (idNum == 0){
        println("Your Id num is NULL")
    }else {
        println("Your id is not associated")
    }


    // you can write these using when in Kotlin as:-

    val result = when(idNum){
        100-> "Your Id number is 10 using when"
        20-> "Your Id number is 20"
        in 1..10-> "Your Id number is 30"
        40-> "Your Id number is 40"
        else-> "Your Id number is 4664"

    }

    println(result)


}