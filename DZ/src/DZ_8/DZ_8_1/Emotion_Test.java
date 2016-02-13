package DZ_8.DZ_8_1;

public class Emotion_Test {
    public static void main(String[] args) {

        Display_of_emotion beglad = Display_of_emotion.BE_GLAD;
        Display_of_emotion bemelancholy = Display_of_emotion.BE_MELANCHOLY;
        for(Display_of_emotion show_enum : Display_of_emotion.values()) {
            System.out.println(show_enum.toString());
        }

        System.out.println("I'am be glad -> " + " " + beglad + " - ordinal: " + beglad.ordinal());
        System.out.println("I'am  be melancholy -> "+  " " + bemelancholy + " - ordinal: " + bemelancholy.ordinal());

    }
}
