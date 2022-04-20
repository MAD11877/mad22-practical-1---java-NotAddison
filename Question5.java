import java.util.ArrayList; // For ArrayLists
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    System.out.print("How many numbers do you want? ");
    int repetion = in.nextInt();

    // Get User Inputs (numbers)
    for (int i = 0; i < repetion; i++) {
      System.out.print("Type a number: ");
      numbers.add(in.nextInt());
    }
    in.close(); // Close Scanner to prevenet Resource Leak (Inputs no longer required)

    // Find Mode 
    int highest = 0;
    int mode = 0;

    for (Integer integer : numbers) {
      int count = 0;
      for (Integer integer2 : numbers) {
        if (integer == integer2) {
          count++;
        }
      }

      // Check if current count is greater than prev count
      if (count > highest) {
        highest = count;
        mode = integer;
      }
      else if (count == highest){ // Bimodal Case
        continue;
      }
    }
    
    System.out.println("\nMode: " + mode);
  }
}
