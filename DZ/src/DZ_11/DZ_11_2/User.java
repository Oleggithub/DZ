package DZ_11.DZ_11_2;

public class User {
    private String login;
    private String password;
    private User_Role user_role;

    public User(String login, String password) {
        this.login = login;
        this.password = password;

    }

    public User(String login, String password, User_Role user_role) {
        this.login = login;
        this.password = password;
        this.user_role = user_role;
    }

    public User(String testUser) {
        this.login = testUser;
    }

    public User_Role getUser_role() {
        return user_role;
    }

    public void setUser_role(User_Role user_role) {
        this.user_role = user_role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", user_role=" + user_role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return !(password != null ? !password.equals(user.password) : user.password != null);

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
