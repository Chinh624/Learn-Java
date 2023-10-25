package Buoi3_t5;
public class Main2 {
public static void main(String[] args) {
    Employee e01 = new Employee(111, "A", "Ly");
    Employee e02 = new Employee(222, "B", "Tran");
    Employee e03 = new Employee(333, "C", "Nguyen");
    Employee e04 = new Employee(444, "D", "Pham");
    Employee e05 = new Employee(555, "E", "Van");

    EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
    list.insertAtHead(e01);
    list.insertAtHead(e02);
    list.insertAtHead(e03);
    list.insertAtHead(e04);
    list.insertAtHead(e05);
    list.printList();
    System.out.println("" + list.getSize());

    Employee e06 = new Employee(666, "Bill", "End");
    list.insertAtTail(e06);
    list.printList();
    list.removeFromHead();
}

}
