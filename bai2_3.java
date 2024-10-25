public class bai2_3 {
    private String name;
    private String email;

    public bai2_3(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return "Author[name = " + name + ", email = " + email +"]";
    }
}
class book {
    private String isbn;
    private String name;
    private bai2_3 author;
    private double price;
    private int qty = 0;

    public book(String isbn, String name, bai2_3 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public book(String isbn, String name, bai2_3 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getName() {
        return name;
    }
    public bai2_3 getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public String toString() {
        return "Book[isbn = " + isbn + ", name = " + name + ", " + author.toString() + ", price = " + price + ", qty = " + qty + "]";
    }

}
