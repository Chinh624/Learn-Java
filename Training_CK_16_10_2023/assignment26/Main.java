package Training_CK_16_10_2023.assignment26;

public class Main {
    public static void bubbleSortByID(Employee[] employees, boolean ok) {
        if (ok) {
            for (int last = employees.length - 1; last >= 0; last--) {
                for (int i = 0; i < last; i++) {

                    if (employees[i].getID().compareTo(employees[i + 1].getID()) > 0) {
                        swap(employees, i, i + 1);
                    }
                }
            }
        } else {
            for (int last = employees.length - 1; last >= 0; last--) {
                for (int i = 0; i < last; i++) {
                    if (employees[i].getID().compareTo(employees[i + 1].getID()) < 0) {
                        swap(employees, i, i + 1);
                    }
                }
            }
        }
    }

    public static void raise(Employee[] employees) {
        bubbleSortByID(employees, true);
    }

    public static void reduce(Employee[] employees) {
        bubbleSortByID(employees, false);
    }

    public static void swap(Employee[] employees, int a, int b) {
        Employee temp = employees[a];
        employees[a] = employees[b];
        employees[b] = temp;
    }

    static void printArray(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee("A05", "Tran Quang", 7);
        employeeList[1] = new Employee("A03", "Nguyen An", 7);

        employeeList[2] = new Employee("A01", "Truong Phung", 5);
        employeeList[3] = new Employee("A04", "Pham Thi Lam", 2);
        employeeList[4] = new Employee("A02", "Truong Van", 5);
        System.out.println("Normally");
        printArray(employeeList);
        System.out.println("after sort raise");
        raise(employeeList);
        printArray(employeeList);
        System.out.println("after sort Reduce");
        reduce(employeeList);
        printArray(employeeList);
    }

}
