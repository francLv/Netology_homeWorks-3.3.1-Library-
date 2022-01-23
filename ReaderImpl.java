// package ru.netology.users;

// import ru.netology.Book;
// import ru.netology.interfases.Admin;
// import ru.netology.interfases.Reader;

public class ReaderImpl extends User implements Reader {

    public ReaderImpl(String name) {
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
    public String toString() {
        return super.toString();
    }
}
