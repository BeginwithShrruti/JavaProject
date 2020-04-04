public class Student {

    private String name;
    private int age;
    private int[] marks;

    // This main class is Client

    public static void main(String[] args)
    {
        Student student = new Student();

        student.name = "Shruti";
        student.age = 29;
        student.marks = new int[5];

        student.marks[0] = 10;

        student.marks[1] = 10;

        student.marks[2] = 20;

        student.marks[3] = 20;

        student.marks[4] = 10;


        float result1 = student.calculateAverage(student.marks);

        System.out.println("Shruti Average Marks = " + result1);
    }

    public static float calculateAverage(int[] marks)
    {
        float result = 0;

        System.out.println("Size = " + marks.length);

        for(int i=0; i < marks.length; i++) {
            System.out.println("i = " + i);
            result = result + marks[i];
            System.out.println("Result = " + result);
        }


        result = result / marks.length;

        return result;
    }
}

