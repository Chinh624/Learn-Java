package Training_CK_16_10_2023.assignment26;

public class Employee {
    private String ID;
    private String name;
    private int level;

    public Employee(String ID, String name, int level) {
        this.ID = ID;

        this.name = name;
        this.level = level;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + ID + ", name=" + name + ", level=" + level + "]";
    }
}
