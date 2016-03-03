package DZ_18.DZ_18_1;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private String company;
    private String surname;

    public User() {
    }

    public User(String username, String password, String company, String surname) {
        this.username = username;
        this.password = password;
        this.company = company;
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", company='" + company + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
