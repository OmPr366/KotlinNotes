fun main() {
    val bmw = car("BMW", "Petrol",4030)
    val suzuki = car("MarutiSuzuki" ,"Diesel", 980)

    println("Property of BMW car is:- ")
    print(bmw.name)
    print(" ")
    print(bmw.type)
    print(" ")
    println(bmw.kmRang)
    println("\nProperty of Suzuki car is:- ")
    print(suzuki.name)
    print(" ")
    print(suzuki.type)
    print(" ")
    println(suzuki.kmRang)
    bmw.driveCar()
    suzuki.driveCar()


    val mohan = Person("Mohan", 60)
    val sohan = Person("Sohan", 16)

    println(mohan.canVote())
    println(sohan.canVote())

}

class car(val name: String,val type : String, var kmRang:Int){
    fun driveCar(){
        println("$name Car is driving...")
    }

    fun applyBrake(){
        println("Brake Applied ")
    }
}

class Person(val name: String , val age :Int){
    fun canVote():Boolean{
        return age>18
    }
}