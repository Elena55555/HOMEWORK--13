import javax.xml.namespace.QName;



public class Main {

    public static void main(String[] args) {

        System.out.println("Домашняя работа № 12");

        System.out.println("Задание № 1");

        System.out.println(" ");



        Book book = new Book(" Война и мир ", "  Лев Толстой",       1863  );
        System.out.println("book.name = " + book.getName());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.yearOfPublication = " + book.getYearOfPublication());

        System.out.println(" ");

        Book book2 = new Book ("Гранатовый браслет", "А. И. Куприн", 1911);
        System.out.println("book2.name = " + book2.getName() );
        System.out.println("book2.author = " + book2.getAuthor() );
        System.out.println("book2.yearOfPublication = " + book2.getYearOfPublication() );

        System.out.println(" ");

        Book book3 = new Book ("Преступление и наказание", "Ф.М. Достоевский ", 1867);
        System.out.println("book3.name = " + book3.getName());
        System.out.println("book3.author = " + book3.getAuthor() );
        System.out.println("book3.yearOfPublication = " + book3.getYearOfPublication() );

        System.out.println(" ");

        System.out.println("Изменяем год публикации с помощью сеттера");
        book.setYearOfPublication(1864);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        System.out.println(" ");

        System.out.println("Задание № 2");

        System.out.println(" ");

        Author author = new Author(" Лев", "  Толстой " );
        System.out.println("author.name = " + author.getName());
        System.out.println("author.surname = " + author.getSurname());

        System.out.println(" ");

        Author author2 = new Author("  Александр ", "Куприн " );
        System.out.println("author2.name = " + author2.getName());
        System.out.println("author2.surname = " + author2.getSurname());

        System.out.println(" ");

        Author author3 = new Author("Федор", "Достоевский" );
        System.out.println("author3.name = " + author3.getName());
        System.out.println("author3.surname = " + author3.getSurname());
        System.out.println(" ");
        System.out.println("Использован метод  to String в классe Book   ");
        System.out.println(book);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(" ");
        System.out.println("Использован метод to String в классe Author  ");
        System.out.println(author);
        System.out.println(author2);
        System.out.println(author3);

        System.out.println(" ");

        System.out.println("Используем  метод equals  ");
        System.out.println("Присвоили  book_2  и book  ссылку на ячейку памяти 1 - ячейки стали одинаковые и равны");
        Book book_2 = book;
        System.out.println(book.equals(book_2 ));
        System.out.println(" ");

        System.out.println("Решили реальную задачу по сравнению названий  книг с вызовом метода equals ");

        System.out.println(book.getName().equals(book.getName()));
        System.out.println(book.getName().equals(book2.getName()));
        System.out.println(book2.getName().equals(book3.getName()));

        System.out.println(" ");

        System.out.println("Решили реальную задачу по сравнению авторов книг с вызовом метода equals ");

        System.out.println(book.getAuthor().equals(book.getAuthor()));
        System.out.println(book.getAuthor().equals(book2.getAuthor()));
        System.out.println(book2.getAuthor().equals(book3.getAuthor()));

        System.out.println(" ");


        System.out.println("Не решили  задачу по сравнению годов публикаций книг с вызовом метода equals " +
                "(не работает с int");

        System.out.println(" ");

        // System.out.println(book.getYearOfPublication().equals(book.getYearOfPublication()));
        // System.out.println(book.getYearOfPublication().equals(book2.getYearOfPublication()));
        // System.out.println(book2.getYearOfPublication().equals(book3.getYearOfPublication()));



        System.out.println("Решили реальную задачу по сравнению имен авторов с вызовом метода equals в классе Автор ");

        System.out.println(author.getName().equals(author.getName()));
        System.out.println(author.getName().equals(author2.getName()));
        System.out.println(author2.getName().equals(author3.getName()));

        System.out.println("Решили реальную задачу по сравнению фамилий авторов с вызовом метода equals в классе Автор ");

        System.out.println(author.getSurname().equals(author.getSurname()));
        System.out.println(author.getSurname().equals(author2.getSurname()));
        System.out.println(author2.getSurname().equals(author3.getSurname()));

        System.out.println("Используем неодинаковые поля -  метод  hashCode");
        System.out.println(new Book ("Война и Мир ",  " Лев Толстой",  1863).hashCode());
        System.out.println(new Book ("Гранатовый браслет ",  " Александр Куприн",  1911).hashCode());
        System.out.println(new Book ("Преступление и наказание",  " Федор Достоевский",  1867).hashCode());
        System.out.println(new Author("Лев ",  "   Толстой").hashCode());
        System.out.println(new Author("Федор ",  "   Достоевский").hashCode());
        System.out.println(new Author("Александр ",  "   Куприн").hashCode());
        System.out.println(new Author("Александр ",  "   Куприн").hashCode());



        //  с помощью hashCode() можно проверять ошибки
        // Ошибка! Использовав разные поля для equals() и hashCode() мы нарушили установленный для них контракт!
        //
        //У двух равных по equals() объектов должен быть одинаковый хэш-код. Мы же получили для них разные значения.
        //
        //Подобные ошибки могут привести к самым невероятным последствиям, особенно при работе с коллекциями, использующими хэш.
        //
        //Поэтому при переопределении equals() и hashCode() правильно будет использовать одни и те же поля.
        System.out.println(" Используем одинаковые поля для  equals() и hashCode() (пример)");
        System.out.println(author.getName().hashCode());
        System.out.println(author.getName().hashCode());

        System.out.println(author2.getName().hashCode());
        System.out.println(author2.getName().hashCode());

        System.out.println(book.getName().hashCode());
        System.out.println(book.getName().hashCode());

        System.out.println(book2.getName().hashCode());
        System.out.println(book2.getName().hashCode());

        System.out.println(book3.getName().hashCode());
        System.out.println(book3.getName().hashCode());












    }
}


