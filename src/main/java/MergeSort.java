public class MergeSort {
    public static void main(final String[] args) {
        int[] array = {9, 1, 5, 3, 4, 2, 6, 8, 7};
        sort(array);
        for (int a :array
             ) { System.out.print(a + "  ");

        }

    }

    public static void sort(int[] array) {
        for (int gap = 1; gap < array.length; gap *= 2) {
            mergePass(array, gap, array.length);
        }
    }

    public static void mergePass(int[] array, int gap, int length) {
        int i = 0;

        for (i = 0; i + 2 * gap - 1 < length; i = i + 2 * gap)
            merge(array, i, i + gap - 1, i + 2 * gap - 1);

        if (i + gap - 1 < length)
            merge(array, i , i + gap - 1, length - 1);
    }
    public static void merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
                k++;
            } else {
                temp[k] = array[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = array[j];
            j++;
            k++;
        }

        for (k = 0, i = low; i <= high; i++, k++) {
            array[i] = temp[k];
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

}
