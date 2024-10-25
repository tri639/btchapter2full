public class Customer2_5 {
    private int id;
    private String name;
    private char gender;

    public Customer2_5(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + "(" + id + ")";
    }
}
class testCustomer {
    public static void main(String[] args) {
        Customer2_5 customer = new Customer2_5(112, "NguyenDucTri", 'm');
        System.out.println(customer);
    }
}
