package Day8;

public class MyString {
    public static String substring(String str,int si,int ei){
        String substr= "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    } 

    public static String largestString(String str[]){
        String largest=str[0];
          for(int i=1;i<str.length;i++){
              if(largest.compareToIgnoreCase(str[i]) < 0 ){
                largest=str[i];
              }
          }
          return largest;
    }

    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(substring(str, 0, 5));
        System.out.println(str.substring(0,3));

        String fruits[]={"apple","mango","banana"};
        System.out.println(largestString(fruits));
        String str1="gressy";
        str1="Pranjal";
        System.out.println(str1);
    }
}
