

/**
 * @Author: Hao Qin
 * @Date: 20-2-4  下午3:56
 * @Version 1.0
 */
public class TwoSum {

    public static int[] call(int[] a, int b) {
        int l = a.length;
        int[] aa = new int[l];
        int i, j;
        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    aa[0] = i;
                    aa[1] = j;
                }
            }
        }
        return aa;
    }

    public static void main(String[] args) {

        int[] num = {7, 11, 8, 1};
        int target = 9;
        System.out.println(call(num, target)[0]);
        System.out.println(call(num, target)[1]);
    }
}
