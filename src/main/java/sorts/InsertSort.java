package sorts;

public class InsertSort {
    public static void insertSort(int[] arr) {
        int size = arr.length;
        int temp=0;
        int j=0;

        for (int i = 0; i < size; i++) {
            temp = arr[i];
            for (j = i; j >0 && temp <arr[j-1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] tmp = {10,20,15,0,0,6,7,2,1,-5,55,0};
        insertSort(tmp);
        for (int i : tmp) {
            System.out.println(i);
        }


    }
}
