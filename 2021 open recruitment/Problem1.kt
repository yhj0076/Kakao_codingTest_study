fun main() {
    // 아이디 입력. 여기서는 이미 입력 된 걸로 친다.
    println("아이디를 입력해 주십시오 : ")
    var UserID  = "abcdefghijklmn.p"
    solution(UserID)
}
fun solution(UserID:String)
{
    // step 0
    var newUserID = UserID
    var filteringCount = 0
    println(""+filteringCount + " : " + newUserID)
    filteringCount++

    //step 1
    newUserID = UserID.toLowerCase()
    println(""+filteringCount + " : " + newUserID)
    filteringCount++

    //step 2
    var deleteCharList = "~!@#$%^&*()=+[{]}:?,<>/…"
    var newID_Length = newUserID.length
    var delCharList_Length = deleteCharList.length
    var newUserID2 = newUserID
    for(i in 0 until newID_Length-1)
    {
        for(j in 0 until delCharList_Length-1)
        {
            if (newUserID[i] == deleteCharList[j])
            {
                newUserID2 = newUserID2.replace(""+deleteCharList[j],"")
            }
        }
    }
    println(""+filteringCount + " : " + newUserID2)
    filteringCount++

    //step 3
    while(newUserID2.indexOf("..") != -1)
    {
        newUserID2 = newUserID2.replace("..",".")
        newID_Length = newUserID2.length
    }
    println(""+filteringCount + " : " + newUserID2)
    filteringCount++

    //step 4
    if(newUserID2[0] == '.')
    {
        if(newUserID2 == ".")
        {
            newUserID2 = ""
            newID_Length = 0
        }
        else
        {
            newUserID2 = newUserID2.substring(1,newID_Length)
            newID_Length = newUserID2.length
        }
    }
    if(newUserID2 != "")
    {
        if(newUserID2[newUserID2.length-1] == '.')
        {
            newUserID2 = newUserID2.substring(0,newID_Length-1)
            newID_Length = newUserID2.length
        }
    }
    println(""+filteringCount + " : " + newUserID2)
    filteringCount++

    //step 5
    if(newUserID2 == "")
    {
        newUserID2 = "a"
        newID_Length = newUserID2.length
    }
    println(""+filteringCount + " : " + newUserID2)
    filteringCount++

    //step 6
    if(newUserID2.length >= 16)
    {
        newUserID2 = newUserID2.substring(0,15)
        newID_Length = newUserID2.length
    }
    if(newUserID2[newUserID2.length-1] == '.')
    {
        newUserID2 = newUserID2.substring(0,newID_Length-1)
        newID_Length = newUserID2.length
    }
    println(""+filteringCount + " : " + newUserID2)
    filteringCount++

    //step 7
    while(true)
    {
        if(newID_Length < 3)
        {
            newUserID2 = newUserID2+newUserID2[newID_Length-1].toString()
            newID_Length = newUserID2.length
        }
        else
        {
            break
        }
    }
    println(""+filteringCount + " : " + newUserID2)
    filteringCount++

}