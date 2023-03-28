public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender != 'm' && gender != 'f') {
            System.out.println("Gender is either 'm' or 'f'");
        } else {
            this.gender = gender;
        }

    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String toString() {
        return "Author[name=" + this.name + ",email=" + this.email + ",gender=" + this.gender + "]";
    }
}