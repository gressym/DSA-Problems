package Day1;

import java.util.Scanner;

public class ReverseNumber {

    int reverseNumber(int n){
        int rnum=0;
        while(n>0){
             rnum=n%10+rnum*10;
             n=n/10;
        }

        return rnum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        ReverseNumber obj=new ReverseNumber();
        try {
            int n=sc.nextInt();
            int reversenum=obj.reverseNumber(n);
            System.out.println(reversenum);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalid Input.Please enter correct number.");
        }
        
        sc.close();
    }
}
