/* Project 2 CS 1180
 * This project demostrates the usage of loops and swtich statements.
 * This program will ask for an input for a different selection of math problems. The user will be given 5 randomly generated problems for the type of problems they want to attemp. After they attemp the selected problems, they are brought back to the input menu, allowing them to practice more problems, or select to exit the program. If they select to exit the program they are given the amount of answer they got correct and the amount attempted and a percentage of problems they got correct.
 */
package cs1180_project2_maddox;
import java.util.Scanner;
/**
 * @author Taylor Maddox
 * CS 1180 L: C08
 * Instructor: Heather Lingg
 * Ta: Sai Polamarasetty
 */
public class CS1180_Project2_Maddox {
  
    //variables
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double answer = 0.0;
    double x = 0.0;
    double correct = 0.0;
    double total = 0.0;
    
    // Loop to allow for the user to continue using the program after they have finished a group of probelms.
    loop: while (true) {
    System.out.println("\nWelcome to the Wright State School of Math!");
    System.out.print("\nPlease choose one of the following options for your quiz:\n1. Addition with number 1-10\n2. Addition with number 1-100\n3. Subtraction with number 1-10\n4. Subtraction with numbers 1-100\n5. Multiplication 1-10\n6. Exit the Program\n");
    int option = keyboard.nextInt();
    
     //Switch statment to allow user to switch the type of problems they want to attempt.
     switch (option) {
         
     //Addittion 1-10
      case 1: 
          for (x = 1; x<=5;  x++){
            double  num1 = (int) (Math.random() * 10 + 1); 
            double  num2 = (int) (Math.random() * 10 + 1);
            double  num3 = (num1 + num2);
            System.out.println("\nEnter the answer to the following problem");
            System.out.printf("%.0f + %.0f\n", num1, num2);
            answer = keyboard.nextDouble();
            if (answer == num3) {
            System.out.print("Thats the correct answer!\n");
            correct++;
            total++;
            }
            else if (answer != num3) {
            System.out.printf("Sorry, that is incorrect. The correct answer is: %.0f\n", num3);
            total++;
                  }
            } //end of case 1
            break;
      
      //Addition 1-100
      case 2:
          for (x=1; x<=5; x++) {
            double num1 = (int) (Math.random() * 100 + 1);
            double num2 = (int) (Math.random() * 100 + 1);
            double num3 = (num1 + num2);
            System.out.println("\nEnter the answer to the following problem");
            System.out.printf("%.0f + %.0f\n", num1, num2);
            answer = keyboard.nextDouble();
            if (answer == num3) {
            System.out.print("Thats the correct answer!\n");
            correct++;
            total++;
            }
            else if (answer != num3) {
            System.out.printf("Sorry, that is incorrect. The correct answer is: %.0f\n", num3); 
            total++;
                  }
      }//end of case 2
          break;
       
      //Subtraction 1-10    
      case 3: 
          for (x=1; x<=5; x++){ 
            double num1 = (int) (Math.random() * 10 + 1);
            double num2 = (int) (1 + Math.random() * num1);
            double num3 = (num1 - num2);
            System.out.println("\nEnter the answer to the following problem");
            System.out.printf("%.0f - %.0f\n", num1, num2);
            answer = keyboard.nextDouble();
            if (answer == num3) {
            System.out.print("Thats the correct answer!\n");
            correct++;
            total++;
            }
            else if (answer != num3) {
            System.out.printf("Sorry, that is incorrect. The correct answer is: %.0f\n", num3);
            total++;
            }
            } //end of case 3
            break;
      
      //Subtraction 1-100
      case 4: 
          for (x=1; x<=5; x++) {
            double num1 = (int) (Math.random() * 100 + 1);
            double num2 = (int) (1 + Math.random() *num1);
            double num3 = (num1 - num2);
            System.out.println("\nEnter the answer to the following problem");
            System.out.printf("%.0f - %.0f\n", num1, num2);
            answer = keyboard.nextDouble();
            if (answer == num3) {
            System.out.print("Thats the correct answer!\n");
            correct++;
            total++;
            }
            else if (answer != num3) {
            System.out.printf("Sorry, that is incorrect. The correct answer is: %.0f\n", num3);
            total++;
            }
            }// end of case 4
            break;
      
      //Multiplication 1-10
      case 5: 
          for (x=1; x<=5; x++) {
            double num1 = (int) (Math.random() *10 + 1);
            double num2 = (int) (Math.random() *10 + 1);
            double num3 = (num1 * num2);
            System.out.println("\nEnter the answer to the following problem");
            System.out.printf("%.0f * %.0f\n", num1, num2);
            answer = keyboard.nextDouble();
            if (answer == num3) {
            System.out.print("Thats the correct answer!\n");
            correct++;
            total++;
            }
            else if (answer != num3) {
            System.out.printf("Sorry, that is incorrect. The correct answer is: %.0f\n", num3);
            total++;
            }
            } //end of for statment case 5
            break;
      
      //Allows user to exit program and gives them their results.    
      case 6:
            double percentCorrect = correct/total * 100;
            System.out.printf("You got %.0f problems correct out of %.0f problems attempted. That is %.2f percent correct",correct, total, percentCorrect);
            System.out.print("\nGoodbye!");
            break loop;
          
      //Tell user they have a incorrect input and goes back to the start of the loop.
      default:
            System.out.print("\nError: Incorrect input\n");
            break;    
         
     }// end switch
     
     } //end while (
    
}
               
    }
