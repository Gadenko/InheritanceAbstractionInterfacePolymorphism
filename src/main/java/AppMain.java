import Model.ChemstryScienceStudent;
import Model.ComputerScienceStudent;
import Model.Student;
import Model.StudentDB;


public class AppMain {

    public static void main(String[] args) {

        StudentDB studentDB = new StudentDB(new Student[]{
                new ComputerScienceStudent(1, "David", "Java"),
                new ComputerScienceStudent(2, "Tom", "Python"),
                new ComputerScienceStudent(3, "Shu", "Python"),
                new ComputerScienceStudent(4, "Yang", "Java"),
                new ChemstryScienceStudent(5,"Zhen","Helium","Hamburg","IE7687UWEHF")
        });

        System.out.println(studentDB.toString());

        //System.out.println("First Student: " + studentDB.getAllStudents()[0]);

        //System.out.println("Random Student: " +studentDB.getRandomStudent());

        Student student6 = new ComputerScienceStudent(123,"asda","wasda");

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
        System.out.println(student5);
    }
}

