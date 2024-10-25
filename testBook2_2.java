public class testBook2_2 {
    public static void main(String[] args) {
        Author2_2[] authors = new Author2_2[2];
        authors[0] = new Author2_2("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author2_2("Paul Tan", "PaulTan@nowhere.com", 'm');

        Book2_2 javaDummy = new Book2_2("Java for Dummy", authors, 19.99,99);
        System.out.println(javaDummy);
    }
}
