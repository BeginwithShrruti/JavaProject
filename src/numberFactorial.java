public class numberFactorial {

    public static int userFactorial(int number)
    {
        int fact=1;

        for(int i=1; i<=number; i++)
        {
            fact = fact * i;
        }
        return fact;
    }


    //this is for client
    public static void main (String[] args)
    {
        int number = 5;
        System.out.println("Factorial of number " + number + " is");

        int fact = userFactorial(number);

        System.out.println(fact);
    }
}

