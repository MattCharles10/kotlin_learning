package list

fun Mixlisttype(){

    val mixlist = listOf("String" , 17 ,23.09, true)

    //  Access different elements
    println("String element: ${mixlist[0]}")
    println("Int element: ${mixlist[1]}")
    println("Double element: ${mixlist[2]}")
    println("Boolean element: ${mixlist[3]}")

    // What type is inferred for this list?
    println("List type: ${mixlist::class.simpleName}")

    //  Try creating mutable version - specify type as Any
    val mutableMixed: MutableList<Any> = mutableListOf("hello", 100, false)
    mutableMixed.add(55.5)
    println("Mutable mixed: $mutableMixed")

}