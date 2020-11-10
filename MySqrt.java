class MySqrt {
    /**
     * 计算并返回 x 的平方根，其中 x 是非负整数。
     * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
     * https://leetcode-cn.com/problems/sqrtx/
     */
    public int mySqrt(int x) {
        int ret = 1;
        for (int i = 1; i > 0; i ++) {
            long sum = (long)i * i;
            if (sum == x) {
                ret = i;
                break;
            }
            if (sum > x) {
                ret = i - 1;
                break;
            }
        }

        return ret;
    }
    
}