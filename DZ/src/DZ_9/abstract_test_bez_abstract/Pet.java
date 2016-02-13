package DZ_9.abstract_test_bez_abstract;

public class Pet {
    private String name;

    public Pet() {
        System.out.println("default constructor -> Pet");

    }
    public Pet(String name) {
       this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice (){
        System.out.println("pet voice -> )");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
