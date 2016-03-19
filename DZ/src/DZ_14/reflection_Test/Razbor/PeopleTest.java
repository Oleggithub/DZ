package DZ_14.reflection_Test.Razbor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static jdk.internal.org.objectweb.asm.Type.getType;

public class PeopleTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //Получение объекта типа Class
        People people = new People();
        Class myClass = people.getClass();
        System.out.println("myClass = " + myClass);
        //Если у нас есть класс, для которого в момент компиляции известен тип, то получить экземпляр класса ещё проще.
        Class myClass1 = People.class;
        System.out.println("myClass1 = " + myClass1);
        //Если имя класса не известно в момент компиляции, но становится известным во время выполнения программы,
        // можно использовать метод forName(), чтобы получить объект Class.
        Class c = Class.forName("DZ_14.reflection_Test.Razbor.People");
        System.out.println("c = " + c);
        //Получение пакета
        Package p = People.class.getPackage();
        System.out.println("package " + p.getName() + ";");
        //Выводим интерфейсы, которые реализует класс
        Class[] interfaces = myClass.getInterfaces();
        for (int i = 0, size = interfaces.length; i < size; i++) {
            System.out.print(i == 0 ? "implements " : ", ");
            System.out.print(interfaces[i].getSimpleName());
        }
        System.out.println(" {");
        //Выводим поля класса
        Field[] fields = People.class.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("\t" + field.getModifiers() + field.getType() + " " + field.getName() + ";");
        }
        //Выводим методы, аннотации класса
        Method[] methods = People.class.getDeclaredMethods();
        for (Method m : methods) {
            Annotation[] annotations = m.getAnnotations();
            System.out.print("\t");
            for (Annotation a : annotations)
                System.out.print("@" + a.annotationType().getSimpleName() + " ");
            System.out.println();

            System.out.print("\t" + m.getModifiers() + getType(m.getReturnType()) + " " + m.getName() + "(");
            System.out.print(m.getParameters());
            System.out.println(") { }");
        }
    }



}
