package DZ_6_Number_Utils_Test.teach;

public class Teacher {
    private String name;
    private String surName;


    public void setSurName(String surName) {

        this.surName = surName;
    }

    public void setNameAndsetSurName(String surName, String Name) {
        this.name = Name;
        this.surName = surName;
    }


    public String getName() {

        return name;
    }

    public String getSurName() {
        return surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("TestName");
        teacher.setSurName("TestSurName");
    }

}
