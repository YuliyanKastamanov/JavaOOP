package L01_WorkingWithAbstraction.Labs.P03_StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> report;

    public StudentSystem() {
        this.report = new HashMap<>();
    }

    public Map<String, Student> getReport() {
        return this.report;
    }

    public void ParseCommand(String[] input) {

        String command = input[0];
        String name = input[1];

        if (command.equals("Create")) {
            createStudent(input, name);
        } else if (command.equals("Show")) {
            if (report.containsKey(name)) {
                showStudent(name);
            }
        }
    }

    private void showStudent(String name) {
        Student student = report.get(name);
        String view = String.format("%s is %s years old.", student.getName(), student.getAge());

        if (student.getGrade() >= 5.00) {
            view += " Excellent student.";
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice person.";
        }

        System.out.println(view);
    }

    private void createStudent(String[] input, String name) {
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);
        if (!report.containsKey(name)) {
            Student student = new Student(name, age, grade);
            report.put(name, student);
        }
    }
}
