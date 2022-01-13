function solution(new_id) {
    var answer = '';
    // Step 1
    new_id = new_id.toLowerCase();
    // Step 2
    new_id = new_id.replace(/[^a-z0-9\-\_\.]/g,'');
    // Step 3
    while(true)
    {
        if(new_id.includes('..'))
        {
            new_id = new_id.replace('..','.');
        }
        else
        {
            break;
        }
    }
    // Step 4
    if(new_id.charAt(0)=='.')
    {
        new_id = new_id.replace('.','');
    }
    if(new_id.charAt(new_id.length-1)=='.')
    {
        new_id = new_id.slice(0,-1);
    }
    // Step 5
    if(new_id=='')
    {
        new_id = 'a';
    }
    // Step 6
    if(new_id.length>=16)
    {
        new_id = new_id.substring(0,15);
        if(new_id.charAt(new_id.length-1)=='.')
    {
        new_id = new_id.slice(0,-1);
    }
    }
    // // Step 7
    if(new_id.length<=2)
    {
        while(new_id.length<3)
        {
            new_id = new_id+new_id[new_id.length-1];
        }
    }
    answer = new_id;
    return answer;
}