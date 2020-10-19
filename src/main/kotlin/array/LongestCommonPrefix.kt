package array

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        val itr = strs.iterator()
        val common = itr.next()
        var min: Int = common.length
        for (s in itr) {
            if (min > s.length) {
                min = s.length
            }
            for (c in 0 until min) {
                if (common[c] != s[c]) {
                    min = c
                    break
                }
            }
            if (min == 0) {
                return ""
            }
        }
        return common.substring(0, min)
    }
}

/*
abcdef
abcfed
adec

adec
abcdef

 */