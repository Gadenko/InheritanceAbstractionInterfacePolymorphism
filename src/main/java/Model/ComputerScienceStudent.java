package Model;

public class ComputerScienceStudent extends Student{

    protected String language;

    public ComputerScienceStudent(int id, String name, String language) {
        super(id, name);
        this.language = language;

    }

    @Override
    public String getName() {
        return null;
    }
    @Override
    public int getId() {
        return 0;
    }
    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "name='" + name + '\'' +
                ", id=" + id + '\'' +
                ", language='" + language +
                '}';
    }
}
