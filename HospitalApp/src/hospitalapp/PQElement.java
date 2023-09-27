/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalapp;

/**
 *
 * @author Jordan
 */
//The class defines the format of one item/element from the priroty queue
//Each element has the object with the information to be stored and the iKey/priority assigned to that object
public class PQElement {
      private int iKey;
      private Patient patient;
     
      public PQElement(int iInPriority, Patient inPatient){
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

      public String printPatient() {
          String sMessage ; 
          sMessage = "Name = " + patient.getsName()+ " * Symptoms = " + patient.getsSymptom();
          return sMessage;
      }
}