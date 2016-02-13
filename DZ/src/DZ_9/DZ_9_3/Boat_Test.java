package DZ_9.DZ_9_3;

public class Boat_Test {
    public static void main(String[] args) {
        Ship ship = new Ship("This is Ship");
        System.out.println("ship = " + ship.getShip_name());
        ship.info_trans();
        Plot plot = new Plot("This is Plot");
        System.out.println("plot.getPlot_name() = " + plot.getPlot_name());
        plot.info_trans();
    }
}
