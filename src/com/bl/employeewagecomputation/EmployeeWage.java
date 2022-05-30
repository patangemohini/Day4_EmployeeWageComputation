package com.bl.employeewagecomputation;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Using oops!");
        CheckEmpWage checkEmpWage = new CheckEmpWage();
        checkEmpWage.checkAttendanceAndWage("Wipro", 20, 20, 100);
        checkEmpWage.checkAttendanceAndWage("Infosys", 22, 25, 120);
    }
}