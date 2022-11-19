package maps;

import example.maps.Maps;

import java.util.Map;

public class MapExample {

    private static Maps.IdWrapper newIdWrapper(int id) {
        return Maps.IdWrapper.newBuilder().setId(id).build();
    }

    public static void main(String[] args) {
        Maps.MapExample message = Maps.MapExample.newBuilder()
                .putIds("myId1", newIdWrapper(42))
                .putIds("myId2", newIdWrapper(43))
                .putAllIds(Map.of(
                        "myId3", newIdWrapper(44),
                        "myId4", newIdWrapper(45)
                ))
                .build();
        System.out.println(message);
    }
}
