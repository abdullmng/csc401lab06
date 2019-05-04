/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author MUHAMMAD
 */
public class Employee3 {
    private int iDNumber;
    private String name;
    private double salary;
    
    public Employee3(int iDNumber, String name, double salary) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.salary = salary;
    }
    
    public Employee3(String name, int iDNumber, double salary) {
        this(iDNumber, name, salary);
    }
    
    public Employee3(int iDNumber, String name) {
        this(iDNumber, name, 0.0);
    }
    
    public Employee3(String name, int iDNumber) {
        this(iDNumber, name, 0.0);
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getId() {
        return iDNumber;
    }
    public String getName() {
        return name;
    }
    public double getSal() {
        return salary;
    }
    
    public void deductions(double telephoneBills) {
        salary -= telephoneBills;
    }
    public void deductions(double telephoneBills, double medicalBills) {
        salary -= (telephoneBills + medicalBills);
    }
    public void raiseSalary(double perIncrease) {
        salary += salary * perIncrease/100;
    }
    public String toString() {
        String details = "ID Number: " + iDNumber + "\n" + "Name: " + name + "\n" + "Salary: " + salary + "\n";
        return details;
    }
}
