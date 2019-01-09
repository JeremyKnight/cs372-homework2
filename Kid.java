//Javadoc for class, and constructor. -1

public class Kid extends Person{
    String favoriteCandy;
    public Kid(String name, int age, int phoneNumber, String favoriteCandy){
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
