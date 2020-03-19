public class FiboNumbers {

    public static void main(String []args)
    {
        int a=1, b=2, c=3, Z, i, count=10;
        System.out.println(a+" "+b); //printing 1 & 2

        for(i=4; i<count; i++); //1 & 2 are printing already, so the loop will start from 2
        {
            Z = a+b+c;
            System.out.println(" "+Z);
            a=b;
            b=c;
            c=Z;
        }
    }
}
