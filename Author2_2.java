public class Author2_2 {
    private String name;
    private String email;
    private char gender;

    public Author2_2(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Author[name = " + name + ", email = " + email + ", gender = " + gender + "]";
    }
}
