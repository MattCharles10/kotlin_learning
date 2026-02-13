package Arrays.kotlinbaby

class MajorityElementkt {

    fun MajorityEle(arr : IntArray) : ArrayList<Int>{

        val n = arr.size;
        val freq = HashMap<Int, Int>()
        val res = ArrayList<Int>()

        //Find the Freq or Count of element
        for(ele in arr){
            freq.put(ele, freq.getOrDefault(ele,0)+1)
        }

        for(it in freq.entries){
            var ele = it.key
            var cnt = it.value

            if(cnt > n/3){
                res.add(ele)
            }
        }
        res.sort()
        return res
    }
}