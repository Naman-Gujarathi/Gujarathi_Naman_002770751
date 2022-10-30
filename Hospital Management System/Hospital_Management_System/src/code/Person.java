/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Rajvi
 */
public class Person {
    private String personFirstName;
    private String personLastName;
    private int personAge;
    private String personGender;
    private String personContactNumber;
    private String personRole;
    
    public Person(String personFirstName,String personLastName,int personAge,String personGender,String personContactNumber,String personRole){
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personAge = personAge;
        this.personGender = personGender;
        this.personContactNumber = personContactNumber;
        this.personRole = personRole;
            
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public String getPersonContactNumber() {
        return personContactNumber;
    }

    public void setPersonContactNumber(String personContactNumber) {
        this.personContactNumber = personContactNumber;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }
    
    @Override
    public String toString(){
      return personFirstName;}
    
}
    

