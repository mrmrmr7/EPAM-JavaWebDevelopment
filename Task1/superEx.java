import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * superEx
 */
public class superEx {
    public static void main(String[] args) {
        Group st24 = new Group(1,5);
        st24.setGroupInfo(); 
        System.out.println(st24.getStudent(0).gradePointAverage()); 
        System.out.println(st24.gradePointAverage());
        System.out.println(st24.badStudentCount());
        System.out.println(st24.excellentStudentCount());
    }
}

class Student {
    private String name;
    private String surname;
    private int age;
    private int[] grade;
    private int countExams;
    
    Student(String name, String surname, int age, int countExams) {
        this.countExams = countExams;
        this.grade = new int[countExams];

        for (int i = 0; i < this.countExams; i++) 
            this.grade[i] = 0;
        
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    Student() {
        this("No name", "No surname", 0, 5);
    }
    
    Student(int countExams) {
        this("No name", "No surname", 0, countExams);
    }

    public void setStudentInfo() {
        
        name = UserInput.inputString("Enter name: ");
        surname = UserInput.inputString("Enter surname: ");
        age = UserInput.inputInt("Set age: ");
        for (int i = 0; i < countExams; i++) 
            grade[i] = UserInput.inputInt("Set " + (i+1) + " grade: ");
    }

    public double gradePointAverage() {
        double sum = 0.0;

        for (int i = 0; i < countExams; i++) 
            sum += grade[i];
        
        return (double)(sum / countExams);
    }

    public String toString() {
        return ("\nName: " + this.name +
                "\nSurname: " + this.surname +
                "\nAge: " + this.age +
                "\nAverage ball: " + this.gradePointAverage());
    }
}

class Group {
    private int countStudent;
    private Student[] student; 

    Group(int count) {
        countStudent = count;
        student = new Student[countStudent];
        for (int i = 0; i < countStudent; i++) {
            student[i] = new Student();
        }
    }

    Group(int count, int countExams) {
        countStudent = count;
        student = new Student[countStudent];
        for (int i = 0; i < countStudent; i++) {
            student[i] = new Student(countExams);
        }
    }

    Group() {
        this(0);
    }

    public double gradePointAverage() {
        double sum = 0.0;

        for (int i = 0; i < countStudent; i++) 
            sum += student[i].gradePointAverage();

        return (double)(sum / countStudent);
    }

    public void setGroupInfo() {
        for (int i = 0; i < countStudent; i++) 
            student[i].setStudentInfo();
    }

    public int excellentStudentCount() {
        int num = 0;

        for (int i = 0; i < countStudent; i++) 
            if (student[i].gradePointAverage() >= 8) 
                num++;

        return num;
    }

    public Student getStudent(int i) {
        if (i < countStudent) {
            return student[i];
        } else {
            System.out.println("No such student");
            return null;
        }
    }

    public int badStudentCount() {
        int num = 0;

        for (int i = 0; i < countStudent; i++) 
            if (student[i].gradePointAverage() < 4) 
                num++;

        return num;
    }


    
}

class UserInput {
    public static int inputInt(String msg) {
        System.out.print(msg);
        int value = 0;
        Scanner in = new Scanner(System.in);
        try {
            value = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type");
        }
        return value;
    }
    public static String inputString(String msg) {
        System.out.print(msg);
        String value = "";
        Scanner in = new Scanner(System.in);
        try {
            value = in.next();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type");
        }
        return value;
    }
}