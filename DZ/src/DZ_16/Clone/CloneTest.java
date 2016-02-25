package DZ_16.Clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User parent = new User("parentName", 45, null);
        User child = new User("childName", 23, parent);

        // создаем клон

        //User cloneUser =(User) child.clone(); // при поверхностном клонировании
        User cloneUser = child.clone(); // при углубленном клонировании
        printInformationAboutUsers(child, cloneUser); // печатаем до изменений
        child.lightclone();//поверхностное клонирование

        cloneUser.setName("newCloneName"); // меняем имя
        cloneUser.setAge(25); // меняем возраст
        cloneUser.getParent().setAge(42);// получили парента и пытаемся его поменять
        printInformationAboutUsers(child, cloneUser);// печатаем после изменений
    }

    private static void printInformationAboutUsers(User child, User cloneUser) {
        System.out.println("child = " + child);
        System.out.println("cloneUser = " + cloneUser);
    }
}
