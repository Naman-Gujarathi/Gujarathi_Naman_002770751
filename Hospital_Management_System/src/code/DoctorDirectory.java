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
public class DoctorDirectory {
    public ArrayList<Doctor> doctorDirectory; 
    String personFirstName;
    String personLastName;
    int personAge;
    String personGender;
    String personContact;
    String personRole;
    int DoctorID;
    String DoctorDepartment;
    String DoctorDegree;
    String DoctorHospital;
    String DoctorUsername;
    protected String DoctorPassword;
    
    public DoctorDirectory(){
        this.doctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorListDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
     public Doctor addNewDoctor()
    {
        Doctor NewDoctor = new Doctor(personFirstName, personLastName,personAge,personGender,personContact,personRole,DoctorID,DoctorDepartment,DoctorDegree,DoctorHospital,DoctorUsername,DoctorPassword);
        doctorDirectory.add(NewDoctor);
        return NewDoctor;
    }
    public void DeleteDoctor(Doctor doc)
    {
        doctorDirectory.remove(doc);
    }
    
     public void addDoctorToList(Doctor NewDoctor){
        doctorDirectory.add(NewDoctor);
    }
    
    
}
    

