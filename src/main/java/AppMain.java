import Model.ChemstryScienceStudent;
import Model.ComputerScienceStudent;
import Model.Student;
import Model.StudentDB;

import java.util.ArrayList;


public class AppMain {

    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();
        StudentDB studentDB = new StudentDB(students);
        ComputerScienceStudent student7 = new ComputerScienceStudent(6,"Blabla","Java");
        ComputerScienceStudent student8 = new ComputerScienceStudent(7,"doof", "java");
        studentDB.add(student7);
        studentDB.add(student8);
        //studentDB.remove(6);

        System.out.println(studentDB.getAllStudents().get(1));

        System.out.println(studentDB.toString());

        //System.out.println("First Student: " + studentDB.getAllStudents());

        //System.out.println("Random Student: " +studentDB.getRandomStudent());

        /*Student student6 = new ComputerScienceStudent(123,"asda","wasda");

        ComputerScienceStudent student1 = new ComputerScienceStudent(1,"David","Java");
        ComputerScienceStudent student2 = new ComputerScienceStudent(2,"Tom","Python");
        ComputerScienceStudent student3 = new ComputerScienceStudent(3,"Shu","Python");
        ComputerScienceStudent student4 = new ComputerScienceStudent(4,"Yang","Java");
        ChemstryScienceStudent student5 = new ChemstryScienceStudent(5,"Zhen","Helium","Hamburg"
        ,"IE7687UWEHF");

        student5.setAddress("Berlin");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);*/
    }
}

