package DZ_9.DZ_9_3;

abstract public class Boat {
    private String ship_name;
    private String plot_name;

//    public Boat(String ship_name, String plot_name) {
//        this.ship_name = ship_name;
//        this.plot_name = plot_name;
//    }


    public Boat(String ship_name) {
        this.ship_name = ship_name;
    }


    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getPlot_name() {
        return plot_name;
    }

    public void setPlot_name(String plot_name) {
        this.plot_name = plot_name;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "ship_name='" + ship_name + '\'' +
                ", plot_name='" + plot_name + '\'' +
                '}';
    }

    public void info_trans() {
        //return getShip_name();
        //getPlot_name();

    }
}
