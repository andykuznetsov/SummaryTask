package objects;


import java.util.ArrayList;

public class Group {

    private int number;
    private String faculty;
    public ArrayList<Student> listOfStudents;
    private int amount;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString(){
        String out;
        out = "Group number: " + number + "; Faculty: " + faculty + "; Amount of students in group: " + amount;
        return out;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }
}
