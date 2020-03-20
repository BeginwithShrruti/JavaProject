public class MaxNumber {
    public static void main (String[] args)
    {
        int[] elements = {1, 5, 3, 7, 9, 0};
        int result =  searchMaxArr(elements);
        System.out.println(result);

        int[] elements2 = {0, 0};
        int result2 =  searchMaxArr(elements2);
        System.out.println(result2);
    }

    public static int searchMaxArr(int[] elements){
        int i;
        //initializing max elements in Array
        int max = elements[0]; //  max=1

        for(i=1; i<elements.length; i++)
        {
            if(elements[i]>max)
            {
                max=elements[i];
            }
        }
        return max;
    }
}
