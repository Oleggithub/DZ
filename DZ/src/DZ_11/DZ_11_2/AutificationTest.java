package DZ_11.DZ_11_2;

import java.util.Arrays;
import java.util.Scanner;

public class AutificationTest {
    public static void main(String[] args) {

        User users[] = new User[25];
// Создаем базу ЮЗЕРОВ
        for (int i = 0; i < users.length; i++) {
            if (i % 2 == 0) {
                users[i] = new User("login" + i, "pwd" + i, User_Role.USER);
            } else {
                users[i] = new User("login" + i, "pwd" + i, User_Role.ADMIN);
            }
        }
            System.out.println(Arrays.toString(users));
            //Сравниваемый ЮЗЕР
            Scanner scanner = new Scanner(System.in);
            String login = scanner.nextLine();
            String password = scanner.nextLine();

            User currentuser = new User(login, password);

            for (User usert : users){// бегаю по базе - ищу своего пользователя по логину и паролю
                if (usert.equals(currentuser)){//если нашли совпадение значит могу забрать его роль
                    User_Role userRoleFromDB = usert.getUser_role();//забираю роль для моего юзера из базы
                    currentuser.setUser_role(userRoleFromDB);// присваиваю - меняю
                    break;
                }


            }
            System.out.println(currentuser);
            if(currentuser.getUser_role() == null){// соообщение если в базе пользователя нет то ошибка
                throw new RuntimeException("Error");
            }
        }
}
