public class JewelsAndStones {
    public static void main(String[] a) {
        System.out.println(JewelsAndStones.solution("", "aaaaa"));
    } 

    /**
     *  Given strings J representing the types of stones that are jewels, and S representing the stones you have.  
     *  Each character in S is a type of stone you have. 
     *  You want to know how many of the stones you have are also jewels.
     *  The letters in J are guaranteed distinct, and all characters in J and S are letters.
     *  Letters are case sensitive, so "a" is considered a different type of stone from "A".
     */
    public static int solution(String J, String S) {
        char[] arr = S.toCharArray();
        int ret = 0;
        for (int index = 0; index < arr.length; index ++ ) {
            if ( J.indexOf(arr[index] + "") != -1 ) {
                ret ++;
            }
        }
        return ret;
    }
}