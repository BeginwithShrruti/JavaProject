public class FactorNumber {

    public static void main(String[] args)
    {
        int x=5;
        int result = newFactor(x);
        System.out.println(result);
    }

    public static int newFactor(int x)
    {
        int result=1;
        for(int v=1; v<x; v++)
        {
            result = result*v;
        }
        return result;
    }
}
