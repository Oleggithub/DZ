package DZ_8.DZ_8_1;

public class Emotions {
     String joy;
     String sorrow;
     Display_of_emotion display_of_emotion;

    public Display_of_emotion getDisplay_of_emotion() {
        return display_of_emotion;
    }

    public void setDisplay_of_emotion(Display_of_emotion display_of_emotion) {
        this.display_of_emotion = display_of_emotion;
    }

    public Emotions(String joy, String sorrow) {
        this.joy = joy;
        this.sorrow = sorrow;
    }

    public String getJoy() {
        return joy;
    }

    public void setJoy(String joy) {
        this.joy = joy;
    }

    public String getSorrow() {
        return sorrow;
    }

    public void setSorrow(String sorrow) {
        this.sorrow = sorrow;
    }

    @Override
    public String toString() {
        return "Emotions{" +
                "joy='" + joy + '\'' +
                ", sorrow='" + sorrow + '\'' +
                ", display_of_emotion=" + display_of_emotion +
                '}';
    }
}
