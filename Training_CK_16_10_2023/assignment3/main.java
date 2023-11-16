package Training_CK_16_10_2023.assignment3;

public class main {
    public static void main(String[] args) {
        Patient a1 = new Patient(0, "Long", "Nguyen", "No", 100);
        Patient a2 = new Patient(1, "Tinh", "Nguyen", "No", 155);
        Patient a3 = new Patient(2, "An", "Ngo", "Yen", 105);
        Patient a4 = new Patient(3, "Hoang", "Tran", "No", 185);
        Patient a5 = new Patient(4, "Ngoc", "Huynh", "No", 185);
        PatientDoublyLinkedList objPatientDoublyLinkedList = new PatientDoublyLinkedList();
        objPatientDoublyLinkedList.insertAtTail(a1);
        objPatientDoublyLinkedList.insertAtTail(a2);
        objPatientDoublyLinkedList.printList();
        System.out.println(objPatientDoublyLinkedList.count());
        PatientDoublyLinkedList objPatientDoublyLinkedList2 = new PatientDoublyLinkedList();
        objPatientDoublyLinkedList2.insertAtHead(a1);
        objPatientDoublyLinkedList2.insertAtHead(a2);
        objPatientDoublyLinkedList2.insertAtHead(a3);
        objPatientDoublyLinkedList2.insertAtHead(a4);
        objPatientDoublyLinkedList2.insertAtHead(a5);
        objPatientDoublyLinkedList2.printList();
        System.out.println(objPatientDoublyLinkedList2.count());
        objPatientDoublyLinkedList2.sortByName();
    }
}
