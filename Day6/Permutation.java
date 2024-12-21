package Day6;
import java.util.*;
public class Permutation {
    public static int isPermutation(String str1,String str2){
        char []strArr1=str1.toCharArray();
        char []strArr2=str2.toCharArray();
        
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        
        if(Arrays.equals(strArr1,strArr2)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        
        String str1="sample";
        String str2="plysam";
        System.out.println(isPermutation(str1,str2));
        
    }
}
