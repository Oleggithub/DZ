package DZ_16.Clone.Clone_1.Poverxnostno_Clone;

class User implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}

public class App {

    public static void main(String[] args) {

        User user = new User();

        user.setName("Иванов");
        user.setAge(25);

        System.out.println("Данные до клонирования: " +
                user.getName() + " - " + user.getAge() + "лет");

        User clone;
        try {
            clone = user.clone();
            clone.setName("Петров");
            clone.setAge(30);
            System.out.println("Клон после изменения данные: " +
                    clone.getName() + " - " + clone.getAge() + "лет");

        } catch (CloneNotSupportedException e) {
            System.out.println("Объект не может быть клонированным.");
        }


        System.out.println("Оригинал, после манипуляций с клоном: " +
                user.getName() + " - " + user.getAge() + "лет");
    }
}