public class Customer {
    private int ID;
    private String name;
    private char gender;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        if (gender != 'm' && gender != 'f') {
            System.out.println("Gender is either 'm' or 'f'");
        } else {
            this.gender = gender;
        }

    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        if (gender != 'm' && gender != 'f') {
            System.out.println("Gender is either 'm' or 'f'");
        } else {
            this.gender = gender;
        }

    }

    public double getDiscount() {
        return (double)this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return this.name + "(" + this.ID + ")";
    }
}