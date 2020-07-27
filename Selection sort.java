
public class Main
{
    void selectionsort(int arr[], int n)
    {
    	for (int i = 0; i < n; i++)
    	{
    		int min = arr[i];
    		int index=i,j=0;
    		
    		for ( j = i+1; j < n; j++)
    		{
    			if (arr[j] < min)
    			{
    				min = arr[j];
    				index=j;
    			}
    		}
    		int temp=arr[i];
    		arr[i] = arr[index];
    		arr[index] = temp;
    	}
    }
    
    public static void main(String args[])
    {
    	int a[] = {168,179,181,142,120,204}, i;
    	Main obj = new Main();
    	obj.selectionsort(a,6);
    	System.out.println("Sorted Array:");
    	
    	for (i=0;i<6;i++)
    	{
    		System.out.print(a[i]+" ");
    	}
    }
}

