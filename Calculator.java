import java.util.Scanner;
public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int num1 = sc.nextInt();
    System.out.println("enter the second number");
    int num2 = sc.nextInt();
    int result = num1 + num2;
    int result1 = num1 - num2;
    int result2 = num1 * num2;
    int result3 = num1 / num2;
    System.out.println("result of addition is  " + result);
    System.out.println("result of subtraction is  " + result1);
    System.out.println("result of multiplication is  " + result2);
    System.out.println("result of division is  " + result3);
  }
}
