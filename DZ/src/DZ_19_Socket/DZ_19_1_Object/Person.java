package DZ_19_Socket.DZ_19_1_Object;

import java.io.Serializable;

public class Person implements Serializable{
    int id;
    String name;
    String sername;

    public Person(int id, String name, String sername) {
        this.id = id;
        this.name = name;
        this.sername = sername;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                '}';
    }
}
