public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(ReverseInteger.solution( -2147483648 ));
    }

    /**
    * Given a 32-bit signed integer, reverse digits of an integer.
    */
    public static int solution(long i) {
        if ( i == 0) return 0;
        boolean isNegative = i < 0 ? true : false;
        if ( isNegative ) i = -i;

        while ( i % 10 == 0 ) {
            i = i / 10;
        }

        char[] result = new char[(i + "").length()];
        char[] nums = (i + "").toCharArray();
        for (int index = 0; index < result.length; index ++) {
            result[index] = nums[nums.length - index -1];
        }
        System.out.println(String.copyValueOf(result));
        double res = Double.parseDouble(String.copyValueOf(result));

        if ( res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        return (int)(res * ( isNegative ? -1 : 1));
    }

    public int betterSolution(int x) {
        int res = 0;
        while (x != 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
            if (Integer.MAX_VALUE / 10 < Math.abs(res)) {
                return 0;
            }
        }
        return res;
    }
}