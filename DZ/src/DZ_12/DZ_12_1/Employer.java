package DZ_12.DZ_12_1;

public class Employer {

    private String name;
    private String company;
    private String role;
    private Employer boss;

    public Employer(Employer boss, String role, String company, String name) {
        this.name = name;
        this.role = role;
        this.boss = boss;
        this.company = company;
    }

    public Employer() {

    }


    public static void main(String[] args) {
        Employer getEmployers = new Employer(new Employer(new Employer(new Employer(),
                "Бухгалтер", "Компания1", "Ирина")
                , "Директор", "Компания1", "Олег")
                ,"Оператор", "Компания1", "Илья");
        System.out.println("getEmployers = " + getEmployers);
//        Employer[] users = new Employer[3];
//        for (int i = 0; i < users.length; i++) {
//            users[i] = getEmployers;
//        }
//        for (int i = 0; i < users.length; i++) {
//            System.out.println("->" + users[i]); // Выводим на экран, полученный массив
//        }

    }


    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", boss=" + boss +
                '}';
    }
}


