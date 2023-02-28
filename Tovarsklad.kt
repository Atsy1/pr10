abstract class Tovarsklad {
    val num1: Double=10.0
    val num2: Double=4.0
    var priceVelosiped : Double = 12000.0
    var priceSamokat : Double = 3000.0
    var releaseyearVelosiped : Int = 2015
    var releaseyearSamokat : Int = 2019
    var thisyear : Int = 2023
    var Q1: Double = 0.0
    var Q2: Double = 0.0
   abstract fun Q1():Double
    abstract fun Q2():Double
    abstract fun InfoAboutSamokat()
    abstract fun InfoAboutVelosiped()


}