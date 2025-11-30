data class Dog (

    val name: String,
    val breed: String,
    val color: String,
    var age: Int

){
    fun woof() {
        println("$name is a $color $breed. They're $age years old! ")
    }
}



