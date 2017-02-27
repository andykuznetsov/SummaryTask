package dev;

import objects.Group;
import objects.Hometask;
import objects.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws SQLException {

        DBWorker worker = new DBWorker();

        String query1 = "select * from students";
        String query2 = "select * from hometasks";
        String query3 = "select * from groups";


        try {

            Statement statement1 = worker.getConnection().createStatement();
            Statement statement2 = worker.getConnection().createStatement();
            Statement statement3 = worker.getConnection().createStatement();

            ResultSet resultSetOfStudents = statement1.executeQuery(query1);
            ResultSet resultSetOfHometasks = statement2.executeQuery(query2);
            ResultSet resultSetOfGroups= statement3.executeQuery(query3);


            ArrayList<Student> myListOfStudents = new ArrayList<>();

            while (resultSetOfStudents.next()) {

                Student student = new Student();
                student.setNumberInGroup(resultSetOfStudents.getInt(1));
                student.setFirstName(resultSetOfStudents.getString(2));
                student.setSecondName(resultSetOfStudents.getString(3));
                student.setDateOfBirth(resultSetOfStudents.getDate(4));
                student.setFaculty(resultSetOfStudents.getString(5));
                //if (student.getFaculty() == )

                student.setGroupNumber(resultSetOfStudents.getInt(6));


                myListOfStudents.addAll(Arrays.asList(student));

                System.out.println(student);
                //System.out.println(myListOfStudents);

            }

            while (resultSetOfHometasks.next()) {

                Hometask hometask = new Hometask();
                hometask.setNumber(resultSetOfHometasks.getInt(1));
                hometask.setHeader(resultSetOfHometasks.getString(3));
                hometask.setTheme(resultSetOfHometasks.getString(2));
                hometask.setTextOfHometask(resultSetOfHometasks.getString(4));


                System.out.println(hometask);

            }

            while (resultSetOfGroups.next()) {

                Group group = new Group();
                group.setFaculty(resultSetOfGroups.getString(2));
                group.setNumber(resultSetOfGroups.getInt(1));

                for (int i=0; i<myListOfStudents.size(); i++){
               //     if (myListOfStudents

                }
                System.out.println(group);

            }



        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
