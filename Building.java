/**
 * This class models a building
 * @author Jeremy Knight
 */

public class Building {
    String name;
    String address;
    /**
     * initialize the buidling given a name and an address
     * @param name specifies the name building
     * @param address specifies the address of the building
     */
    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }
    /**
     * @return name
     */
    public String getName() { return name; }
    /**
     * @param name is set
     */
    public void setName(String name) { this.name = name;}

    /**
     * @return address
     */
    public String getAddress() {return address;}

    /**
     * @param address is set
     */
    public void setAddress(String address) { this.address = address; }

    
}
