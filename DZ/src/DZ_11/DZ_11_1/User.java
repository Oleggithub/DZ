package DZ_11.DZ_11_1;

import java.util.Scanner;

public class User {

    private String login;
    private String password;
    private User_Roles userRole;

    public User() {
    }

    public User(String login, String password, User_Roles userRole) {
        this.login = login;
        this.password = password;
        this.userRole = userRole;
    }

    public static void main(String[] args) {

        User[] users = new User[1];
        for (int i = 0; i < users.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя:");
            String login = sc.nextLine();
            System.out.println("Введите пароль:");
            String password = sc.nextLine();
            System.out.println("Введите Ваш статну USER or ADMIN:");
            String userRole = sc.nextLine();
            User currentUser = new User(login, password, User_Roles.valueOf(userRole));
            users[i] = currentUser; // Заполняем массив элементами, введёнными с клавиатуры
        }
        //System.out.print ("Inserted array elements:");
        for (int i = 0; i < users.length; i++) {
            System.out.print("->" + users[i]); // Выводим на экран, полученный массив
        }
        //или
//        System.out.println("using Arrays for output instead cycle");
//        System.out.print(Arrays.toString(users));
//        System.out.println();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
