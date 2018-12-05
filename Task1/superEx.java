/**
 * superEx
 */
public class superEx {

    public static void main(String[] args) {
        
    }
}

class Student {
    private String name;
    private String surname;
    private int age;
    private int[] grade = new int[5];
    Student(){
        for (int i = 0; i < 5; i++) {
            this.grade[i] = 0;
        }
        this.name = "No name";
        this.surname = "No surname";
        this.age = 0;
    }
}

 
class Group {
    private Strudent[] student = new Student[20]; 
    Group() {

    }
}