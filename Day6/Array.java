package Day6;

public class Array{
    
    public static void update(int marks[],int unchangable){
        unchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={56,87,58,98};
        char character[]={'a','e','i','o','u'};
        String fruit[]=new String[10];
        int unchangable=5;

        update(marks,unchangable);
        System.out.println(unchangable);
        
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }

}
