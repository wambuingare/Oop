fun main(){
    var toyota= Car("Toyota","Mark X","KDD 729k",50)
    toyota.start()
    println(toyota.make)
    println(toyota.speed)
    toyota.stop()
    println(toyota.speed)
        var audi=Car("Audi","A3","KBB 161",75)
    audi.start()
    println(audi.make)
    println(audi.registration)
    audi.hoot()
    toyota.start()
    println(audi.speed)
    audi.stop()
    println(audi.speed)
    var lexus=Car("Lexus", "ux","KCA 023", 80)
    lexus.start()
    println(lexus.make)
    println(lexus.registration)
    println(lexus.model)
    println(lexus.speed)
    lexus.stop()
    println(lexus.speed)
}
class Car(var make: String, var model: String, var registration: String, var speed: Int){
    fun start(){
        println("Chogio gio gio,vrooom")
    }
    fun accelerate(acceleration: Int): Int{
        speed += acceleration
        return speed
    }
    fun hoot(){
        println("piiiiiiiiiiii, pooooooooooo")
    }
    fun decelerate(deceleration: Int): Int{
        speed -= deceleration
        return speed
    }
    fun stop(){
        speed=0
        println("stop")
    }
}