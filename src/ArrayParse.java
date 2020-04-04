public class ArrayParse{

    public static void printElements(int[] array)
    {
        for(int i=0;i < array.length; i++){
            System.out.println("Element at index " + i + " = " + array[i]);
        }
    }

    public static void main (String[] args)
    {
        int[] elements = new int[4];
        elements[0] = 1;
        elements[1] = 5;
        elements[2] = 6;
        elements[3] = 7;

        printElements(elements);

    }
}


/*Array: [1, 5, 6, 7]

output:
Element at index 0 = 1
Element at index 1 = 5
Element at index 2 = 6
Element at index 3 = 7*/
