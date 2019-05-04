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
public class Employee1 {
    private int iDNumber;
    private String name;
    private double salary;
    
    public Employee1(int iD, String empName, double empSalary) {
        iDNumber = iD;
        name = empName;
        salary = empSalary;
    }
    
    public Employee1(String empName, int iD, double empSalary) {
        iDNumber = iD;
        name = empName;
        salary = empSalary;
    }
    
    public Employee1(int iD, String empName) {
        iDNumber = iD;
        name = empName;
        salary = 0.0;
    }
    
    public Employee1(String empName, int iD) {
        iDNumber = iD;
        name = empName;
        salary = 0.0;
    }
    
    public void setSalary(double empSal) {
        salary = empSal;
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
    public String printDetails() {
        String details = "ID Number: " + iDNumber + "\n" + "Name: " + name + "\n" + "Salary: " + salary + "\n";
        return details;
    }
}
