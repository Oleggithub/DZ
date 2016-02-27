package DZ_16.Clone.Lesson16Homework;

public class User implements UserMBean {
    private String name;
    private String serName;
    private int age;
    private UserMBean userClone;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", serName='" + serName + '\'' +
                ", age=" + age +
                ", userClone=" + userClone +
                '}';
    }

    @Override
    public String printCloneInfo() {
        return userClone == null ? "click clone btn" : userClone.toString();
    }

    public User() {
    }

    public User(String name, String serName, int age, UserMBean userClone) {
        this.name = name;
        this.serName = serName;
        this.age = age;
        this.userClone = userClone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSerName() {
        return serName;
    }

    @Override
    public void setSerName(String serName) {
        this.serName = serName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public UserMBean getUserClone() {
        return userClone;
    }

    @Override
    public void setUserClone(UserMBean userClone) {
        this.userClone = userClone;
    }

    @Override
    public String clone() throws CloneNotSupportedException {
        userClone = (UserMBean) super.clone();
        return userClone.toString();//super.clone();
    }
}
