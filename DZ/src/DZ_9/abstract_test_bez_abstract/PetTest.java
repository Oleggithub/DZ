package DZ_9.abstract_test_bez_abstract;

public class PetTest {
    public static void main(String[] args) {
        Pet pet = new Pet("PetName1");
        System.out.println(pet.getName());
        pet.voice();
        Pet pets[] = {
                new Cat("catName1"),
                new Dog("dogName1")
        };

        for (Pet childPet : pets){
            System.out.println(childPet.getName());
            childPet.voice();
        }

    }
}
