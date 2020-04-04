// Find maximum marks of the student from all subjects
// are you altering my code?
// no

class StudMarks
{
    private String name;
    private int[] subjects;


    public static int calMaxMarks(int[] marks)
    {
        int max = marks[0];

        for(int i=0; i<marks.length; i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
        }

        return max;
    }


    public static int SumMarks(int[] marks)
    {
        int sum = 0;
        for(int i=0; i<marks.length; i++)
        {
            sum=sum+marks[i];
        }

        return sum;
    }


    //------------------------------------------------------------------------------
    public static void main (String[] args)
    {
        StudMarks ns = new StudMarks();
        ns.name = "Shubham";
        ns.subjects = new int[4];

        ns.subjects[0] = 75;
        ns.subjects[1] = 35;
        ns.subjects[2] = 15;
        ns.subjects[3] = 100;

        int result = calMaxMarks(ns.subjects);
        System.out.println(" Max =" + result);

        int result1 = SumMarks(ns.subjects);
        System.out.println("sum =" + result1);
    }
}