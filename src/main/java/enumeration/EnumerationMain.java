package enumeration;

import example.enumerations.Enumerations;

public class EnumerationMain {

    public static void main(String[] args) {
        Enumerations.Enumeration message = Enumerations.Enumeration.newBuilder()
                .setEyeColor(Enumerations.EyeColor.EYE_COLOR_GREEN)
                .build();
        System.out.println(message);
    }
}
