package DZ_16.Clone.Clone_1.CloneRazbor;

public class Book implements Cloneable{
    private String name;
    private String author;
    private int age;

    public Book(String name, String author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("Война и мир", "Л. Толстой", 1863);
        Book book2 = book.clone(); // если уберем clone() то будет только ссылка, а если добавим, то новый объект

        System.out.println("book = " + book.getName() + " " + book.author + " " + book.age);
        System.out.println("book2 = " + book2.getName() + " " + book2.author + " " + book2.age);
        book2.setName("Отцы и дети");
        book2.setAuthor("И. Тургенев");
        System.out.println("book = " + book.getName() + " " + book.author + " " + book.age);
        System.out.println("book2 = " + book2.getName() + " " + book2.getAuthor() + " " + book2.age);
    }

        public Book clone() throws CloneNotSupportedException{

//            Book newBook = (Book) super.clone();
//            newBook.author =(Author) author.;
//            return newBook;

            return (Book) super.clone();
        }

}





