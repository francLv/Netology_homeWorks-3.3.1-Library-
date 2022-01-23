// package ru.netology.users;

// import ru.netology.Book;
// import ru.netology.interfases.Admin;
// import ru.netology.interfases.Librarian;
// import ru.netology.interfases.Reader;
// import ru.netology.interfases.Supplies;

import java.util.Arrays;

public class LibrarianAdmin extends User implements Librarian, Admin {

    public LibrarianAdmin(String name) {
        super(name);
    }

    @Override
    public void orderBook(String[] titles, Supplies supplies) {
        System.out.println("Библиотекарь заказал книги " + Arrays.toString(titles) + " у поставщика " + supplies);
    }

    @Override
    public void outBook(Reader reader, Book book) {
        System.out.println("Библиотекарь выдал книгу " + book + " читателю " + reader);
    }

    @Override
    public void notifyBack(Reader reader) {
        System.out.println("Администратор напомнил читателю " + reader + " о просрочке");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
