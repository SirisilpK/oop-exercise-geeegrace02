public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return this.id;
    }

    public void setId() {
        this.id = this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    public int transferTo(Account account, int amount) {
        if (amount <= this.balance) {
            account.balance += amount;
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    public String toString() {
        return "OOP_Excersise.Exercise1.Account[id=" + this.id + ",name=" + this.name + "balance=" + this.balance + "]";
    }
}