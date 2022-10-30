/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Rajvi
 */

    public class Doctor extends Person {
    private int DoctorID;
    private String DoctorDepartment;
    private String DoctorDegree;
    private String DoctorHospital;
    private String DoctorUsername;
    protected String DoctorPassword;
    
    private PatientDirectory patientDirectory;

    public Doctor(String personFirstName, String personLastName, int personAge, String personGender, String personContact, String personRole, int DoctorID, String DoctorDepartment,String DoctorDegree, String DoctorHospital, String DoctorUsername, String DoctorPassword) {
        super(personFirstName, personLastName, personAge, personGender, personContact, personRole);
        this.DoctorID = DoctorID;
        this.DoctorDepartment = DoctorDepartment;
        this.DoctorDegree=DoctorDegree;
        this.DoctorHospital=DoctorHospital;
        this.DoctorUsername=DoctorUsername;
        this.DoctorPassword=DoctorPassword;
        
    }

        public int getDoctorID() {
            return DoctorID;
        }

        public void setDoctorID(int DoctorID) {
            this.DoctorID = DoctorID;
        }

        public String getDoctorDepartment() {
            return DoctorDepartment;
        }

        public void setDoctorDepartment(String DoctorDepartment) {
            this.DoctorDepartment = DoctorDepartment;
        }

        public String getDoctorDegree() {
            return DoctorDegree;
        }

        public void setDoctorDegree(String DoctorDegree) {
            this.DoctorDegree = DoctorDegree;
        }

        public String getDoctorHospital() {
            return DoctorHospital;
        }

        public void setDoctorHospital(String DoctorHospital) {
            this.DoctorHospital = DoctorHospital;
        }

        public String getDoctorUsername() {
            return DoctorUsername;
        }

        public void setDoctorUsername(String DoctorUsername) {
            this.DoctorUsername = DoctorUsername;
        }

        public String getDoctorPassword() {
            return DoctorPassword;
        }

        public void setDoctorPassword(String DoctorPassword) {
            this.DoctorPassword = DoctorPassword;
        }

        public PatientDirectory getPatientDirectory() {
            return patientDirectory;
        }

        public void setPatientDirectory(PatientDirectory patientDirectory) {
            this.patientDirectory = patientDirectory;
        }
    
    
}
