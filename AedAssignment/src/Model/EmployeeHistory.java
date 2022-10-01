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
public class EmployeeHistory {
    
    
 private ArrayList<Employee> history;
 
 public EmployeeHistory(){
 
 this.history = new ArrayList<Employee>();
 
 }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee() {
     Employee newEmployee = new Employee();
     history.add(newEmployee);
     return newEmployee;
    
    }
    public void deleteEmployee(Employee vs){
        history.remove(vs);
    
    }
    
}
