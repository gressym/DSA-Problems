package Day1;

import java.util.Scanner;

public class Pallindrome {

    public static int reverseNumber(int num){
        int revnum=0; 
        while(num!=0){
            revnum=revnum*10+(num%10);
            num=num/10;
        }
        return revnum;
    }
    
    public static boolean checkPallindrome(int num){
        int revnum=reverseNumber(num);
        if(revnum == num){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int number=sc.nextInt();
            boolean res= checkPallindrome(number);
            if(res==true){
                System.out.println("It is Pallindrome.");
            }
            else{
                System.out.println("It is not Pallindrome.");
            }
            sc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid Input.Please enter correct integer.");
        }
        
    }
}
