package DZ_20.generic_without;

public class SecurityBoxTest {
    public static void main(String[] args) {
        SecurityBox securityBox = new SecurityBox();
        //Передаю Integer
        securityBox.setSecurityThing(Integer.MAX_VALUE);
        Integer integer = (Integer) securityBox.getSecurityThing();
        System.out.println("integer = " + integer);
        //Передаю строку
        securityBox.setSecurityThing("security xxxx");
        //проблема передаем строку а приводим к Integer т.е. в след строке мы
        Integer securityThing = (Integer) securityBox.getSecurityThing();
    }
}
