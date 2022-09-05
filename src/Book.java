import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublished == book.yearOfPublished && Objects.equals(nameOfAuthor, book.nameOfAuthor) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, author, yearOfPublished);
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
