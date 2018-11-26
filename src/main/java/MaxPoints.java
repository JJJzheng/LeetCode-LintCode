import java.util.HashMap;
import java.util.Map;

public class MaxPoints {
    public static void main(final String[] args) {

    }
    /**
     * http://www.lintcode.com/zh-cn/problem/max-points-on-a-line/
     * 用 map 处理，计算当前点和当前点之后的所有点的斜率
     * @param points
     * @return
     */
    public int maxPoints(Point[] points) {
        // write your code here
        if (points == null || points.length == 0)
            return 0;
        Map<Double, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            map.clear();

            map.put((double) Integer.MAX_VALUE, 1);
            int dup = 0;
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    dup++;
                    continue;
                }
                //计算斜率
                double key = points[j].x - points[i].x == 0 ?
                        Integer.MAX_VALUE :
                        0.0 + (double) (points[i].x - points[j].x) / (points[i].y - points[j].y);

                //是否包含当前斜率下的点，如果斜率相同就表示在用一条直线上，存在就在map当中存储一个新的value值
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else  {
                    map.put(key, 2);
                }
            }

            //当前 j 点遍历之后更新最大直线点
            for (int temp : map.values()) {
                if (temp + dup > max)
                    max = temp + dup;
            }
        }
        return max;
    }
}
