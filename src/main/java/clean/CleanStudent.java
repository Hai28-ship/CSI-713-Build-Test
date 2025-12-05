package clean;

public class CleanStudent {
    private String name;
    private int age;
    private double gpa;

    public CleanStudent(String name, int age, double gpa) {
        this.name = name;
        setAge(age);
        this.gpa = gpa;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public double getGpa() { return gpa; }

    public void setGpa(double gpa) { this.gpa = gpa; }
}
