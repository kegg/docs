public class Today {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("You need to specify a name!");
      System.exit(1); 
    }
    System.out.print("Today is going to be a great day ");
    System.out.println(args[0]);
  }

}