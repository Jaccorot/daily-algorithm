package sorts;

public class SelectSort {
    public static void selectSort(int[] arr) {
        int min_index;
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            min_index = i;
            for (int j = i + 1; j<arr.length;j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] tmp = {10,20,15,0,0,6,7,2,1,-5,55,0};
        selectSort(tmp);
        for (int i : tmp) {
            System.out.println(i);
        }
    }
}
