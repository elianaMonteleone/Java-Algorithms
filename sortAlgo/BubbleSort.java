/**
 * In bubble sort algorithm, array is traversed from first element to last element. 
 * Here, current element is compared with the next element. If current element is greater than the next element, it is swapped.
 */

public class BubbleSort {
    

    public static void bubbleSort(int [] a){
        int N = a.length;


        int current = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(a[j] < a[i]){
                    current = a[j];
                    a[j] = a[i];
                    a[i] = current;
                }
            }
        }
    }


    public static void main(String[] args) {
        

        int a[] ={3,60,35,2,45,320,5};  
                 
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < a.length; i++){  
                System.out.print(a[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(a);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < a.length; i++){  
                System.out.print(a[i] + " ");  
        }  
    }
}
