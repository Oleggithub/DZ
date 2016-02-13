package DZ_9.abstract_test;

abstract public class Pet {
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

    abstract public void voice (); //он дефолтивный и Pet не знает как звучит голос чайлдов
    // и дает им самим говорить своим голосомгарантирум что будет у чаилдов свой голос

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
