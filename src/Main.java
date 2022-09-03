public class Main {
    public static void main(String[] args) {
        Author alexsandrPushkin = new Author("Alexsandr", "Pushkin");
        Author markTven = new Author("Mark", "Tven");
        Book tomSawyer = new Book("The Adventures of Tom Sawyer",markTven,1876);
        Book eugeneOnegin = new Book("Eugene Onegin",alexsandrPushkin,1833);
        eugeneOnegin.setYearOfPublished(1834);

        System.out.println(alexsandrPushkin);
        System.out.println(markTven);
        System.out.println(tomSawyer);
        System.out.println(eugeneOnegin);

    }
}
