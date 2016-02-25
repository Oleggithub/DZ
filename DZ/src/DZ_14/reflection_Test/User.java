package DZ_14.reflection_Test;

public class User {
    private String name;
    private String surName;
    private int age;

    public User() {
        name = "default";

    }

    public User(int age) {
        this.age = age;
    }

    public User(String name, String surName) {
        this.name = name;
    }

    private void privatMethod(){
        System.out.println("I am private method - > class User");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
