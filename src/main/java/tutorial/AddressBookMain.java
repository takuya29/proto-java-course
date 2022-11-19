package tutorial;

import com.example.tutorial.protos.Person;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddressBookMain {


    private static void writeTo(Person message, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            message.writeTo(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFrom(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            System.out.println(Person.parseFrom(fis));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String toJSON(Person message) throws InvalidProtocolBufferException {
        return JsonFormat.printer().print(message);
    }

    private static Person fromJSON(String json) throws InvalidProtocolBufferException {
        Person.Builder builder = Person.newBuilder();
        JsonFormat.parser().merge(json, builder);
        return builder.build();
    }

    public static void main(String[] args) throws InvalidProtocolBufferException {
        Person message = Person.newBuilder()
                .setId(42)
                .setName("my name")
                .setEmail("aaa@bbb.ccc")
                .build();

        String path = "./person.bin";
        writeTo(message, path);
        readFrom(path);

        String json = toJSON(message);
        System.out.println(fromJSON(json));
    }
}
