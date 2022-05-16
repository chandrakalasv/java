import java.util.Scanner;

public class Username {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the user name");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);
  }
}
