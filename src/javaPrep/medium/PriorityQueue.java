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
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        ArrayList<String> roster = new ArrayList<>();
        for (String st : events) {
            System.out.println(st);
            String[] StStud = st.split(" ");
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
