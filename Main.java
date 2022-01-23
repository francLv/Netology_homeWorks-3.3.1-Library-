//package ru.netology;

// import ru.netology.users.LibrarianAdmin;
// import ru.netology.users.ReaderImpl;
// import ru.netology.users.SuppliesReader;

public class Main {

    public static void main(String[] args) {
        // создадим наших участников 
        ReaderImpl dima = new ReaderImpl("Дима");
        LibrarianAdmin nastya = new LibrarianAdmin("Настя");
        SuppliesReader petya = new SuppliesReader("Петя");
        Book book1 = new Book("Гипербаллойд инженера Гарина");
        Book book2 = new Book("Война и мир");
        String[] books = new String[]{
                "Гипербаллойд инженера Гарина",
                "Война и мир",
                "Одноэтажная Америка"
        };

        nastya.outBook(petya, book1);
        dima.takeBook(nastya, book2);
        nastya.orderBook(books, petya);
        petya.suppleBook(nastya, books);
        nastya.notifyBack(petya);


    }
}
