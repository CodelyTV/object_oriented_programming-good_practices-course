package tv.codely.java_basic_skeleton;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, String> GET(String id) {
        var finder = new UserFinder(new FakeUserRepository());

        try {
            var user = finder.find(id);

            return Map.of(
                "id", user.id().value(),
                "fullName", user.fullName().value(),
                "accessLevel", user.accessLevel().toString(),
                "registeredAt", user.registeredAt().toString()
            );
        } catch (RuntimeException e) {
            return new HashMap<>();
        }
    }

    public static void main(String id, String name, String lastName) {
        new UserRegistrar(new FakeUserRepository()).register(id, name, lastName);
    }
}
