import java.util.Scanner;
public class Calculator1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int num1 = sc.nextInt();
    System.out.println("enter the second number");
    int num2 = sc.nextInt();
    additionOfNum(num1,num2);
    subtractionOfNum(num1,num2);
    multiplicationOfNum(num1,num2);
    divisionOfNum(num1,num2);
  }
  public static void additionOfNum(int num1, int num2) {
    int result = num1 + num2;
    System.out.println("result of addition is  " + result);
  }
 public static void subtractionOfNum(int num1, int num2) {
    int result = num1 - num2;
    System.out.println("result of subtraction is  " + result);
  }
 public static void multiplicationOfNum(int num1, int num2) {
    int result = num1 * num2;
    System.out.println("result of multiplication is  " + result);
  }
 public static void divisionOfNum(int num1, int num2) {
    int result = num1 / num2;
    System.out.println("result of division is  " + result);
  }
}
