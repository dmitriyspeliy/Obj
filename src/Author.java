public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
