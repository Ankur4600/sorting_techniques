package sorting_techniques;

import java.util.Scanner;
//program for selection sorting
public class selection_sort {
    static void selection(int array[],int n){
        for(int i=0;i<n; i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    int tmp=array[j];//swaping array element
                    array[j]=array[i];
                    array[i]=tmp;
                } 
            }   
        }
        System.out.print(" the sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter the size of array: ");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element of array :");
        for( int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       //calling the method
        selection(arr,size);
    }
    
}
