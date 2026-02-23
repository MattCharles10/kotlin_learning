package String

    class Manacher(s: String) {
        val p: IntArray
        val ms: String

        init {
            val sb = StringBuilder("@")
            for (c in s) {
                sb.append("#").append(c)
            }
            sb.append("#$")
            ms = sb.toString()
            p = IntArray(ms.length)
            runManacher()
        }

        private fun runManacher() {
            var l = 0
            var r = 0
            val n = ms.length

            for (i in 1 until n - 1) {
                if (i < r)
                    p[i] = minOf(r - i, p[r + l - i])

                // expand around current center
                while (ms[i + 1 + p[i]] == ms[i - 1 - p[i]])
                    p[i]++

                // update center
                if (i + p[i] > r) {
                    l = i - p[i]
                    r = i + p[i]
                }
            }
        }

        // returns length of longest palindrome centered at given position
        fun getLongest(cen: Int, odd: Int): Int {
            val pos = 2 * cen + 2 + if (odd == 0) 1 else 0
            return p[pos]
        }

        // checks whether substring s[l..r] is a palindrome
        fun check(l: Int, r: Int): Boolean {
            val len = r - l + 1
            val longest = getLongest((l + r) / 2, len % 2)
            return len <= longest
        }

        companion object {
            // returns minimum characters to add at front to make string palindrome
            fun minChar(s: String): Int {
                val n = s.length
                val m = Manacher(s)


                for (i in n - 1 downTo 0) {
                    if (m.check(0, i))
                        return n - (i + 1)
                }

                return n - 1
            }
        }
    }


