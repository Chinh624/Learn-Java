package Buoi4_t5;

public class StudentNode {
    private StudentNode next;
    private StudentNode previous;

    public StudentNode() {
    }

    public StudentNode(Student2 student) {
        this.employee = student;
    }

    public Student getEmployee(employee) {
        return employee;
    }

    public void setEmployee(Student employee) {
        this.employee = employee;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    public StudentNode getPrevious() {
        return previous;
    }

    public void setPrevious(StudentNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "EmployeeNode{" + "employee=" + employee + '}';
    }
}
