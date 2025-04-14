package Recursion;

import java.util.HashMap;

public class Demo {
    public static boolean anagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2=  str2.toLowerCase();
        HashMap<Character,Integer> forstr1 = new HashMap<>();
        for( int i =0; i<str1.length(); i++){
            if(forstr1.containsKey(str1.charAt(i))){
                forstr1.put(str1.charAt(i), forstr1.get(str1.charAt(i))+1);
            }
            else{
                forstr1.put(str1.charAt(i), 1);
            }
        }
        HashMap<Character,Integer> forstr2 = new HashMap<>();
        for( int i =0; i<str2.length(); i++){
            if(forstr2.containsKey(str2.charAt(i))){
                forstr2.put(str2.charAt(i), forstr2.get(str2.charAt(i))+1);
            }
            else{
                forstr2.put(str2.charAt(i), 1);
            }
        }
        if(forstr1.equals(forstr2)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(anagrams("aryan", "nayra"));
        
    }
}