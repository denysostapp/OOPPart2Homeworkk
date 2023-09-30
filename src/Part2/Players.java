package Part2;

public class Items {
    public String name;
    public int price;
    private int yearOfBirth;
    //getter and setter for yearOfBirth
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public Items(String name, int price, int yearOfBirth){
        this.name = name;
        this.price = price;
        this.yearOfBirth = yearOfBirth;
    }
}
