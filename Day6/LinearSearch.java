package Day6;

public class LinearSearch {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={3,5,2,7,4,10,56,87};
        int key =10;
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.println("Element is not found.");
        }
        else
        {
            System.out.println("Element is found at "+ index);
        }
    }
}
