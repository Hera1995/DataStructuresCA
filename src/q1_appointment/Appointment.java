
package q1_appointment;


public class Appointment {
    //clarify data members
    public String pCode;
    public String pName;
    public String phoneNum;
    public String symptoms;
    public String diagnosis;
    
    //constructors
    public Appointment(String pCode, String pName, String phoneNum, String symptoms, String diagnosis) {
        this.pCode = pCode;
        this.pName = pName;
        this.phoneNum = phoneNum;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
    }
    
    //Setters and getters
    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
       
    //toString method to print the infomation in given format
    @Override
    public String toString() {
        return "Appointment \n" +
                "Patient Code: " + "\"" + this.pCode + "\"" + "\n" +
                "Patient Name: " + "\"" + this.pName + "\"" + "\n" +
                "Patient Phone NO.: " + this.phoneNum + "\n" +
                "Symptoms: " + "\"" + this.symptoms + "\"" + "\n" +
                "Diagnosis: " + "\"" + this.diagnosis + "\"";           
    }
    
    //a main method to test the toString method and print the given information
    public static void main(String[] args) {
        //create a new object of Appointment
        Appointment appt1 = new Appointment("X123", "Enda Stafford", "087 1234567", 
                "Gum tenderness", "Root canal procedure");
        System.out.println(appt1);        
    }
    
}
