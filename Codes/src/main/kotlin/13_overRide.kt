fun main() {
    val oneplus = oneplus()
    oneplus.display()
}

open class mobile{
    open val name:String = ""
    open val size:Int = 5

    fun makeCall() = println("Calling Started...")
    fun poweroff() = println("Mobile is switching off..")
    open fun display() = println("Mobile Screen is displaying....")
}

class oneplus :mobile(){
    override fun display() {
        println("OnePlus mobile is displaying....")
    }

    override val name: String = "OnePlus"
    override val size: Int = 8


}