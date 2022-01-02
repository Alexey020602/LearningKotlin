fun main(args: Array<String>) {
    val pers=Person("qqqq")
    pers.printName()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}

class Person(_name: String){
    val name: String
    init{
        name = _name
    }
    fun printName(){
        println("Hello, ${name}!")
    }
}
//class Person{
    //var name: String = "Undefined"
    //var age: Int = 18
//}