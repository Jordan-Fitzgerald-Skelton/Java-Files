/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationapp;

/**
 *
 * @author Jordan
 */
//The class defines the format of one item/element from the priroty queue
//Each element has the object with the information to be stored and the iKey/priority assigned to that object
public class PQElement {
    private int iKey;
    //declares an instance of the Patient class.
    //Allows for the use of the methods contained in the Patient Class
    private Patient patient;
    public PQElement(int iInPriority, Patient inPatient) {
        iKey = iInPriority;
        patient = inPatient;
    }
    public int getiKey() {
        return iKey;
    }
    public void setiKey(int iInKey) {
        iKey = iInKey;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient inPatient) {
        patient = inPatient;
    }
    //prints the patients, name, age and if they have symptoms or not
    public String printPatient() {
        String sMessage;
        sMessage = "Name = " + patient.getsName() + " * Age = " + patient.getsAge() + " * Symptoms = " + patient.issSymptom();
        return sMessage;
    }
}
