package mergeorderedlist;

public class MergeOrderedList {

    public static void main(String[] args) {
        int[] temp1 = {1, 3, 5};
        int[] temp2 = {2, 3, 8};
        int[] result = mergeList(temp1, temp2);
        for (int temp : result) {
            System.out.print(temp+ " ");
        }
    }

    public static int[] mergeList(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;

    }
}
