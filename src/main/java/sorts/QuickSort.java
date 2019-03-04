package sorts;

public class QuickSort {
    public static int getMiddle(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high) {
            while (low < high && temp <= arr[high]) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && temp >= arr[low]) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int middle = getMiddle(arr, low, high);
            quickSort(arr, low, middle-1);
            quickSort(arr, middle+1, high);
        }
    }

    public static void main(String[] args) {
        int[] tmp = {10,20,15,0,0,6,7,2,1,-5,55,0};
        quickSort(tmp, 0,tmp.length-1);
        for (int i : tmp) {
            System.out.println(i);
        }
    }
}
