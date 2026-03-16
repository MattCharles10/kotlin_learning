package interview

import java.util.Stack

/*Given a string containing ()[]{}, determine if it is valid.

Example

Input: "()[]{}"
Output: true */

class Quest17 {

    fun isValid(s : String) : Boolean{
        val stack = Stack<Char>()

        for(c in s){
            when (c){
                '(' -> stack.push(')')
                '{' -> stack.push('}')
                '[' -> stack.push(']')
                else -> {
                    if(stack.isEmpty() || stack.pop() != c) return false
                }
            }
        }

        return stack.isEmpty()

    }
}