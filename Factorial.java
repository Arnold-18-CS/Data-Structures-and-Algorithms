import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //ALGORITHM FOR FACTORIAL RECURSION
        //1. Start
        //2. Declare a variable to store a number.
        //3. Ask the user to initialize the number.
        //4. Check whether it is possible to calculate the factorial or not.
        //5. If the number is greater than and equal to 0, then call a recursive function to calculate
        //the factorial of the entered number.
        //6. If the number is lesser than 0, print the message that it is not possible to calculate the
        //factorial.
        //7. If the entered number is 0 or 1, then return 1.
        //8. If the entered number is other than 0 or 1, then calculate the factorial by recursively
        //calling the same method.
        //9. Return the result.
        //10. Print the factorial of the entered number.
        //11. Stop

        System.out.println("FACTORIALS BY RECURSION");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        if (number>=0){
            int factorial = Factorial(number);
            System.out.println("The factorial of " +number+ " is: " + factorial);
        }
        else{
            System.out.println("Factorial not possible.\n Please enter valid input.");
        }
    }
    private static int Factorial(int number) {
        if (number == 0 || number == 1)
            return 1;
        else
            return number * Factorial(number - 1);
    }
}