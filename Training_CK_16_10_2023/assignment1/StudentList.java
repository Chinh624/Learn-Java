package Training_CK_16_10_2023.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
        private List<Student> students = new ArrayList<>(); // Ap dung tinh da hinh
        
        public StudentList() {
            Student student01 = new Student(1,"Chinh");
            students.add(student01);
        }

        public List<Student> getStudents() {
            return students;
        }

        public void setStudent(List<Student> students) {
            this.students = students;
        }

        public void addStudent(){
            // tao mot doi tuong cho student -> student01
            Student student1 = new Student(1,"Chinh");
            students.add(student1);
            // sau do add vao students
            Student student2 = new Student(2,"Truong");
            students.add(student2);
            Student student3 = new Student(3,"Tung");
            students.add(student3);

        }
            // show students list
        public void displayStudent(){
            System.out.println("================================================================");
            for (int i = 0; i < students.size(); i++){
                System.out.println(" " + students.get(i));
            }
        }

        public void updateStudent(){
            System.out.println("Enter index of students to update");
            int idx = main.in.nextInt();
            if (idx < students.size()){
                System.out.println("We update the student " + idx + "for you");
                Student newStudent = new Student(3,"Jhon wick");
                students.set(idx, newStudent);
                displayStudent();
        }else{
            System.out.println("Invalid Index");
        }
    }

        public void deleteStudent(Scanner in) {
            System.out.println("Enter index of student to Remove: ");
            int idx = main.in.nextInt();
            if (idx < students.size()) {
                System.out.println("We Remove the student " + idx + "for you");
                students.remove(idx);
                displayStudent();
            } else {
                System.out.println("Invalid Index");
            }
        }
    }