package sorts;

public class BubbleSort {


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] tmp = {10,20,15,0,0,6,7,2,1,-5,55,0};
        bubbleSort(tmp);
        for (int i : tmp) {
            System.out.println(i);
        }


    }
}
