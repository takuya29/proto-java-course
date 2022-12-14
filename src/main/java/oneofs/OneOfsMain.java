package oneofs;

import example.oneofs.Oneofs;

public class OneOfsMain {
    public static void main(String[] args) {
        Oneofs.Result message = Oneofs.Result.newBuilder()
                .setMessage("a message")
                .build();

        System.out.println("hasMessage: " + message.hasMessage());
        System.out.println("hasMessage: " + message.hasId());
        System.out.println(message);

        Oneofs.Result message2 = Oneofs.Result.newBuilder(message)
                .setId(42)
                .build();
        System.out.println("hasMessage: " + message2.hasMessage());
        System.out.println("hasMessage: " + message2.hasId());
        System.out.println(message2);

        Oneofs.Result message3 = Oneofs.Result.newBuilder()
                .setId(42)
                .setMessage("message")
                .build();
        System.out.println("hasMessage: " + message3.hasMessage());
        System.out.println("hasMessage: " + message3.hasId());
        System.out.println(message3);
    }
}
