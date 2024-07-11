package sorting_techniques;

import java.util.Scanner;
//program for insertion sort
public class insertion_sort {
    static void insertion(int arr[],int n){
        for(int i=0; i<n; i++){
            for(int j=i; j>0 ;j--){
                if(arr[j-1]>arr[j]){
                    int tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
        System.out.print("after sorting :");//for printing the array after sorting
        for(int i=0;i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //asking for size of array
        System.out.print("Enter the size of array :");
        int size= sc.nextInt();
        int array[]=new int[size];
        //asking for elements of array
        System.out.println("Enter the element of array :");
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        insertion(array,size);//calling the function
        
    }
}
