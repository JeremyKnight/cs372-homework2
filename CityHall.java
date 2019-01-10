/**
 * This class models a city hall
 * @author Jeremy Knight
 */

import java.util.ArrayList;


public class CityHall extends Building{
    ArrayList peopleInBuilding = new ArrayList();

    /**
     * intializes cityHall
     * @param name sets name
     * @param address sets address
     */

    public CityHall(String name, String address){
        super(name, address);
    }
    /**
     * @param person gets added to peopleInBuidling arraylist
     */
    public void addPerson(Person person) {
        peopleInBuilding.add(person);
    }

    /**
     * removes person at place
     */
    public void removePerson(int place) {
        //might change later to actually search though the array for an actual person
        peopleInBuilding.remove(place);
    }
    
    /**
     * @return person at i
     */
    public Person getPerson(int i) {
        return (Person)peopleInBuilding.get(i);
    }
    /**
     * @return number of people in building
     */
    public int getNumberOfPeople() {
        return peopleInBuilding.size();
    }

    /**
     * @return Person when given a certain person
     */
    public Person getPerson(Person person) {
        for(int i =0; i<peopleInBuilding.size();i++) {
            Person p = (Person)peopleInBuilding.get(i);
            if(p.getName()==person.getName() && p.getAge() == person.getAge()) {
                return p;
            }
        }
        System.out.println("person doesn't exist in array");
        Person p = new Person("I don't exist", 0, 0);
        return p;
    }
}
