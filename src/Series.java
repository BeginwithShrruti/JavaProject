public class Series {

    public static void main (String[] args) {
        /* code */
        int n1 = 5;
        int output = newSeries(n1);
        System.out.println(output);

    }

    public static int newSeries(int n1)
    {
        int output=0;
        for(int i=1; i<n1; i++){
            output = output + i;
        }

        return output;
    }

}
