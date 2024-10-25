public class Book2_2 {
    private String name;
    private Author2_2[] authors;
    private double price;
    private int qty = 0;

    public Book2_2(String name, Author2_2[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2_2(String name, Author2_2[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author2_2[] getAuthors() {
        return authors;
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

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (Author2_2 author : authors) {
            names.append(author.getName()).append(", ");
        }
        if (names.length() > 0) {
            names.setLength(names.length() - 2);
        }
        return name.toString();
    }

    public String toString() {
        return "Book[name = " + name + ", authors =( " + getAuthorNames() + "), price = " + price + ", qty = " + qty + "]";
    }
}


