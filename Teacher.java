/**
 * This class models a teacher
 * @author Jeremy Knight
 */

import java.util.Scanner;

public class Teacher extends Person implements Employee {
    int gradeLevel;
    String certification;
    double pay;
    int employeeId;
    /**
     * initializes teacher with name, age, phoneNumber, gradelevel, certification, and pay
     */
    public Teacher(String name, int age, long phoneNumber, int gradeLevel, String certification, double pay){
        super(name, age, phoneNumber);
        this.gradeLevel = gradeLevel;
        this.certification = certification;
        this.pay=pay;
    }

    /**
     * @return the certification
     */
    public String getCertification() { return certification; }
    
    /**
     * @param certification the certification to set
     */
    public void setCertification(String certification) { this.certification = certification; }
    
    /**
     * @return the gradeLevel
     */
    public int getGradeLevel() { return gradeLevel; }
   
    /**
     * @param gradeLevel the gradeLevel to set
     */
    public void setGradeLevel(int gradeLevel) { this.gradeLevel = gradeLevel; }

    @Override
    public void askEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void givePay() {
        System.out.println(name + " has been payed " + pay + "dollars");
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }



}