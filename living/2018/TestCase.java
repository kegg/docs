public class TestCase {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Nope!");
      System.exit(1);
    }
    String val = args[0];
    switch (val) {
      case "one":
        boolean found = false;
        break;
      case "two":
        boolean found = true;
        break;
      default:
        break;
    }
  }

}
