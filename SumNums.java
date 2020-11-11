class SumNums {
    /**
     * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句
     *
     * 这道题2个点：
     * 不能用for循环
     * 不能用if运算
     * 如何解决：
     * for用递归实现
     * if用逻辑运算符的计算特性来解决。即&&的短路特性。
     */
    public int sumNums(int n) {
        int res = n;
        boolean i = n > 0 && (res += sumNums(n-1)) > 0;
        return res;
    }
}