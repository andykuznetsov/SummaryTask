package objects;

import java.util.ArrayList;
import java.util.Date;


public class Student {

    // Variables
    private int numberInGroup;
    private String firstName, secondName;
    private Date dateOfBirth = new Date();
    private String faculty;
    private int groupNumber;

    protected double medialScore;
    private ArrayList<Hometask> listOfHometasks;
    private ArrayList<Integer> hometasksScores;

    public int getNumberInGroup() {
        return numberInGroup;
    }

    public void setNumberInGroup(int numberInGroup) {
        this.numberInGroup = numberInGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getMedialScore() {
        return medialScore;
    }

    public void setMedialScore(double medialScore) {
        this.medialScore = medialScore;
    }

    public ArrayList<Hometask> getListOfHometasks() {
        return listOfHometasks;
    }

    public void setListOfHometasks(ArrayList<Hometask> listOfHometasks) {
        this.listOfHometasks = listOfHometasks;
    }

    public ArrayList<Integer> getHometasksScores() {
        return hometasksScores;
    }

    public void setHometasksScores(ArrayList<Integer> hometasksScores) {
        this.hometasksScores = hometasksScores;
    }

    public String toString(){
        String out;
        System.out.println();
        out = numberInGroup + ") " + firstName + " " + secondName + ", " + dateOfBirth.toString() + ", " + faculty + ", " + groupNumber + ";";
        return out;
    }



}
