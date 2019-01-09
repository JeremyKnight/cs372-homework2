import java.util.ArrayList;

public class CityHall extends Building{
    ArrayList peopleInBuilding = new ArrayList();
    public CityHall(String name, String address){
        super(name, address);
    }

    public void addPerson(Person person) {
        peopleInBuilding.add(person);
    }
    
    public Person getPerson(int i) {
        return (Person)peopleInBuilding.get(i);
    }

    public int getNumberOfPeople() {
        return peopleInBuilding.size();
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