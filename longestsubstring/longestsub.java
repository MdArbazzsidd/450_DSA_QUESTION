package longestsubstring;

import java.util.HashSet;

public class longestsub {
    public int lengthOfLongestSubstring(String s){
        int a_pointer = 0;
        int b_pointer =0;
        int max=0;
       
        HashSet<Character> stirngadded = new HashSet<>();
        
        while(b_pointer < s.length()){
            
            char currentChar= s.charAt(b_pointer);
            if(currentChar == ' '){
                b_pointer++;
                continue;
            }

            if(!stirngadded.contains(s.charAt(b_pointer))){
                stirngadded.add(s.charAt(b_pointer));
                b_pointer++;
                max=Math.max(max,stirngadded.size());
            }else{
                stirngadded.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        longestsub ls = new longestsub();

        String s1= "hey what happen";

        System.out.println("test : " + s1 + "-> " + ls.lengthOfLongestSubstring(s1));
    }
}
