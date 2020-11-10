public class Atoi {
    public static void main(String[] args) {
        System.out.println(Atoi.solution( "-2147483648" ));
    }

    /**
    * Implement atoi which converts a string to an integer.
    * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
    * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
    * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
    * If no valid conversion could be performed, a zero value is returned.
    */
    public static int solution(long i) {
        long ret = 0;
        boolean isPositive = true;
        boolean isStarted = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!isStarted)
                    continue;
                else
                    break;
            } else if (str.charAt(i) == '-') {
                if (isStarted) {
                    break;
                }
                isPositive = false;
                isStarted = true;
            } else if (str.charAt(i) == '+') {
                if (isStarted) {
                    break;
                }
                isPositive = true;
                isStarted = true;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if (!isStarted) {
                    isStarted = true;
                }
                ret = ret * 10 + (str.charAt(i) - '0');

                if (ret > Integer.MAX_VALUE) {
                    return (isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                }
            } else {
                break;
            }
        }

        return (int)(isPositive ? ret : -ret);
    }

    public int betterSolution(int x) {
    }
    
}