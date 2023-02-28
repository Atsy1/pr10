 class Samokat:Tovarsklad() {
    override fun InfoAboutSamokat(){
        println("на складе $num2 самокатов")
        println("Цена самоката $priceSamokat")
        println("Год выпуска самоката $releaseyearSamokat")
        println("качество самоката${Q2()}")
    }
     override fun Q2():Double{
         return (priceSamokat/num1+0.5*(thisyear-releaseyearSamokat))
     }
     override fun Q1():Double{
         return (priceVelosiped/num2+0.5*(thisyear-releaseyearVelosiped))
     }

     override fun InfoAboutVelosiped() {
         println("на складе $num1 велосипедов")
         println("Цена велосипеда $priceVelosiped")
         println("Год выпуска Велосипеда $releaseyearVelosiped")
         println("качество велосипеда${Q1()}")

     }
}