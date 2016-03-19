package DZ_14.reflection_Test.Razbor;

import java.io.Serializable;

public class People implements Serializable {

    private String name;

    private int age;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Deprecated
    protected static void method(String[] params) { }

}
