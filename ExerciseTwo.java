import java.util.Arrays;
public class ExerciseTwo {

  public static void main(String[] args) {

    double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100}; 
    
    System.out.print("Before rotation: " + " " + Arrays.toString(x)); 
    System.out.println("  "); 
    System.out.println("  "); 

    for (int i = 0; i < x.length; i++) {
      System.out.println("x[" + i + "]: " + x[i]);
    }
    System.out.println("  "); 
    System.out.println("  "); 

    System.out.println(Arrays.toString(rotate(x)));
    System.out.print("After rotation: " + " " + Arrays.toString(x)); 
    System.out.println("  "); 
    System.out.println("  "); 

    for (int i = 0; i < x.length; i++) {
      System.out.println("x[" + i + "]: " + x[i]);
    }
    System.out.println("  "); 
    System.out.println("  "); 
  }
    /*
    Method rotate
    
    */
    public static double[] rotate(double[] x) {     
      double last = x[x.length - 1];      
      for (int i = x.length - 1; i > 0; i--) {
        x[i] = x[i - 1];
      }
      x[0] = last;      
      return x;
    }
  }
  

