public class ExerciseOne{
  public static void main(String[] args) {
    //a
    //Create an array x of doubles with an initialiser list with the following values: 8, 4, 5, 21, 7, 9, 18, 2, 100;
    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};

    //b
    //Print the number of items in the aray by using an expression of the form x.length
    System.out.println("Number of items of x is " + x.length);
    System.out.println(" ");

    //c
    //Print the first array item
    System.out.println("The first item is " + x[0]);
    System.out.println(" ");

    //d
    //Print the last array item. It is 9 - 1 => 8
    System.out.println("The last item is " + x[8]);
    System.out.println(" ");
    
    //e
    //Print the expression x[x.length - 1]
    System.out.println("The expression x[x.length - 1] is the last item: " +  x[x.length - 1]);
    System.out.println(" ");

    //f
    //Use a standard for loop to print all the values in the array without labels
    for (int i = 0; i < x.length; i++) {
      System.out.println(x[i]); 
    } 
    System.out.println(" ");

    //g
    //Use a standard for loop to print all the values in the array with labels to indicate what each element is.
    for (int i = 0; i < x.length; i++) {
      System.out.println("Label " + i + "=> " + x[i]);
    }
    System.out.println(" ");

    //h
    //Use a standard for loop to print all the values in the array in reverse order with labels to indicate each element is.
    for (int i = x.length - 1; i >= 0; i--) {
      System.out.println("Label " + i + "=> " + x[i]);
    }
    System.out.println(" ");

    //i
    //Use an enhanced for loop to print all the values in the array without labels
    for (double e : x) {
      System.out.println(e);
    }
    System.out.println(" ");









  }
}