package Training_CK_16_10_2023.assignment3;

public class PatientNode {
    private Patient patient;
    private PatientNode next;
    private PatientNode previous;

    public PatientNode(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public PatientNode getNext() {
        return next;
    }

    public void setNext(PatientNode next) {
        this.next = next;
    }

    public PatientNode getPrevious() {
        return previous;
    }

    public void setPrevious(PatientNode provious) {
        this.previous = provious;
    }

    public String toString() {
        return "PatientNode [patient=" + patient + ", next=" + next + ", provious=" + previous + "]";
    }
}
