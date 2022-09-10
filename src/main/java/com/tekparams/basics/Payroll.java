package com.tekparams.basics;

import com.tekparams.OOPS.Employee;

public class Payroll extends Employee {
    Double bonus=10000.87;

    void printPayroll(){
        System.out.println(super.empCode);
        System.out.println(super.empName);
        System.out.println(super.basic);
        System.out.println(bonus);
    }


    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        payroll.printPayroll();
    }
}
