package Day3;

import java.util.Scanner;

public class BinomialCoeficient {

    public static float binCoeff(int n,int r){
        int a=factorial(n);
        int b=factorial(r);
        int c=factorial(n-r);
        return a/(b*c);
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
           fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(binCoeff(n,r));
        sc.close();
    }
}
