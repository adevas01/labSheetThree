import java.util.ArrayList;
import java.util.List; 
public class ArrayListRunner {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    //a)
    //Invoke add() to enter the following names in sequence:
    names.add("Alice");
    names.add("Bob");
    names.add("Connie");
    names.add("David");
    names.add("Edward");
    names.add("Fran");
    names.add("Gomez");
    names.add("Harry");

    System.out.println(names); //Print the list

    //b)
    //Use get() to retrieve and print the first and last names.
    String first = names.get(0);
    System.out.println("The first name in the list is " + first);

    String last = names.get(names.size() - 1);
    System.out.println("The last name in the list is " + last);

    //c)
    //Print the size of the arrayList    
    System.out.println("The size of the arrayList is " + names.size());

    //d)
    //Use size() to print the last name in the list
    System.out.println("The last name in the list is " + names.get(names.size() - 1));

    //e)
    //Use set to change Alice to Anna. Print the arrayList to see the change.
    System.out.println("The list before changing names: " + names);
    names.set(0, "Anna");
    System.out.println("The list after changing names: " + names);

    //f)
    //Use the alternate form of add() to insert Doug after David. Print the list
    System.out.println("The list before including new name: " + names);
    names.add(4, "Doug");
    System.out.println("The list after including new name: " + names);

    //g)
    //Use am enhanced for loop to print each name in the ArrayList.    
    for (String e : names) {
      System.out.println(e);
    }

    //h)
    //Create a second ArrayList called names2 that is built by calling the ArrayList constructor that accepts another
    //ArrayList as an argument. Pass names to the constructor to build names2. Print the ArrayList.

    ArrayList<String> names2 = new ArrayList<>(List.copyOf(names));
 
        System.out.println("Original ArrayList names: " + names);
        System.out.println("Copied Arraylist names2: " + names2);

    //i)
    //Call names.remove(0) to remove the first element. Print names and names.2.
    //Verufy that Anna was removed from names, but not from names2.
    names.remove(0);      
    System.out.println("Anna was removed from the ArrayList names: " + names);
    System.out.println("Anna was not removed from the ArrayList names2 " + names2);

  }   
}  

