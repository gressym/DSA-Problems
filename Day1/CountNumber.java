package Day1;

import java.util.*;
public class CountNumber{

    int countDigits(int n){
        int cnt=(int)(Math.log10(n)+1); 
        return cnt;
    }

    int brouteForce(int n){
        int count=0;
            while(n>0)
            {
                count++;
                n=n/10;
            }
        return count;
    }
    
    public static void main(String[]args){
        System.out.println("Let's Start Dsa practice...!");
        Scanner sc=new Scanner(System.in);
        int n;
        try{
            n=sc.nextInt();
            CountNumber obj=new CountNumber();

            int digit=obj.countDigits(n);
            System.out.println(digit);

        }
        catch(Exception e){
            System.out.println("Invalid Input.Plese enter correct integer value.");
        }
        
        sc.close();
    }
}