fun main() {
    //ops used to allowing access of inheritance
    //You can Inherit any class with only one ( Can't inherit from multiple classes
    // Parent class constructor is called before child class

    val myChild = Child()
    val myParent = Parent()
    myChild.myMethod()
    myChild.myMethod2()
    myChild.name = "OmPrakash"
    myChild.nam2 ="Prakash"
}

open class Parent(){
    init {
        println("Parent's Constructor is called")
    }
    var name:  String  = ""
    fun myMethod(){
        println("This is Parent Class")
    }
}

class Child:Parent(){
    init {

    }
    var nam2:String = ""

    fun myMethod2(){
        println("This is Child Function")
    }
}