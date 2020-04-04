public class reverseArray {

    public static void printEle(int[] array)
    {
        for(int i= array.length - 1; i>=0; i--)
        {
            System.out.println("Element at index " + i + "=" + array[i]);
        }
    }


    //--------------------------------------------------------------
    public static void main (String[] args)
    {
        int[] Element = new int[4];

        Element[0] = 1;
        Element[1] = 5;
        Element[2] = 6;
        Element[3] = 7;

        printEle(Element);
    }
}


/*
Array: [1, 5, 6, 7]

output:
Element at index 3 = 7
Element at index 2 = 6
Element at index 1 = 5
Element at index 0 = 1
*/
