package Model;

import java.util.Objects;

public abstract class Student {

    protected int id;
    protected String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public abstract String getName();

    public void setName(String name) {
    }


    public abstract int getId();

    public void setId(int id) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}