package DZ_16.Clone.Clone_1.Gluboko_Clone;

import java.util.Calendar;
import java.util.GregorianCalendar;

class User implements Cloneable {
    private String name;
    private int age;
    private GregorianCalendar birthday;

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

    public String getBirthday() {
        return birthday.get(Calendar.DAY_OF_MONTH) + "." +
                birthday.get(Calendar.MONTH) + "." +
                birthday.get(Calendar.YEAR);
    }

    public void setBirthday(int day, int month, int year) {
        birthday = new GregorianCalendar();
        birthday.set(Calendar.DAY_OF_MONTH, day);
        birthday.set(Calendar.MONTH, month);
        birthday.set(Calendar.YEAR, year);
    }

    public User clone() throws CloneNotSupportedException {
        User clone = (User)super.clone();
        clone.birthday = (GregorianCalendar) birthday.clone();
        return clone;
    }
}

public class App {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Иванов");
        user.setAge(25);
        user.setBirthday(12, 03, 1975);

        System.out.println("Данные до клонирования: " + user.getName() + " - " + user.getAge() + "лет, день рождение: " + user.getBirthday());

        User clone;
        try {
            clone = user.clone();
            clone.setName("Петров");
            clone.setAge(30);
            clone.setBirthday(15, 11, 1992);

            System.out.println("Клон после изменения данные: " + clone.getName() + " - " + clone.getAge() + "лет, день рождение: " + clone.getBirthday());

        } catch (CloneNotSupportedException e) {
            System.out.println("Объект не может быть клонированным.");
        }


        System.out.println("Оригинал, после манипуляций с клоном: " + user.getName() + " - " + user.getAge() + "лет, день рождение: " + user.getBirthday());
    }
}