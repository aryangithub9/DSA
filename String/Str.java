package String;
public class Str {
        public static String reversevowelsinString(String str){
            int left = 0;
            int right = str.length()-1;
            char [] chars = str.toCharArray();
            String vowels = "aeiouAEIOU";

            while (left<right) {
                if(vowels.indexOf(chars[left])==-1){
                    left++;
                }

                if(vowels.indexOf(chars[right])==-1){
                    right--;
                }
                char temp = chars[left];
                chars[left]=chars[right];
                chars[right] = temp;
                left++;
                right--;    
            }

            return new String(chars);
        }
    public static void main(String[] args) {
        String name = "Aryan";
        System.out.println(reversevowelsinString(name));
        
    }
}