package Day5;

// import java.util.Arrays;
// import java.util.Collections;

public class BasicSorting{
    public static void bubbleSort(int arr[]){ 
        for(int itr=0;itr<(arr.length-1);itr++){//for n-1 iterations indexing starts from 0
            int swap=0;
            for(int j=0;j<(arr.length-1-itr);j++){
                if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                      arr[j+1]=arr[j];
                     arr[j]=temp;
                     swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }

    //selection sort
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
             int min=i;
             for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
             }
             //swap
             int temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
        }
    }

    //insertion sort
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
              int curr=arr[i];
              int prev=i-1;
              //finding out correct position to insert
              while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
              }
            arr[prev+1]=curr;
        }
    }

    //counting sort
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //count array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        } 
    
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        //bubbleSort(arr);
        //selectSort(arr);
        //insertionSort(arr);
        //Arrays.sort(arr);
        //printArr(arr);
        //System.out.println();
        //Arrays.sort(arr,Collections.reverseOrder());

        countingSort(arr);
        printArr(arr);
    }
}
