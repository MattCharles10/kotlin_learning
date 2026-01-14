package list

fun analyzeShoppingList(){

    val shopping = mutableListOf("milk", "eggs", "bread", "cheese", "eggs", "apples")

    // println all the list
    println("Shopping list : $shopping")

    // count the number of items
    println("Number of items: ${shopping.count()}")

    //check the item is present
    println("Has bread  in ${"bread" in shopping}")

    //remove duplicate element
    shopping.remove("eggs")
    println("remove duplicate element $shopping")

    shopping.add(0, "butter")
    println("After adding butter: $shopping")

    //  Get last item
    println("Last item: ${shopping.last()}")

}
