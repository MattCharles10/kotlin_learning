package DSA

data class User(

    val firstname : String ,
    val lastname : String ,
    val phone : String ,
    val email : String ,

)

fun main (args : Array<String>){
    val user = User("Mathew" ,
        "Charles" ,
        "99999999" ,
        "example@gmail.com"
    )

    println("Name: ${user.firstname} ${user.lastname}")
    println("Phone: ${user.phone}")
    println("Email: ${user.email}")
}