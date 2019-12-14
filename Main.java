
import java.lang.Math;
import java.util.Scanner;

class Main {
 
  public static void main(String[] args) {
// Scanner for user inputs.
    Scanner userInput = new Scanner(System.in);
    System.out.println("Starting value:");
    int x = userInput.nextInt();
//After researching I realized that I could have made a repeatable one line scanner by creating a new method ,but it occured to me that I saw the code therefore, no purpose in incorperating in here.
    System.out.println("Ending value:");
    int y = userInput.nextInt();
    userInput.close();
//The print statements. X and Y being the range of the for loop.
    int factor = 0;
    boolean prime = false;
    boolean perfect = false;
    //first loop to run as many numbers from the min to max.
    for (int i = x; i <= y; i++){
      //factors.
      for (int t = 1; t <= i; t++){
        if (i % t == 0){
          factor += 1;
        }
      }
      //Prime and perfect condtions.
      if (factor == 2){
        prime = true;
      }
      if (factor % 2 == 1){
        perfect = true;
      }
      //output.
      System.out.println("------------------");

      System.out.println("Number: " + i + "\n\nFactors: " + factor + "\nPrime: " + prime + "\nPerfect Square: " + perfect);
      //resets the varible's values.
      factor = 0;
      prime = false;
      perfect = false; 
    }
  }
}
