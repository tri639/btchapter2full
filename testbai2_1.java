public class testbai2_1 {
    public static void main(String[] args) {
        bai2_1 ahTeck = new bai2_1("Tan Ah Teck", "ahteck@nowhewe.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("PaulTan@nowhere.com");
        System.out.println("Name is: " + ahTeck.getName());
        System.out.println("Email is: " + ahTeck.getEmail());
        System.out.println("Gender is: " + ahTeck.getGender());


    }
}
