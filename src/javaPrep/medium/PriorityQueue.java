package javaPrep.medium;

import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */

class Student {
    private String name;
    private double CGPA;
    private int id;

    public Student(String name, double cgpa, int id) {
        this.name = name;
        this.CGPA = cgpa;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.CGPA;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Student)) return false;
        final Student other = (Student) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (Double.compare(this.getCGPA(), other.getCGPA()) != 0) return false;
        if (this.getId() != other.getId()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Student;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final long $CGPA = Double.doubleToLongBits(this.getCGPA());
        result = result * PRIME + (int) ($CGPA >>> 32 ^ $CGPA);
        result = result * PRIME + this.getId();
        return result;
    }

    public String toString() {
        return "Student(name=" + this.getName() + ", CGPA=" + this.getCGPA() + ", id=" + this.getId() + ")";
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
                Student tempStu = new Student(name, CGPA, id);
                students.add(tempStu);
            } else {
                students.sort(Comparator.comparingDouble(Student::getCGPA));
                double bigGPA = students.get(students.size() - 1).getCGPA();
                List<Student> smartKids = new ArrayList<>();
                for (Student kid : students) {
                    if (kid.getCGPA() == bigGPA)
                    smartKids.add(kid);
                }
                smartKids.sort(Comparator.comparingInt(Student::getId));
                Student priorityKid = smartKids.get(0);
                students.remove(priorityKid);
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
