package clean;

public class CleanMain {
    public static void main(String[] args) {
        CleanStudentService service = new CleanStudentService();

        CleanStudent s1 = new CleanStudent("Alice", 20, 3.5);
        CleanStudent s2 = new CleanStudent("Bob", 22, 3.9);
        CleanStudent s3 = new CleanStudent("Charlie", 19, 3.2);

        service.addStudent(s1);
        service.addStudent(s2);
        service.addStudent(s3);

        CleanStudent top = service.getTopStudent();
        if (top != null) {
            System.out.println("Top Student: " + top.getName());
        } else {
            System.out.println("Top Student: none");
        }

        System.out.println("Average GPA: " + service.calculateAverageGpa());
    }
}
