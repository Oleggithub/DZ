package DZ_9.abstract_test;

public abstract class Fish extends Pet {

    //так как не репализует, не переопределяет метод voice -> abstract в паренте
    //Fish -> тоже становиться абстрактным
    abstract void onlyFishAbstractMetod();

}
class FishChild extends Fish {
    @Override
    void onlyFishAbstractMetod() {

    }

    @Override
    public void voice() {

    }
}
