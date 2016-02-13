package DZ_8.Lesson8;

public class User {
    private String name;
    private UserRolls userRoles;

    public User(String name, UserRolls userRoles) {
        this.name = name;
        this.userRoles = userRoles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRolls getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRolls userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userRoles=" + userRoles +
                '}';
    }
}

