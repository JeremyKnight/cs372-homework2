/**
 * This class models a police man
 * @author Jeremy Knight
 */

import java.util.Scanner;

enum role {
    Patrol, Sargent, Captain, Chief
}

public class Police extends Person implements Employee {
    double pay;
    int employeeId=0;
    role r;

    /**
     * initalizes police
     * @param name set name
     * @param age set age
     * @param phoneNumber set phoneNumber
     * @param pay set pay
     * @param r set role
     */
    public Police(String name, int age, long phoneNumber, double pay, role r){
        super(name, age, phoneNumber);
        this.pay= pay;
        this.r=r;
    }

    /**
     * @param pay gives pay to employee
     */
    public void givePay() {
        System.out.println(name + " has been payed " + pay + " dollars");
    }

    /**
     * @param employeeId set employeeId
     */
    public void askEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    /**
     * @return pay
     */
    public double getPay() {
        return pay;
    }
    /**
     * @param pay set pay
     */
    public void setPay(double pay){
        this.pay = pay;
    }



}