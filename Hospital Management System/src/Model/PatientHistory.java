/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author naman
 */
public class PatientHistory {
    
    private ArrayList<Patient> history;
    
public PatientHistory() {

   this.history= new ArrayList<Patient>();
}

    public ArrayList<Patient> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Patient> history) {
        this.history = history;
    }
   
public Patient addNewPatient()
{
        Patient patient = new Patient();
        history.add(patient);
        return patient;

}

public void deletePatient(Patient vs )
{
history.remove(vs);
}
        }
