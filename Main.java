public String LUS(String str){
    Set<Character> seen = new HashSet<>();
    int start = 0;
    int end = 0;
    String longest = "";

    for(int i = 0;i < str.length();i++){
        if(!seen.contains(str.charAt(i))){
            seen.add(str.charAt(i));
            end++;
        }else{
            seen.remove(str.charAt(start));
            start++;
        }
        if(end - start > longest.length()){
            longest = str.substring(start,end);
        }
    }
    return longest;
}