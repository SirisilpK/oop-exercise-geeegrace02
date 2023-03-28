public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public int setID(int id) {
        return this.id = id;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        return this.salary += this.salary * percent / 100;
    }

    public String toString() {
        return "OOP_Excersise.Exercise1.Employee[id=" + this.id + ",name=" + this.firstname + " " + this.lastname + ",salary=" + this.salary + "]";
    }
}