import java.util.Scanner;

public class Teacher extends Person implements Employee {
    int gradeLevel;
    String certification;
    double pay;
    int employeeId;
    public Teacher(String name, int age, int phoneNumber, int gradeLevel, String certification, double pay){
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

    public void askEmployeeId() {
        java.util.Scanner scnr = new Scanner(System.in);
        System.out.println("enter employee id: ");
        employeeId = scnr.nextInt();
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