import java.util.ArrayList;

public class CityHall extends Building{
    ArrayList peopleInBuilding = new ArrayList();
    public CityHall(String name, String address){
        super(name, address);
    }

    public void addPerson(Person person) {
        peopleInBuilding.add(person);
    }
    public void removePerson(int place, Person person) {
        //might change later to actually search though the array for an actual person
        peopleInBuilding.remove(place);
    }

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