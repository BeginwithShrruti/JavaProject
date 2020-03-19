public class FiboNumbers {

    public static void main(String []args)
    {
        int a=1, b=2, c=3, Z, i, count=20;
        System.out.println(a+" "+b+" "+c); //printing 1 & 2 & 3

        for(i=4; i<count; i++)
        {
            Z = a+b+c;
            System.out.println(" "+Z);
            a=b;
            b=c;
            c=Z;
        }
    }
}
