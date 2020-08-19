import java.util.Scanner;

public class Main{
	public static int max(int[] listVals){		
		int maxVal = listVals[0];
		for(int i=1; i<listVals.length;i++){
			if(maxVal<listVals[i]){
				maxVal = listVals[i];
			}
		}
		return maxVal;
	}
	public static void countingSort(int[] listVals, int n, int place){
		int integerRange = 10;
		int[] freq = new int[integerRange];
		for(int i=0;i<integerRange;i++){
			freq[i] = 0;
		}
		int[] listSorted = new int[n];
		for(int i=0;i<n;i++){
			listSorted[i]=0;
		}
		for(int i=0;i<n;i++){
			freq[(listVals[i]/place)%integerRange] += 1;
		}
		for(int i=1;i<integerRange;i++){
			freq[i] += freq[i-1];
		}
		int i = n-1;
		while(i>=0){
			listSorted[freq[(listVals[i]/place)%10]-1]=listVals[i];
			freq[(listVals[i]/place)%10] -= 1;
			i -= 1;
		}
		for(int j=0;j<n;j++){
			listVals[j] = listSorted[j];
		}
	} 

	public static void radixSort(int[] listVals){
		int n = listVals.length;
		int maxVal = max(listVals);
		int mulVal = 1;
		while(maxVal>0){
			countingSort(listVals, n, mulVal);
			mulVal *= 10;
			maxVal /= 10;
		}
	}
	    
	public static void main(String[] args){
	    int[] numberList, sortedList;
	    Scanner in = new Scanner(System.in); 
	    System.out.println("Enter numbers count: ");                   
	    int count = in.nextInt();                   
	    numberList = new int[count];
	    System.out.println("Enter numbers: "); 
	    for (int i=0;i<count;i++){
	    	numberList[i]=in.nextInt();
	    }
	    in.close();
	    radixSort(numberList);
	    
	    System.out.println("Sorted numbers: "); 
	    for(int number : numberList){
	    	System.out.print(number+"\t");
	    }
	}
}                                                                                                                                                                                                               
