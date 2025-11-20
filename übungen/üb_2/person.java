package üb_2;

public class person {
    protected String name;
    protected int age;
    public person(String name, int age){
        if (!name.strip().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name ist leer.");
        }
        if (age > 0 && !Double.isNaN(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Alter muss positiv sein, oder gegeben werden.");
        }
    }
    public String getName(){
        System.out.print("Hallo, mein name ist " + this.name);
        System.out.println();
        return this.name;
    }
    public int getAge(){
        System.out.print("Ich bin " + this.age + " Jahre alt.");
        System.out.println();
        return this.age;
    }
}

class student extends person {
    private String studyField;
    private String studentID;
    public student(String name, int age, String studyField, String studentID){
        super(name, age);
        this.studyField = studyField;
        if (studentID.trim().length() == 5) { // "     " nicht erlauben
            this.studentID = studentID;
        } else {
            throw new IllegalArgumentException("Student ID muss 5-stellig sein.");
        }
    }
    public void greet(){
        System.out.print("hallo, mein name ist " + this.name + " ich lerne " + this.studyField + ".");
        System.out.println();
    }
    public void giveID(){
        System.out.print(this.name + "'s Studenten ID ist " + this.studentID + ".");
        System.out.println();
    }
}

class professor extends person {
    private String subject;
    public professor(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    public void teach(){
        System.out.print(this.name + " lehrt " + this.subject + ".");
        System.out.println();
    }
}
