/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.ArrayList;

/**
 *
 * @author Rajvi
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;
    String personFirstName;
    String personLastName;
    int personAge;
    String personGender;
    String personContactNumber;
    String personRole;
    String patientID;
    String patientHeight;
    String patientWeight;
    String patientBloodGroup;
    String patientUserName;
    String patientPassword;
    
    
    public PatientDirectory() {
        patientDirectory = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientHistory() {
        return patientDirectory;
    }
    
    public void setPatientHistory(ArrayList<Patient> patientDirectoryList) {
        this.patientDirectory = patientDirectoryList;
    }
    
    public Patient createAndAddPatient() {
        
        Patient createPatient;
        createPatient = new Patient(personFirstName, personLastName,personAge,personGender,personContactNumber,personRole,patientID, patientHeight, patientWeight, patientBloodGroup,patientUserName, patientPassword);
        patientDirectory.add(createPatient);
        return createPatient;
    }
    
    public void addPatientToList(Patient createPatient){
        patientDirectory.add(createPatient);
    }
    
    public void deletePatient(Patient createPatient) {
        patientDirectory.remove(createPatient);
    }
    public ArrayList<Patient> searchPatient(String key)
    {
        ArrayList<Patient> searchPatientDirectory = new ArrayList();
        for(Patient patient: patientDirectory)
        {
            if(patient.getPatientID().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(patient.getPatientID()!=null)
                {
                    searchPatientDirectory.add(patient);
                }
                
            }
        }
        return searchPatientDirectory;
    }
}
