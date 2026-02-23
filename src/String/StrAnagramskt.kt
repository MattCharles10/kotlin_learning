package String

class StrAnagramskt {

    fun areAnagrams(s1: String , s2 : String): Boolean{

        if(s1.length != s2.length) return false

        //for lowercase a-z
        val freq = IntArray(26)

        //Count frequency of each character in s1
        for(ch in s1){
            freq[ch - 'a']++
        }

        //Subtract frequency using characters from s2
        for(ch in s2){
            freq[ch - 'a']--
        }

        //Check if all frequencies are zero
        for(count in freq){
            if(count != 0) return false
        }

        return true
    }


}