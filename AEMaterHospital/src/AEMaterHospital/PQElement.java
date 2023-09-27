/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AEMaterHospital;

/**
 *
 * @author Hamilton1
 */
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