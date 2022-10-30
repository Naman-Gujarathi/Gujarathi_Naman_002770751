/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Rajvi
 */
public class Patient extends Person {
    private String patientID;
    private String patientHeight;
    private String patientWeight;
    private String patientBloodGroup;
    private String patientUsername;
    private String patientPassword;
    
    /*private String primaryDoctorName;
    private String prefferedPharmacy;*/
    private VitalSignHistory vitalSignHistoryList;
    
    public Patient(String personFirstName, String personLastName, int personAge, String personGender, String personContactNumber, String personRole, String patientID, String patientHeight, String patientWeight, String patientBloodGroup, String patientUserName, String patientPassword) {
        super(personFirstName,personLastName,personAge,personGender,personContactNumber,personRole);
        this.patientID=patientID;
        this.patientHeight=patientHeight;
        this.patientWeight=patientWeight;
        this.patientBloodGroup=patientBloodGroup;
        this.patientUsername=patientUserName;
        this.patientPassword=patientPassword;
        
        this.vitalSignHistoryList = new VitalSignHistory();
}

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(String patientHeight) {
        this.patientHeight = patientHeight;
    }

    public String getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(String patientWeight) {
        this.patientWeight = patientWeight;
    }

    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

 

    public VitalSignHistory getVitalSignHistoryList() {
        return vitalSignHistoryList;
    }

    public void setVitalSignHistoryList(VitalSignHistory vitalSignHistoryList) {
        this.vitalSignHistoryList = vitalSignHistoryList;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
    
}
