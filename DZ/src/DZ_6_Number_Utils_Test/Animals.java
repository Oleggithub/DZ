package DZ_6_Number_Utils_Test;
/* Д_З №6 Мирошниченко Олег задача - создать кастомный класс, который содержал бы, как минимум 5 методов(с различным
возвращаемым значением)+ содержал как минимум 5 полей(атрибутов); продемонстрировать работоспособность посредством
тестового класса, создав там объекты, проверяемого кастомного класса;*/
public class Animals {
    public String name;
    public int weight;
    public int age;
    public double height;
    public String breed;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}
    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}
    public static void main(String[] args) {
        Animals dog = new Animals();
        dog.setName("Барсик.");
        dog.setWeight(10);
        dog.setAge(8);
        dog.setHeight(0.7);
        dog.setBreed("Немецкая овчарка.");
        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Вес собаки: " + dog.getWeight() + " " + "кг.");
        System.out.println("Возраст собаки: " + dog.getAge() + " " + "лет.");
        System.out.println("Рост собаки: " + dog.getHeight() + " " + "м.");
        System.out.println("Порода собаки: " + dog.getBreed());    }
}
