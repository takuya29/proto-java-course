package simple;

import com.example.options.AnotherDummy;
import example.simple.SimpleOuterClass;

import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        AnotherDummy message1 = AnotherDummy.newBuilder().build();

        SimpleOuterClass.Simple message = SimpleOuterClass.Simple.newBuilder()
                .setId(42)
                .setIsSimple(true)
                .setName("My Name")
                .addSimpleList(1)
                .addSimpleList(2)
                .addSimpleList(3)
                .addAllSimpleList(Arrays.asList(4, 5, 6))
                .build();

        System.out.println(message);
    }
}
