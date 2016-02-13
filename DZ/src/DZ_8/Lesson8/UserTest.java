package DZ_8.Lesson8;

public class UserTest {

    public static void main(String[] args) {
        UserRolls admin = UserRolls.ADMIN;

        switch (admin) {
            case ADMIN:
                System.out.println("it's admin role -> " + UserRolls.ADMIN.ordinal());
                break;
            case DEFAULT_USER:
                System.out.println("it's default_user role -> " + UserRolls.DEFAULT_USER.ordinal());
                break;
            case SUPER_ADMIN:
                System.out.println("it's super role -> " + UserRolls.SUPER_ADMIN.ordinal());
                break;
        }


        for(UserRolls userRoles : UserRolls.values()) {
            System.out.println(userRoles.toString());
        }

        System.out.println(UserRolls.ADMIN.toString());
        UserRolls incognitoRole = UserRolls.getUsersRoleByDescription("super_admin_description");
        System.out.println(incognitoRole.name());
    }
}
