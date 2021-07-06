fun main() {
//    val ob = calculator()
//    println(ob.add(90,23))
//    println(ob.mult(3,90))

    val client1 = calculator("monu",19)
    println(client1.age)
    client1.age = 22
    client1.age = -22
    println(client1.age)
    println(client1.name)


}

class calculator(nameParam: String, ageParam: Int){

    public
    var name :  String = nameParam
    get() {
        return field.toUpperCase()
    }
    var age : Int  = ageParam
        get() {
            return ++field
        }
    set(value) {
        if (value>0){
            field = value
        }else{
            println("Age Can't be negative")
        }
    }

    var email:String = ""
    get() = field
    set(value) {
        field = value
    }

//    lateinit var message : String

//    fun add(a: Int, b: Int) =a+b
//
//    fun mult(a:Int, b:Int) = a*b
}