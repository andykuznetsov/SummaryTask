package workers;

import objects.Group;
import objects.Student;

import java.util.ArrayList;

public class WorkerWithStudents {

    public ArrayList<Student> getListOfStudentsByScore(ArrayList<Student> listOfStudents, Group group, int i, double minScore){

        if (i == group.getListOfStudents().size()){
            return listOfStudents;
        }

        if (getStudentsMedialScore(group.getListOfStudents().get(i)) >= minScore){
            listOfStudents.add(group.getListOfStudents().get(i));
        }

        listOfStudents = getListOfStudentsByScore(listOfStudents, group, i+1, minScore);

        return listOfStudents;
    }

    public double getStudentsMedialScore(Student student) {
        int sum = 0;
        for (int i : student.getHometasksScores()
                ) {
            sum = sum + i;
        }
        double medialScore = sum / student.getHometasksScores().size();
        return medialScore;
    }

    public double getGroupsMedialScore(Group group){
        double sum = 0;
        for (int i = 0; i < group.getListOfStudents().size(); i++) {
            sum = sum + getStudentsMedialScore(group.getListOfStudents().get(i));
        }
        double medialScore;
        medialScore = sum / group.getListOfStudents().size();
        return medialScore;
    }


}
