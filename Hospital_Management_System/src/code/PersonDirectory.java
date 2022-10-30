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
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    private String personFirstName;
    private String personLastName;
    private int personAge;
    private String personGender;
    private String personContactNumber;
    private String personRole;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonHistory() {
        return personDirectory;
    }
    
    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personDirectory = personHistory;
    }
    
    public Person createAndAddPerson() {
        Person person = new Person(personFirstName, personLastName,personAge,personGender,personContactNumber,personRole);
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }
    
    public void addPersonToList(Person person){
        personDirectory.add(person);
    }
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonFirstName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}
