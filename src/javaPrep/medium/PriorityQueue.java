package javaPrep.medium;

import java.util.*;
import java.util.stream.Collectors;
/*
 * Create the Student and Priorities classes here.
 */

class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<>();
        for (String st : events) {
            String[] stStud = st.split(" ");
            if (stStud[0].equals("ENTER")) {
                String name = stStud[1];
                double CGPA = Double.parseDouble(stStud[2]);
                int id = Integer.parseInt(stStud[3]);
                Student tempStu = new Student(id, name, CGPA);
                students.add(tempStu);
            } else {
                if(!students.isEmpty()) {
                    students = students.stream()
                            .sorted(Comparator.comparing(Student::getCGPA).reversed()
                                    .thenComparing(Student::getName)
                                    .thenComparing(Student::getID))
                            .collect(Collectors.toList());
                    students.remove(0);
                }
            }
        }
        return students;
    }
}

public class PriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
