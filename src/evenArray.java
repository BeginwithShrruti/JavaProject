public class evenArray {

    public static void evenArray(int number)
    {
        for(int i=1; i<=number; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

    }


    //--------------------------------------------------------------
    public static void main (String[] args)
    {
        int number = 6;

        System.out.println("Even Number series till Integer =" + number);

        evenArray(number);
    }
}



/*
Input: 6

output:

Even Number series till Integer =  6
2
4
6

*/
