public class Book {
    private String name;
    private String author;
    private  int yearOfPublication;
    public Book(String name, String author, int  yearOfPublication) {
        this.name = name;
        this.author =  author;
        this.  yearOfPublication = yearOfPublication ;
    }

    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public  int getYearOfPublication(){
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString() {
        return " Имя: " +  name  +  "/  Автор: " +  author +"/  Год публикации: " +  yearOfPublication;
    }
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.name);
    }
    public boolean equals2 (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return author.equals (book.author);
    }
    public int hashCode() {
        return (int) yearOfPublication * name.hashCode() * author.hashCode();
    }











}


