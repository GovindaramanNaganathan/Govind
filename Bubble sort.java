public class Main
{ 
   void bubbleSort(int[] arrNum)
   {
      int num = arrNum.length;
      for(int a = 0; a < num - 1; a++)
      {
         for(int b = 0; b < num - a - 1; b++)
         {
            if(arrNum[b] > arrNum[b + 1])
            { 
               int temp = arrNum[b];
               arrNum[b] = arrNum[b + 1];
               arrNum[b + 1] = temp;
            }
         }
      }
   }

   void printingArray(int[] printArr)
   {
      int number = printArr.length;
      for(int a = 0; a < number; ++a)
      System.out.print(printArr[a] + " ");
      System.out.println();
   }

   public static void main(String[] args) 
   { 
      Main bs = new Main();
      int[] arrSort = {168, 179, 181, 142, 120, 204};
      bs.bubbleSort(arrSort);
      System.out.println("Sorted Array : ");
      bs.printingArray(arrSort);
   }
}

