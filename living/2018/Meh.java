import java.util.Arrays;

public class Meh {

  public static final String[] lines = {
    "              Meh                ",
    "---------------------------------",
    "Why does life have to be this way",
    "it doesn't always seem to matter;",
    "yet here we are waiting for something.",
    "",
    "I hear there are things in this world",
    "a life which cannot be broken",
    "yet here we all are broken",
    "long before it all ends",
    "",
    "Oh what a life...a reason to not",
    "understand or grasp its meaning",
    "somedays I just write, the words flow."
  };

  public static void main(String[] args) {
    Arrays.stream(lines)
      .forEach(System.out::println);
  }

}
