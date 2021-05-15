class Solution {
    fun isPalindrome(s:String):Boolean
    {
        var original:MutableList<Char> = mutableListOf<Char>()
        if(s.length >1)
        {
            for (i in 0 until s.length) {
                if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] <= 'z' && s[i] >= 'a')) {
                    if ((s[i] >= 'A' && s[i] <= 'Z')) {
                        original.add(s[i] + 32)
                    } else {
                        original.add(s[i])
                    }
                }
            }
        }
        else
        {
            return false
        }

        var reverse:List<Char> = original.reversed()

        if(reverse == original)
        {
            return true
        }
        else
        {
            return false
        }
    }
}