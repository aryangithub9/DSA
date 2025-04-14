package DSA;

public class Dsa {

    public static boolean dividedbyitsdigit(int number){
        while (number<0) {
            int digit = number%10;
            if(digit==0 || number%digit!=0){
                return false;
            }
            number = number/10;
        }
        return true;
        
    }


    public static int reverseofanumber(int number){
        int reversenum = 0;
        while (number>0) {
            int digit = number%10;
            reversenum = reversenum * 10 + digit;
            number = number/10;
        }
        return reversenum;
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(reverseofanumber(num));  // Output: true
    }
}
