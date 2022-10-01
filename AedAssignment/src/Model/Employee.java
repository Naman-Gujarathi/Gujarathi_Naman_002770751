/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author naman
 */
public class Employee {
    
    private String empName;
    private int empId;
    private int empAge;
    private String empGender;
    private String empStartDate;
    private String empContactNumber;
    private String empLevel;
    private String empPositionTitle;
    private String empTeamInfo;
    private String empEmail;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(String empStartDate) {
        this.empStartDate = empStartDate;
    }

    public String getEmpContactNumber() {
        return empContactNumber;
    }

    public void setEmpContactNumber(String empContactNumber) {
        this.empContactNumber = empContactNumber;
    }

    public String getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }

    public String getEmpPositionTitle() {
        return empPositionTitle;
    }

    public void setEmpPositionTitle(String empPositionTitle) {
        this.empPositionTitle = empPositionTitle;
    }

    public String getEmpTeamInfo() {
        return empTeamInfo;
    }

    public void setEmpTeamInfo(String empTeamInfo) {
        this.empTeamInfo = empTeamInfo;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    
    @Override
    public String toString(){
      return empName;
    }
    
    
}
