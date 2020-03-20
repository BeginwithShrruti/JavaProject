public class Add {

    public static void main (String[] args)
    {
        int[] arr = {1, 4, 7, 0, 3, 1};
        int output = addArr(arr);
        System.out.println(output);

    }
    public static int addArr(int[] arr)
    {
        int output=0;
        for(int i=0; i<arr.length; i++)
        {
            output = output + arr[i];
        }
        return output;
    }
}

