package DZ_9.DZ_9_1;

public class Boing implements Fly {

    @Override
    public void name_fly() {
        System.out.println("Наименование: Боинг 840");
    }

    @Override
    public void speed_fly() {
        System.out.println("Скорость: 800 км/ч.");

    }

    @Override
    public void weight_fly() {
        System.out.println("Вес: 10 тонн.");

    }

    @Override
    public void n_pass_fly() {
        System.out.println("Пассажиров: 138 чел.");

    }

    @Override
    public void security_fly() {
        System.out.println("Безопастность: 12 ступеней защиты.");

    }
}
