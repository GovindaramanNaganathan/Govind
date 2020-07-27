public class Main
{ 
   public void sort(int arrNum[])
   {
      int number = arrNum.length; 
      for(int i = 1; i < number; ++i) 
      { 
         int Value = arrNum[i]; 
         int j = i - 1;
         while(j >= 0 && arrNum[j] > Value) 
         { 
            arrNum[j + 1] = arrNum[j]; 
            j = j - 1; 
         } 
         arrNum[j + 1] = Value; 
      } 
   }

   static void displayArray(int arr[]) 
   { 
      int num = arr.length; 
      System.out.print("Sorted Array:\n");
      for(int i = 0; i < num; ++i)
      {
          System.out.print(arr[i] + " ");
      }
   }

   public static void main(String[] args) 
   { 
      int[] arrInput = { 168, 179, 181, 142, 120, 204  };
      Main obj = new Main(); 
      obj.sort(arrInput);
      displayArray(arrInput);
   }
}



