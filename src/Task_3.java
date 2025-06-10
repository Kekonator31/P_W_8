import java.util.*;

class Applicant {
    public String name;
    public int score;

    public Applicant(String title, int score) {
        this.name = title;
        this.score = score;
    }
}

public class Task_3 {

    static void printList(TreeMap<Integer, Applicant> applicants) {
        for (int i = 0; i < applicants.size(); i++) {
            System.out.println(applicants.get(i).name + "\t Year:" + applicants.get(i).score);
        }
    }

    static TreeMap<Integer, Applicant> compareTo(TreeMap<Integer, Applicant> applicants) {

        Applicant a;

        for (int i = 0; i < applicants.size() - 1; i++) {
            for (int y = 0; y < applicants.size() - 1; y++) {
                if (applicants.get(y).score < applicants.get(y + 1).score) {
                    a = applicants.get(y);
                    applicants.put(y, applicants.get(y + 1));
                    applicants.put(y + 1, a);
                }
            }
        }

        return applicants;


    }

    public static void main(String[] args) {

        TreeMap<Integer, Applicant> applicants = new TreeMap<>();

        applicants.put(0, new Applicant("Oleksiy", 65));
        applicants.put(1, new Applicant("Maria", 47));
        applicants.put(2, new Applicant("Petro", 99));
        applicants.put(3, new Applicant("Ivan", 100));
        applicants.put(4, new Applicant("Anna", 84));

        System.out.println("Books before sorting:");

        printList(applicants);

        System.out.println("Books after sorting:");

        applicants = compareTo(applicants);

        printList(applicants);

    }
}