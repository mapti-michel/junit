package br.acc.junit;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private double salary;
    private String firstName;
    private String lastName;
    private int id;
    private Character gender;
    private String role;
    private String type;
    ArrayList<String> projects;


    public Employee(String firstName, String lastName, int id, char gender, String role, Double salary, String type){

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
        this.type = type;
        this.projects = new ArrayList<>();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void ajustSalary(double adjAmount){
        salary = salary + adjAmount;
    }

    public void validateLasName() throws Exception{
        if(!this.lastName.matches("^[a-zA-Z]*$")){
            throw new RuntimeException("The last name can only contain alphabets");
        }
    }

    public void addProject(String projectName){
        projects.add(projectName);
    }

    public List<String> getProjects(){
        return projects;
    }

}
