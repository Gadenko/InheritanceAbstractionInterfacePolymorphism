package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDB {

    private ArrayList<Student> students;

        public StudentDB(ArrayList<Student> insertedStudents) {
            this.students = insertedStudents;
        }
        public ArrayList<Student> getAllStudents() {
            return students;
        }
        public Student getRandomStudent() {

            double randomDouble = Math.random();
            return students.get((int) (randomDouble * students.size()));
        }
        public void add(Student newStudent) {
            students.add(newStudent);
        }
        public void remove(int id) {
            for (Student student : students) {
                if (student.getId() == id){
                    students.remove(student);
                    return;
                }
            }
        }
        /*public void remove(String name) {
            for (Student student : students) {
                if (student.getName().equals(name)){
                    students.remove(student);
                    return;*/
    }
