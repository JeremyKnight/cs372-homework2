/**
 * This class models an employee
 * @author Jeremy Knight
 */

public interface Employee {
    /**
     * gives pay to empolyee
     */
    public void givePay();

    /**
     * 
     * @param employeeId creates the employee id
     */
    public void askEmployeeId(int employeeId);

    /**
     * @return employees current pay
     */
    public double getPay();

    /**
     * @param pay gets set
     */
    public void setPay(double pay);
}