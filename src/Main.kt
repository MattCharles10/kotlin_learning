

import list.*

fun main() {
  /* val age = 21
   val age1 : Int
   age1 = 23
   val name = "mary"

    val typeinfex =  Typeinfex()

   println("inference number ${typeinfex.inferednumbers}")
   println("expilictnumber   ${typeinfex.expilictnumber}")

   println(mutablelist())

   println(Mixlisttype())

   println(analyzeShoppingList())

   println("$name is ${age +age1} years old") */

  val student = mutableListOf(
      Student("mathew ", 34),
      Student("charles",45),
      Student("elakiya" , 45),
      Student("ram", 97)

  )

  //list all students
  println("All students")
  student.forEach { println("${it.Name}: ${it.grade}") }

  // Find highest grade

  val higestgrade = student.maxByOrNull { it.grade }
    println("\nHighest grade: ${higestgrade?.Name} - ${higestgrade?.grade}")

  //find average of list

  val averagof = student.map { it.grade }.average()
  println("%2f" .format(averagof))

    //  Filter students with grade above 85
    val topStudents = student.filter { it.grade > 85 }
    println("\nTop students (grade > 85):")
    topStudents.forEach { println(it.Name) }
}