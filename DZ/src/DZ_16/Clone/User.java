package DZ_16.Clone;

public class User implements Cloneable {
    private String name;
    private int age;
    private User parent;

    public User() {
    }

    public User(User parent) {
        User user = new User();
        user.parent = parent.getParent();
        user.name = parent.getName();
        user.age = parent.getAge();
        this.parent = user;
    }

    public User lightclone() throws CloneNotSupportedException {
       return (User) super.clone();
    }
    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone(); // при углубленном клонировании
        User parentClone = clone.getParent() == null ? null : clone.getParent().clone(); // проверка на ошибку NullPointer
        clone.setParent(parentClone);
        return clone; // при углубленном клонировании
       // return super.clone(); // при поверхностное клонирование и при objecte
    }

    public User(String name, int age, User parent) {
        this.name = name;
        this.age = age;
        this.parent = parent;
    }

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

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return !(parent != null ? !parent.equals(user.parent) : user.parent != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", parent=" + parent +
                '}';
    }
}
