import java.util.Arrays;
import java.util.List;

public class CheckArray {

  public static void main(String[] args) {
    List<String> abcdLetters = Arrays.asList("A", "B", "C", "D");
    List<String> hijkLetters = Arrays.asList("H", "I", "J", "K");
    
    String inLetter = args[0];
    String result = args[0];
    
    if (abcdLetters.contains(inLetter)) {
      result = "ABCD";
    } else if (hijkLetters.contains(inLetter)) {
      result = "HIJK";
    }    
    
    System.out.println(result);
  }

}