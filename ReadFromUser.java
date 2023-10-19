import java.util.Scanner;
import java.util.ArrayList;
public class ReadFromUser {
  public static void main(String[] args) {

    System.out.print("Please, enter a number: ");
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> number = new ArrayList<Integer>();
    while (scanner.hasNextInt()) {
      number.add(scanner.nextInt());  
      System.out.print("Please, enter a number: ");   
    }

    System.out.println("Number of items entered before -1:  " + number.size());
    System.out.println("List of numbers entered: " + number);
    
    //Average 
    int total = 0;
    int average = 0;
    for (int i = 0; i < number.size(); i++) {
      total = total + number.get(i);
      average = total / number.size();     
    }

    //Odd numbers
    System.out.println("Odd numbers in the list: ");
    
 

    System.out.println("The sum of numbers is " + total);
    System.out.println("The average of numbers is " + average);

  }
}


    
    


       

      