import java.util.Scanner;

enum role {
    Patrol, Sargent, Captain, Chief
}

public class Police extends Person implements Employee {
    double pay;
    int employeeId=0;
    public Police(String name, int age, int phoneNumber, double pay){
        super(name, age, phoneNumber);
        this.pay= pay;
    }

    public void givePay() {
        System.out.println(name + " has been payed " + pay + "dollars");
    }

    @Override
    public void askEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public double getPay() {
        return pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }



}