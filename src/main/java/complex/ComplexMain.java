package complex;

import example.complex.ComplexOuterClass;

import java.util.Arrays;

public class ComplexMain {
    private static ComplexOuterClass.Dummy newDummy(int id, String name) {
        return ComplexOuterClass.Dummy.newBuilder()
                .setId(id)
                .setName(name)
                .build();
    }

    public static void main(String[] args) {
        ComplexOuterClass.Complex message = ComplexOuterClass.Complex.newBuilder()
                .setOneDummy(newDummy(5, "One Dummy"))
                .addAllDummies(Arrays.asList(
                        newDummy(66, "Second Dummy"),
                        newDummy(66, "Third Dummy"),
                        newDummy(66, "Fourth Dummy")
                ))
                .build();

        System.out.println(message);
    }
}
