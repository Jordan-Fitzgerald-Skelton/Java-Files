/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AEMaterHospital;

/**
 *
 * @author Hamilton1
 */
public class Patient {

    private String sName;
    private String sSymptom;

    public Patient() {
        sName = new String();
        sSymptom = new String();
    }

    public void setsName(String sInName) {
        sName = sInName;
    }

    public void setsSymptom(String sInSymptom) {
        sSymptom = sInSymptom;
    }

    public String getsName() {
        return sName;
    }

    public String getsSymptom() {
        return sSymptom;
    }
}
