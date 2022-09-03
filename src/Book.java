public class Book {

    private String nameOfAuthor;
    private Author author;
    private int yearOfPublished;

    public Book(String nameOfAuthor, Author author, int yearOfPublished) {
        this.nameOfAuthor = nameOfAuthor;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfAuthor='" + nameOfAuthor + '\'' +
                ", author=" + author +
                ", yearOfPublished=" + yearOfPublished +
                '}';
    }
}
