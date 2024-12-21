package Day4;

public class HollowRactangle {
    public static void printHollowRactangle(int r,int c){
        //int [][]arr=new int[r][c];
        for (int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c ){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printHollowRactangle(5,5);
    }
}
