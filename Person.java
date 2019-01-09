public class Person {
    String name;
    int age;
    int phoneNumber;

    public Person(String name, int age, int phoneNumber) {
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
    public int getAge() { return age; }
    /**
     * @param age the age to set
     */
    public void setAge(int age) { this.age = age; }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() { return phoneNumber; }
    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public String toString() {
        return name + " " + age;
    }



}