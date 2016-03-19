package DZ_14.reflection_Test.Razbor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.LinkedList;

public class MyClass {
    int field1 = 1;
    private Constructor[] fields;

    public MyClass(Constructor[] fields) {
        this.fields = fields;
    }

    public MyClass() {
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        //int field1;
        //Получение объекта типа Class
        MyClass a = new MyClass();

        Class aclass = a.getClass();
        System.out.println("Reflect ---------------------------------------------");
        System.out.println("Class objecta a = " + aclass);
        Class aclass1 = MyClass.class;
        Class iclass = Integer.class;
        System.out.println("Type class = " + iclass);
        // Получение имени класса если имя не известно
        System.out.println("Object na pryamyjy = " + aclass1);
        Class c = Class.forName("DZ_14.reflection_Test.Razbor.MyClass");
        System.out.println("Name of Class if name ??? = " + c);
        // Получение имени класса
        String s = c.getName();
        System.out.println("Name of Class = " + s);


        // Исследование модификаторов класса
        System.out.println("Modifaer ---------------------------------------------");
        Class c1 = a.getClass();
        int mods = c1.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("Modifaer for " + c.getName()+ " - > " + "public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("Modifaer for " + c.getName()+ " - > " + "abstractc");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("Modifaer for " + c.getName()+ " - > " + "final");
        }
        // Нахождение суперклассов
        //Class c = myObj.getClass();
        System.out.println("Superclass ---------------------------------------------");
        Class superclass = c.getSuperclass();
        System.out.println("superclass = "+ " for " + c.getName() + " -> " + superclass);

        //Определение интерфейсов, реализуемых классом
        System.out.println("Interfaces ---------------------------------------------");
        Class c2 =  LinkedList.class;
        Class[] interfaces = c2.getInterfaces();
        for(Class cInterface : interfaces) {
            System.out.println( "Interfaces = " + cInterface.getName() );
        }
        //Исследование, получение и установка значений полей класса.
        System.out.println("Fields ---------------------------------------------");

        //Class c3 = a.getClass();
        System.out.println("Fields for " + iclass);
        Field[] publicFields = iclass.getFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();

            System.out.println("Name: " + field.getName());
            System.out.println("Type: " + fieldType.getName());
        }
        //Получаем все скрытые поля
        Field[] nameField = aclass1.getDeclaredFields();
        System.out.println("Closed Fields for = " + aclass1 + " -> " + Arrays.toString(nameField));
        //задать значение поля     ?????
//        Field[] field = aclass1.getDeclaredFields();
//        field.set(aclass1, "New name");


        //Исследование конструкторов класса
        System.out.println("Constructors ----------------------------------------");
        Class c3 = a.getClass();
        Constructor[] constructors = c3.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " 111");
            }
            System.out.println();
        }
//        Class[] paramTypes = new Class[] { String.class, int.class };
//        Constructor aConstrct = c.getConstructor(paramTypes);
//        System.out.println("aConstrct = " + aConstrct);


//Исследование информации о методе, вызов метода.
        System.out.println("Methods-----------------------------------------------" );

        Class c4 = a.getClass();
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Method type: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Type of parameters: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }


    }


    @Override
    public String toString() {
        return "MyClass{" +
                "fields=" + Arrays.toString(fields) +
                '}';
    }
}
