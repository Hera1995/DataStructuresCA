
package q1_appointment;

public class AppointmentApp {
    public static void main(String[] args) {
        Appointment appt1 = new Appointment("X222","Amy", "087 2222222", "Gum tenderness", "Poot canal procedure");
        Appointment appt2 = new Appointment("X333","Brian", "087 3333333", "Gum sore", "Teeth cleaning");
        Appointment appt3 = new Appointment("X444","Ciara", "087 4444444", "pain", "Tooth removal");
        Appointment appt4 = new Appointment("X555","Damen", "087 5555555", "Yellow teeth", "Teeth whitening");
        Appointment appt5 = new Appointment("X666","Emma", "087 6666666", "Lack of teeth", "Tooth plant");        
        
        
       LinkedListAppointment myList = new LinkedListAppointment();
        myList.add(appt1);
        myList.add(appt2);
        myList.add(appt3);
        myList.add(appt4);
        myList.add(appt5);
        System.out.println("Appointments added");
        System.out.println(myList.toString());        
        System.out.println("");
        
        System.out.println("Check if the list is empty? " + myList.isEmpty());        
        System.out.println("");
        
        System.out.println( myList.getAppointment(3));    
        System.out.println("");
        
        System.out.println("removed " + myList.remove("X222"));
        System.out.println(myList.toString());
              
    }    
}
