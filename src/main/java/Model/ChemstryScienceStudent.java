package Model;

public class ChemstryScienceStudent extends Student implements Citizen{

    protected String element;
    protected String address;
    protected  String number;

    public ChemstryScienceStudent(int id, String name, String element, String address, String number) {
        super(id, name);
        this.element = element;
        this.address = address;
        this.number = number;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public String getIdentityCardNumber() {
        return number;
    }

    @Override
    public String getBlabla() {
        return null;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ChemstryScienceStudent{" +
                "element='" + element + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
