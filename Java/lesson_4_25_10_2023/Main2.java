package Buoi4_t5;
import Buoi4_t5.Student2;
public class Main2 {
public static void main(String[] args) {
    Student2 e01 = new Student2(111, "A");
    Student2 e02 = new Student2(222, "B");
    Student2 e03 = new Student2(333, "C");
    Student2 e04 = new Student2(444, "D");
    Student2 e05 = new Student2(555, "E");

    StudentList list = new StudentList();
    list.insertAtHead(e01);
    list.insertAtHead(e02);
    list.insertAtHead(e03);
    list.insertAtHead(e04);
    list.insertAtHead(e05);
    list.printList();
    System.out.println("" + list.getSize());

    Student2 e06 = new Student2(666, "End");
    list.insertAtTail(e06, Student2);
    list.printList();
    list.removeFromHead();
}

}
