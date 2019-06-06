package OOP.OOPBasics.Inheritance.Exercises.Problem2;

public class Book {
    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    protected String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        String[] authorNames = author.split(" ");
        if(authorNames.length > 1){
            if(Character.isDigit(authorNames[1].charAt(0))){
                throw new IllegalArgumentException("Author not valid!");
            }
        }
        this.author = author;
    }

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        if(title.length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        if(price < 1){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
