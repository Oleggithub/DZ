package DZ_6_Number_Utils_Test;
/* Д_З №6 Ver.2 Мирошниченко Олег  - создать кастомный класс, который содержал бы, как минимум 5 методов(с различным
возвращаемым значением)+ содержал как минимум 5 полей(атрибутов); продемонстрировать работоспособность посредством
тестового класса, создав там объекты, проверяемого кастомного класса;*/
class Dogs{
    public String name;
    public int weight;
    public int age;
    public double height;
    public String breed;
    // конструктор , используемый при указании всех параметров
    Dogs(String n, int w, int a, double h, String b){
        name = n;
        weight = w;
        age = a;
        height = h;
        breed = b;
    }
    // Методы
    String Name_Dog(){
        return name;
    }
    int Weight_Dog(){
        return weight;
    }
    int Age_Dog(){
        return age;
    }
    double Height_Dog(){
        return height;
    }
    String Breed_Dog(){
        return breed;
    }
}
public class Animals_1 {
    public static void main(String[] args) {
        Dogs dog = new Dogs ("Барсик.",10,8, 0.7, "Немецкая овчарка.");
        System.out.println("Имя собаки: " + dog.Name_Dog());
        System.out.println("Вес собаки: " + dog.Weight_Dog() + " " + "кг.");
        System.out.println("Возраст собаки: " + dog.Age_Dog() + " " + "лет.");
        System.out.println("Рост собаки: " + dog.Height_Dog() + " " + "м.");
        System.out.println("Порода собаки: " + dog.Breed_Dog());}}
