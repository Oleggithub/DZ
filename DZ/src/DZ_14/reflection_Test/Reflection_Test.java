package DZ_14.reflection_Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Reflection_Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        User user = new User("name1", "name1");
        System.out.println("user = " + user);
        System.out.println(User.class.getName());
        Class aClass1 = Class.forName(User.class.getName());//выводим путь пакета
        Object o1 = aClass1.newInstance();
        System.out.println("o1 = " + o1);

        Constructor[] constructors = User.class.getConstructors();

        int count = 0;

        for (Constructor constructor : constructors) {
            System.out.println("constructor number" + count++);
            System.out.println("constructor = " + constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("parameter = " + parameter.getName());
                System.out.println("parameter = " + parameter.getType());
            }
            int modifiers = constructor.getModifiers();// показывает модификаторы
            System.out.println("constructor = " + getAllModifaers(modifiers));
        }


//        Class aClass = User.class.getClass(); // получили тип данных класса User
//        Object o = aClass.newInstance(); //
//        System.out.println("o = " + o);

    }

    private static String getAllModifaers(int modifaer) {
        StringBuilder answer = new StringBuilder();
        if (Modifier.isAbstract(modifaer)) {
            answer.append("abstract");
        }
        if (Modifier.isPublic(modifaer)) {
            answer.append("public");
        }
        if (Modifier.isFinal(modifaer)) {
            answer.append("final");
        }
        if (Modifier.isStatic(modifaer)) {
            answer.append("static");
        }
        return answer.toString();
    }

}
