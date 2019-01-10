/**
 * this class models a person
 * @author Jeremy Knight
 */


public class Person {
    String name;
    int age;
    long phoneNumber;

    /**
     * initializes person
     */
    public Person(String name, int age, long phoneNumber) {
        this.name=name;
        this.age=age;
        this.phoneNumber = phoneNumber;
    }

    
    /**
     * @return the name
     */
    public String getName() { return name; }
    /**
     * @param name the name to set
     */
    public void setName(String name) { this.name = name; }

    /**
     * @return the age
     */
    public int getAge() { return age; } //PT -- make sure to validate age. -2
    /**
     * @param age the age to set
     */
    public void setAge(int age) { this.age = age; }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() { return phoneNumber; }
    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    /**
     * @return string of person
     */
    public String toString() {
        return name + " " + age;
    }



}
