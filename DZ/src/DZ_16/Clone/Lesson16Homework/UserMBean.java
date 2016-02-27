package DZ_16.Clone.Lesson16Homework;

public interface UserMBean extends Cloneable {
    String printCloneInfo();

    String getName();

    void setName(String name);

    String getSerName();

    void setSerName(String serName);

    int getAge();

    void setAge(int age);

    UserMBean getUserClone();

    void setUserClone(UserMBean userClone);

    String clone() throws CloneNotSupportedException;
}
