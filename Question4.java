import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    // System.out.println("Enter the number of * for the base of the Triangle: ");
    int base = in.nextInt();
    in.close(); // Close Scanner to prevenet Resource Leak
    String c = "*"; //Char to print repeatedly

    do{
      System.out.println(c.repeat(base)); // Just repeats the character x number of times based on the user input
      base--;
    }
    while(base!=0);
    
  }
}
