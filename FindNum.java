public class FindNum {
    public static void main(final String[] args) {

    }

    public boolean find(int target, int[][] array) {
        if (array == null || array.length == 0 )
            return false;
        boolean ans = false;
        for (int i = 0; i < array.length; i++) {
            if (target <= array[i][array[i].length - 1] && target >= array[i][0])
                ans = check(array[i], target);
        }


        return ans;
    }

    public boolean check(int[] array, int target) {
        int left = 0;
        int right  = array.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target  == array[mid])
                return true;
            if (target < array[mid])
                right = mid;
            if (target > array[mid])
                right = mid;
        }
        return false;
    }

}
