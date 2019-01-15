/**
 * This class models a kid
 * @author Jeremy Knight
 */


public class Kid extends Person{
    String favoriteCandy;
    /**
     * initializes the kid with name, age, phonenumber and favoriteCandy
     */
    public Kid(String name, int age, long phoneNumber, String favoriteCandy){
        super(name, age, phoneNumber);
        this.favoriteCandy = favoriteCandy;
    }

    /**
     * @return the favoriteCandy
     */
    public String getFavoriteCandy() {
        return favoriteCandy;
    }
}
