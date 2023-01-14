abstract class Animal constructor(food: String, location: String){
    var food: String? = null
    var location: String? = null
    init {
        this.food = food
        this.location = location
    }
    abstract fun makeNoise()
    abstract fun eat()
    fun sleep() {
        println("${javaClass.typeName} sleep.")
    }
}

class Cat(food: String,location: String,val noise: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Cat make a sound $noise")
    }
    override fun eat() {
        println("Cat eat $food in $location")
    }
}

class Dog(food: String, location: String,val noise: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Dog make a sound $noise")
    }
    override fun eat() {
        println("Dog eat $food in $location.")
    }
}

class Horse(food: String, location: String,val noise: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Horse make a sound $noise")
    }
    override fun eat() {
        println("Horse eat $food in $location.")
    }
}

class Vet {
    fun treatAnimal(animal: Animal) {
        animal.makeNoise()
        animal.eat()
        animal.sleep()
    }
}

fun main(args: Array<String>) {
    val vet = Vet()
    val animals = listOf(
        Dog("dengi","bank","ZADENGIDA!!!!!!!!"),
        Cat("milk","NaPomoyke","zadenginet!!!!!"),
        Horse("grass","field","Frrr!"))
    animals.forEach{animal ->
        vet.treatAnimal(animal)
    }
}