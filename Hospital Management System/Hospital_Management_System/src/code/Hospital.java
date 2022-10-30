/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Rajvi
 */
public class Hospital {
    String hospitalName;
    String hospitalAddress;
    String cityName;
    String hospitalZipCode;
    String type;
    //private DoctorDirectory doctorDirectory;
    //private PatientDirectory patientDirectory;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getHospitalZipCode() {
        return hospitalZipCode;
    }

    public void setHospitalZipCode(String hospitalZipCode) {
        this.hospitalZipCode = hospitalZipCode;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   /* public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    */
    @Override
    public String toString(){
      return hospitalName;}
    
}
