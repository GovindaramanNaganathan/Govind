import java.util.Arrays;
 
class Main
{
    public static void merge(int[] intArray, int[] temp, int start, int mid, int end)
    {
        int k = start, i = start, j = mid + 1;
        while (i <= mid && j <= end) {
            if (intArray[i] < intArray[j]) {
                temp[k++] = intArray[i++];
            } else {
                temp[k++] = intArray[j++];
            }
        }
 
        while (i <= mid) {
            temp[k++] = intArray[i++];
        }
 
        for (i = start; i <= end; i++) {
            intArray[i] = temp[i];
        }
    }
    public static void mergeSort(int[] intArray)
    {
        int low = 0;
        int high = intArray.length - 1;
 
        int[] temp = Arrays.copyOf(intArray, intArray.length);
 
        for (int m = 1; m <= high - low; m = 2*m)
        {
            for (int i = low; i < high; i += 2*m)
            {
                int start = i;
                int mid = i + m - 1;
                int end = Integer.min(i + 2 * m - 1, high);
                merge(intArray, temp, start, mid, end);
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] intArray = { 179, 168, 204, 120, 181, 142 };
        System.out.println("Unsorted Array : " + Arrays.toString(intArray));
        mergeSort(intArray);
        System.out.println("Sorted Array : " + Arrays.toString(intArray));
    }
}

