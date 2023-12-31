package lesson_2_25_10_2023;

public class Student {
    private int id;
    private String name;
    private double mark;

    public Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        
         public double getMark() {
         return mark;
     }
    
         public void setMark(double mark) {
         this.mark = mark;
    }
    
         public String toString() {
         return "Student{" + "id=" + id + ", name=" + name + ", mark=" + mark + '}';
    }
}
