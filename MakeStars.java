import java.util.*;
public class MakeStars {
  public static void main(String[]args){
    Scanner n = new Scanner(System.in);
    String s = "";
    while (n.hasNextLine()) {
      Scanner linear = new Scanner(n.nextLine());
      while (linear.hasNext()) {
        s = linear.next();
        for (int i = 0; i < s.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
