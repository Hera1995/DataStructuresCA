
package q1_appointment;


public class Node {
    Appointment appt;
    Node next;

    public Node(Appointment appt, Node next) {
        this.appt = appt;
        this.next = next;
    }

    public Node(Appointment appt) {
        this.appt = appt;
    }
    

    @Override
    public String toString(){
        return appt.toString();
    }
    
}

