package interview

//collection refers to the data structure to be iterated and item refers to each element of the data structure

fun main(args: Array<String>) {
    var numbersArray = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (num in numbersArray){
        if(num % 2 == 0){
            print("$num ")
        }
    }
}