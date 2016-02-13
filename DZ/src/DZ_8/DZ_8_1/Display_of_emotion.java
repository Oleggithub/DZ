package DZ_8.DZ_8_1;

public enum Display_of_emotion {
    BE_GLAD(){
        @Override
        public String toString() {
            return ":-)";
        }
    },
    BE_MELANCHOLY(){
        @Override
        public String toString() {
            return ":-(";
        }
    }
}
