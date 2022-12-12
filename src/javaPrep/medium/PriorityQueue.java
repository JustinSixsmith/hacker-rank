package javaPrep.medium;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

@Data
class Student {
    private String name;
    private double CGPA;
    private int id;

    public Student(String name, double cgpa, int id) {
        this.name = name;
        this.CGPA = cgpa;
        this.id = id;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        ArrayList<String> students = new ArrayList<>();
        for (String st : events) {
            System.out.println(st);
            String[] stStud = st.split(" ");
            String name = stStud[0];
            double CGPA = Double.parseDouble(stStud[1]);
            int id = Integer.parseInt(stStud[2]);
            students.add(new Student(name, CGPA, id);
        }
        return null;
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
            for (Student st: students) {
//                System.out.println(st.getName());
            }
        }
    }
}
