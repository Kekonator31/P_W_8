import java.util.*;

class Student implements Comparable<Student> {
    public String name;
    public int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student g) {
        return Integer.compare(g.grade, this.grade);
    }

}

public class Task_1 {

    static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.name + "\t Grade:" + student.grade);
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Oleksiy", 8));
        students.add(new Student("Maria", 11));
        students.add(new Student("Petro", 10));
        students.add(new Student("Anna", 4));
        students.add(new Student("Ivan", 9));

        System.out.println("Student before sorting:");

        printList(students);

        System.out.println("Student after sorting:");

        Collections.sort(students);

        printList(students);

    }
}