/***
 * Divide et impera
 * Merge sort is the sorting technique that follows the divide and conquer (impera) approach.
 * Merge sort is similar to the quick sort algorithm as it uses the divide and conquer approach to sort the elements. 
 * It divides the given list into two equal halves, calls itself for the two halves and then merges the two sorted halves.
 */

 /**
  * MERGE_SORT(arr, beg, end)  
  
    if beg < end  
    set mid = (beg + end)/2  
    MERGE_SORT(arr, beg, mid)  
    MERGE_SORT(arr, mid + 1, end)  
    MERGE (arr, beg, mid, end)  
    end of if  
    
    END MERGE_SORT  
  */

  import java.util.*;

  public class MergeSort {
  
      // Method to merge two subarrays L and R into arr
      public static void merge(int[] arr, int beg, int mid, int end) {
          // Find sizes of two subarrays to be merged
          int n1 = mid - beg + 1;
          int n2 = end - mid;
  
          // Create temporary arrays
          int[] L = new int[n1];
          int[] R = new int[n2];
  
          // Copy data to temporary arrays L[] and R[]
          for (int i = 0; i < n1; i++)
              L[i] = arr[beg + i];
          for (int j = 0; j < n2; j++)
              R[j] = arr[mid + 1 + j];
  
          // Merge the temporary arrays back into arr[beg..end]
          int i = 0, j = 0;
          int k = beg;
          while (i < n1 && j < n2) {
              if (L[i] <= R[j]) {
                  arr[k] = L[i];
                  i++;
              } else {
                  arr[k] = R[j];
                  j++;
              }
              k++;
          }
  
          // Copy the remaining elements of L[], if any
          while (i < n1) {
              arr[k] = L[i];
              i++;
              k++;
          }
  
          // Copy the remaining elements of R[], if any
          while (j < n2) {
              arr[k] = R[j];
              j++;
              k++;
          }
      }
  
      // Main function that sorts arr[beg..end] using merge()
      public static void mergeSort(int[] arr, int beg, int end) {
          if (beg < end) {
              int mid = (beg + end) / 2;
  
              // Sort first and second halves
              mergeSort(arr, beg, mid);
              mergeSort(arr, mid + 1, end);
  
              // Merge the sorted halves
              merge(arr, beg, mid, end);
          }
      }
  
      public static void main(String[] args) {
          int[] arr = { 12, 11, 13, 5, 6, 7 };
  
          System.out.println("Before Merge Sort");
          for (int i : arr) {
              System.out.print(i + " ");
          }
          System.out.println();
  
          mergeSort(arr, 0, arr.length - 1);
  
          System.out.println("After Merge Sort");
          for (int i : arr) {
              System.out.print(i + " ");
          }
      }
  }
  