package list

fun mutablelist ( ){

    val temperatures = mutableListOf(72.5, 68.0, 75.3, 70.1, 65.8)

    temperatures.add(23.0)
    temperatures.add(89.0)

    temperatures.remove(temperatures[1])
    println("$temperatures and the count of temperature are ${temperatures.count()}")

}

fun mu(){

    val tem1 = mutableListOf<Int>(12 , 23 , 34 , 56 , 67)

    tem1.add(79)
    tem1.add(89)

    tem1.remove(tem1[0])
    println("$tem1 and the count of temperature are ${tem1.count()}")



}