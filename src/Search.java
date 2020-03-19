public class Search {
    public static void main (String[] args) {
        int[] elements = {1,2,3,5,6,4,7};
        boolean result  = searchInArr(elements, 4);
        System.out.println(result);
    }

    private static boolean searchInArr(int[] elements, int num) {
        int i, count=elements.length;
        for(i=0; i<count; i++)
        {
            if(elements[i]==num)
            {
                return true;
            }
        }

        return false;

    }
}
