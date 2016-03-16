package DZ_20.generic_with;

public class SecurityBoxTest {
    public static void main(String[] args) {
        SecurityBox<Integer> securityBox = new SecurityBox();
        //Передаю Integer
        securityBox.setSecurityThing(Integer.MAX_VALUE);
        Integer integer = (Integer) securityBox.getSecurityThing();
        System.out.println("integer = " + integer);
        //Передаю строку
        SecurityBox<String> securityBox1 = new SecurityBox();
        securityBox1.setSecurityThing("security xxxx");
        //проблема передаем строку а приводим к Integer т.е. в след строке мы
       // Integer securityThing = (Integer) securityBox1.getSecurityThing();
    }
}
