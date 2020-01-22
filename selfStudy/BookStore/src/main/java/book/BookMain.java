package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        ArrayList<Book> BookStorage = new ArrayList<>();


        ArrayList booklist = null;
        Book book = new Book(null);


       book.setAuthor("kan");
       book.setBookname("kan1");

        System.out.println(book.getAuthor()+""+ book.getBookname());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your BookName : ");

        String BookInput = scanner.nextLine();
        System.out.println("Please type your Author Name : ");
        String authorinput = scanner.nextLine();

            System.out.println("Your Input Value :  " + BookInput);
            BookStorage.add();
            System.out.println(BookStorage);



    }
}
