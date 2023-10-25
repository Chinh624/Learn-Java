package Buoi4_t5;

import java.util.Objects;

public class Student2 {
private int id;
    private String StudentName;

    public Student2() {
    }

    public Student2(int id, String StudentName){
        this.id = id;
        this.StudentName = StudentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

  


    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.StudentName);
        return hash;
    }

    // @Override
    // // public boolean equals(Object obj) {
    // //     if (this == obj) {
    // //         return true;
    // //     }
    // //     if (obj == null || getClass() != obj.getClass()) {
    // //         return false;
    // //     }
    // //     final Student other = (Student) obj;
    // //     if (this.id != other.id) {
    // //         return false;
    // //     }
    // //     if (!Objects.equals(this.StudentName, other.StudentName)) {
    // //         return false;
    // //     }
    // // }

    // @Override
    public String toString() {
        return "Student {" + "id=" + id + ", StudentName=" + StudentName + "}";
    }
}