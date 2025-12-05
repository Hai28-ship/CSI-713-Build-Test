package clean;

import java.util.ArrayList;
import java.util.List;

public class CleanStudentService {
    private List<CleanStudent> students;

    public CleanStudentService() {
        students = new ArrayList<>();
    }

    public void addStudent(CleanStudent s) {
        students.add(s);
    }

    public CleanStudent getTopStudent() {
        if (students.isEmpty()) {
            return null;
        }

        CleanStudent top = students.get(0);
        for (CleanStudent s : students) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        return top;
    }

    public double calculateAverageGpa() {
        if (students.isEmpty()) return 0.0;

        double total = 0.0;
        for (CleanStudent s : students) {
            total += s.getGpa();
        }
        return total / students.size();
    }
}
