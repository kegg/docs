public class HowAboutNo {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("You need to specify a NUMBER");
      System.exit(1);
    } else if (args.length > 1) {
      System.err.print("You speciifed more than"); 
      System.err.print(" ONE argument. Only ONE");
      System.err.println(" argument is allowed.");
      System.exit(1);
    } else {
      String someString = args[0];
      boolean isNumeric = 
        someString.chars().allMatch( Character::isDigit );
      if (!isNumeric) {
        System.err.println("You need to specify a NUMBER");
        System.exit(1);
      }

      for (int i = 1; i <= Integer.valueOf(args[0]); i++) {
        System.out.println("How About No!");
      }
    }
  }

}
