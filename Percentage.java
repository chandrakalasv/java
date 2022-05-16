import java.util.Scanner;
public class Percentage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the total marks");
    float totalmarks = sc.nextFloat();
    System.out.println("enter the your marks");
    float scored = sc.nextFloat();
    percentageOfMarks(totalmarks,scored);
  }

  public static void percentageOfMarks(float totalmarks, float scored) {
     float percentage = ((scored / totalmarks) * 100);
     System.out.println("your percentage is " + percentage);
  }
}

