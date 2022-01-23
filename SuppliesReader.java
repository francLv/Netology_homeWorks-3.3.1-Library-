// package ru.netology.users;

// import ru.netology.Book;
// import ru.netology.interfases.Admin;
// import ru.netology.interfases.Librarian;
// import ru.netology.interfases.Reader;
// import ru.netology.interfases.Supplies;

import java.util.Arrays;

public class SuppliesReader extends User implements Supplies, Reader {

    public SuppliesReader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Admin admin, Book book) {
        System.out.println("Читатель получил книгу " + book + " от администратора " + admin);
    }

    @Override
    public void returnBook(Admin admin, Book book) {
        System.out.println("Читатель венул книгу " + book + " администратору " + admin);
    }

    @Override
    public void suppleBook(Librarian librarian, String[] titles) {
        System.out.println("Поставщик привез книги " + Arrays.toString(titles) + " библиотекарю " + librarian);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
