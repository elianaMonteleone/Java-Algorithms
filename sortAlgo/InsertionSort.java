
/**
 * The INSERTION SORT Algorithm works with small dimension of array.
 * The idea is to check if a value in the array is bigger than the other, and shift it to the right side.
 * So, if the element to the left side, is bigger than the element on the right side, it must be shifted. 
 * 
 * A = [2,4,6,3,5,9] -> 6 > 3 so it will be [2,4,3,6,5,9] and etc. (4 >3, 6 > 5) until we have a sorted ascending list.
 * 
 */

 public class InsertionSort{

    public static void insertionSort(int [] a){
        int N = a.length;
    
        //the array starts with 0, but in this case we have to check if the value on the right side is smaller than the one on the left side.
        for(int i = 1; i < N; i++){
            
            //starting from position 1, so we can always check with the left side
            int valueOnTheRight = a[i];
            //this is the value that we have to check if it's bigger than the one on the left
            int valueOnTheLeft = i - 1;

            System.out.println("position in the left before while loop :" +  valueOnTheLeft);
            System.out.println("value in the left before while loop :" +  a[valueOnTheLeft]);
            while((valueOnTheLeft > -1) && (a[valueOnTheLeft] > valueOnTheRight)){
                
                //in the position left + 1 we are going to switch and add the bigger value 4(left) > 2(right) so the left is going to be positionated in left+1 (1 instead of 0) and 0 for the 2 value.
                a[valueOnTheLeft + 1] = a[valueOnTheLeft];
                
                //this is needed to do a step back as position
                valueOnTheLeft--;
            }
            a[valueOnTheLeft + 1] = valueOnTheRight;
        }
    
    }
    
    
    
    public static void main(String [] args){
    
        int [] a = {4,2,5,3,7,9};
    
        System.out.println("Before Insertion Sort");    
        for(int i:a){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(a);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:a){    
            System.out.print(i+" ");    
        }    
    }    
    
}

