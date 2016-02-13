package DZ_7.DZ_7_6_Dop;

public class Super {
    public String name = "Tort";

    public String getName(){
        return name;
    }
}
class Sub extends Super{
    public String name = "Habr";

    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.name + " " + s.getName());
    }
}