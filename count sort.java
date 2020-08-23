import java.util.*;
import java.util.Scanner;

public class Main {
 
   public static void main(String[] args) {
      int[] arr1 = {99, 77, 55, 33, 11, 88, 66, 44, 22};
      System.out.println("Unsorted: " + Arrays.toString(arr1));
 
      int[] arr2 = countingSort(arr1);
      System.out.println("Sorted  : " + Arrays.toString(arr2));
   }
 
   public static int[] countingSort(int[] arr) {
 
      int[] counting = new int[arr.length];
 
      int min = arr[0];
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < min) {
            min = arr[i];
         } else if (arr[i] > max) {
            max = arr[i];
         }
      }
 
      int[] counts = new int[max - min + 1];
 
      for (int i = 0; i < arr.length; i++) {
         counts[arr[i] - min]++;
      }
 
      counts[0]--;
      for (int i = 1; i < counts.length; i++) {
         counts[i] = counts[i] + counts[i - 1];
      }
 
      for (int i = arr.length - 1; i >= 0; i--) {
         counting[counts[arr[i] - min]--] = arr[i];
      }
 
      return counting;
   }
}
