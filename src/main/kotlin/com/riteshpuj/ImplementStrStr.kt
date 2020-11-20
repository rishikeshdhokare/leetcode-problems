package com.riteshpuj

@Suppress("unused")
class ImplementStrStr {
    /*
    haystack - This is a haystack
    needle = is
     */
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        val longestSubstringPrefix = buildLongestSubstringPrefixArray(needle)

        var j = 0
        var i = 0

        while (i < haystack.length) {
            if (haystack[i] != needle[j]) {
                if (j - 1 < 0) {
                    j = 0 // because a negative i is not a valid array position
                    i++
                } else {
                    j =
                        longestSubstringPrefix[j - 1] // because longestSubstringPrefix[j - 1] tells us if the pattern contains a prefix that mathes the suffix
                }
            } else {
                j++
                i++
            }
            if (j == needle.length) return i - j
        }
        return -1
    }

    private fun buildLongestSubstringPrefixArray(needle: String): IntArray {
        val longestSubstringPrefix = IntArray(needle.length)
        longestSubstringPrefix[0] = 0 //because there is no element before 0th element where prefix matches the suffix
        var i = 0
        var j = 1

        while (j < needle.length) {
            if (needle[i] == needle[j]) {
                longestSubstringPrefix[j] =
                    i + 1 // this means that array until jth position has a prefix of length i+1 that matches a suffix
                i++
                j++
            } else {
                if (i - 1 < 0) {
                    i = 0 // because a negative i is not a valid array position
                    j++
                } else {
                    i = longestSubstringPrefix[i - 1] // not sure why, but that's the algo
                }
            }
        }
        return longestSubstringPrefix
    }

    fun naiveApproachFindSubstringInString(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        for (i in haystack.indices) {
            if (haystack[i] == needle[0]) {
                var t = i + 1
                var j = 1
                while (t < haystack.length && j < needle.length) {
                    if (haystack[t] == needle[j]) {
                        t++
                        j++
                    } else
                        break
                }
                if (j == needle.length) return i
            }
        }
        return -1
    }

    fun buildlps(needle: String): IntArray {
        val lps = IntArray(needle.length)
        var I = 0
        var J = 1
        lps[0] = 0 //because there is no prefix that is also suffix until this point

        while (J < needle.length) {
            if (needle[I] == needle[J]) {
                // because we want to skip our comparions until ith character in the pattern string as that
                // part is already matched by the suffix we found later in the pattern
                lps[J] = I + 1
                J++
                I++
            } else {
                if (I != 0)
                    I = lps[I - 1] //weird rule
                else
                //because i is at the start of the array and cannot be moved further back and
                //and there is no match of the ith and jth characters
                    lps[J++] = 0
            }
        }
        return lps
    }

    fun str22(haystack: String, needle: String): Int {
        if(needle.isEmpty()) return 0
        var I = 0
        var J = 0
        val lps = buildlps(needle)
        println(lps.contentToString())
        while (I < haystack.length && J < needle.length) {
            if (haystack[I] == needle[J]) {
                I++
                J++
            } else {
                if (J != 0)
                    J = lps[J - 1]
                else
                    I++
            }
        }
        return if (J == needle.length) I - needle.length else -1
    }
}