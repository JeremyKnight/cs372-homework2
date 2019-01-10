//PT -- missing javadoc. -2

//PT -- This is a good chance for an abstract class
public class Building {
    String name;
    String address;
    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public String getAddress() {return address;}
    public void setAddress(String address) { this.address = address; }

    
}
