import java.util.Scanner;

public class Power_of {
    public static void main(String[] args) {

        //ALGORITHM FOR POWER OF A NUMBER ITERATIVELY
        //1. Create a function say power((int base, int x) that will return the integer value denothing the base^x
        //2. Create a variable say result=1 that holds the base^x
        //3. Run a while loop tha twill terminate when x becomes 0
        //4. Inside the while loop set result*=base
        //5. Return the result upon completion on iteration.

        Scanner input = new Scanner(System.in);

        System.out.println("ITERATIVELY SOLVING POWER OF A NUMBER");

        System.out.println("Enter the number that will be the base: ");
        int base = input.nextInt();

        System.out.println("Enter the power: ");
        int x = input.nextInt();

        System.out.println( base+ " to the power of " +x+ " is: " + PowerIter(base,x));

        System.out.println("RECURSIVELY SOLVING POWER OF A NUMBER");

        System.out.println("Enter the number that will be the base: ");
        base = input.nextInt();

        System.out.println("Enter the power: ");
        x = input.nextInt();

        System.out.println( base+ " to the power of " +x+ " is: " + PowerRecur(base,x));



    }

    private static int PowerRecur(int base, int x) {

        if (x==0)
            return 1;
        else
            return (base * PowerRecur(base, x-1));
    }

    private static int PowerIter(int base, int x) {
        int result=1;

        while (x>0){
            result *= base;
            x--;
        }
        return result;
    }
}
