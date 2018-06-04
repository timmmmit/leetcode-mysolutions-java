import java.util.HashMap;;

public class UniqueMorseCode {
  public static void main( String[] args ) {
    String[] words = new String[] { "gin", "zen", "gig", "msg" };
    System.out.println(UniqueMorseCode.solution( words ));
  }

  /**
  * given a list of words, each word can be written as a concatenation of the Morse code of each letter. 
  * For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). 
  * We'll call such a concatenation, the transformation of a word.
  * Return the number of different transformations among all words we have.
  * https://leetcode.com/problems/unique-morse-code-words/description/ for more information.
  */
  public static int solution( String[] words ) {
    String[] morseCodeTable = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    HashMap<String , String> map = new HashMap<String , String>();

    for ( String word : words ) {
      char[] chars = word.toCharArray();
      String str = "";
      for ( char ch : chars ) {
        str += morseCodeTable[ ch - 'a'];
      }
      map.put(str, str);
    }
    
    return map.size();
  }

  public int betterSolution( int x ) {
      int res = 0;
      return res;
  }
}