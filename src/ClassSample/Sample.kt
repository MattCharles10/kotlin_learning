package ClassSample

sealed class Sample {
    class A : Sample(){
        fun print(){
            println("it is from the class A")
        }
    }
    class B : Sample(){
        fun print(){
            println("it is from the class B")
        }
    }
}