package labs.lab4;

public class Student {

    private String name;
    private String studentNumber;
    private double mark;


    public Student() {

        this.mark = 0;
        this.studentNumber = "";
        this.name = "";
    }

    public Student(String name, String studentNumber, double mark) {
        this.mark = mark;
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Mark: " + mark);
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasPassed ()
    {
        if (mark > 50)
            return true;
        else
            return false;

    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Student Number: " + studentNumber + ", Mark: " + mark;
    }
}
