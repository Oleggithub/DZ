package DZ_7.extend_example;

public class User {
    private String name;
    private String serName;

    public User() {
        System.out.println("constructor User -> default");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }
}
