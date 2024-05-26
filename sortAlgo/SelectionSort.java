/**
 * Find the lowest element and arrange it in the proper location.
 */

public class SelectionSort {
    

    public static void selectionSort(int[]a){
        int N = a.length;


        for (int i = 0; i < N - 1; i++){


            int lenghtArray = N -1;
            System.out.println("LenghtArray - 1 :" + " " + lenghtArray);

            int index = i;

            System.out.println("Value of index before second for loop:" + " " + index);

            for(int j = i + 1; j< N; j++){
                if(a[j] < a[index]){
                    index = j;

                    System.out.println("Value of index in the if condition:" + " " + index);
                }
            }

            int smaller = a[index];

            System.out.println("Value of smaller:" + " " + smaller);

            
            System.out.println("Value of a[i]:" + " " + a[i]);

            a[index] = a[i];

            System.out.println("Value of a[index]:" + " " + a[index]);
            a[i] = smaller;
        }
    }


    public static void main(String[] args) {

        int [] a = {4,2,5,3,7,9};
    
        System.out.println("Before Selection Sort");    
        for(int i:a){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        selectionSort(a);//sorting array using selection sort    
           
        System.out.println("After Selection Sort");    
        for(int i:a){    
            System.out.print(i+" ");    
        }    
        
    }
}
