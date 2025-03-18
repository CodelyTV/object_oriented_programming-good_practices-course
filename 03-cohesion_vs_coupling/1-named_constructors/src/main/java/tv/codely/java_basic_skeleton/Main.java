package tv.codely.java_basic_skeleton;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UserId userId = new UserId(UUID.randomUUID().toString());
        UserFullName fullName = new UserFullName(new UserName("Javier"), new UserLastName("Ferrer"));
        User userWithConstructor = new User(userId, fullName, AccessLevel.admin, LocalDateTime.now());

        System.out.println("User created with constructor:");
        System.out.println("ID: " + userWithConstructor.id());
        System.out.println("Full name: " + userWithConstructor.fullName());
        System.out.println("Access level: " + userWithConstructor.accessLevel());
        System.out.println("Registration date: " + userWithConstructor.registeredAt());

        User userWithNamedConstructor = User.register(UUID.randomUUID().toString(), "Rafa", "Gómez");

        System.out.println("\nUser created with named constructor:");
        System.out.println("ID: " + userWithNamedConstructor.id());
        System.out.println("Full name: " + userWithNamedConstructor.fullName());
        System.out.println("Access level: " + userWithNamedConstructor.accessLevel());
        System.out.println("Registration date: " + userWithNamedConstructor.registeredAt());
    }
}
