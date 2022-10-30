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
public class HospitalDirectory {
    public ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory() {
        this.hospitalDirectory = new ArrayList<Hospital>();
        
    }

    
    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
     public Hospital addNewHospital()
    {
        Hospital newHospital = new Hospital();
        hospitalDirectory.add(newHospital);
        return newHospital;
    }
    public void DeleteHospital(Hospital hospital){
        hospitalDirectory.remove(hospital);
    }
     public void addHospitalToList(Hospital hospital){
        hospitalDirectory.add(hospital);
    }
}
