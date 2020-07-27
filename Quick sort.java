package quicksortjava;

public class QuickSortJava {
    public static void main(String[] args) {
        int test[] = { 168, 179, 181, 120, 142, 204 };
       
        System.out.println("Before sorting : ");
        print(test);
 
        quickSort(test, 0, test.length - 1);
 
        System.out.println("After sorting : ");
        print(test);
     
    
    }

    private static void print( int[] A)
    {
        for(int i = 0 ; i < A.length ; i++)
            System.out.println(A[i]);
    }

    private static void quickSort( int A[], int first, int last ) 
    {
        int pivotElement;
 
        if(first < last)
        {
           pivotElement = pivot(A, first, last);
           quickSort(A, first, pivotElement-1);
           quickSort(A, pivotElement+1, last);
        }
    }
    private static int pivot( int A[], int first, int last ) 
    {
        int  p = first;
        int pivotElement = A[first];
 
        for(int i = first+1 ; i <= last ; i++)
        {
            if(A[i] <= pivotElement)
            {
                p++;
                swap(A, i, p);
            }
        }
 
            swap(A, p, first);
 
        return p;
    }
 
    private static void swap(int A[], int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
 
}

