package String

class KMpAlgokt {
    fun constructLps(pat: String, lps: IntArray) {
        var len = 0
        lps[0] = 0

        var i = 1
        while (i < pat.length) {
            if (pat[i] == pat[len]) {
                len++
                lps[i] = len
                i++
            } else {
                if (len != 0) {
                    len = lps[len - 1]
                } else {
                    lps[i] = 0
                    i++
                }
            }
        }
    }

    fun search(pat: String, txt: String): ArrayList<Int> {
        val n = txt.length
        val m = pat.length

        val lps = IntArray(m)
        val result = ArrayList<Int>()

        constructLps(pat, lps)

        var i = 0 // index for txt
        var j = 0 // index for pat

        while (i < n) {
            if (txt[i] == pat[j]) {
                i++
                j++

                if (j == m) {
                    result.add(i - j)
                    j = lps[j - 1]
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1]
                } else {
                    i++
                }
            }
        }

        return result
    }
}