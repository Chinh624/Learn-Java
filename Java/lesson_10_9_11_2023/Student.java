package lesson_10_9_11_2023;

public class Student {
    public int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
}
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name +" ]";
    }


}

