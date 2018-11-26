import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        if (numbers == null || numbers.length < 2)
            return array;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                array[0] = map.get(target - numbers[i]);
                array[1] = i + 1;
                break;
            }
            map.put(numbers[i], i + 1);
        }

        return array;
    }
}
