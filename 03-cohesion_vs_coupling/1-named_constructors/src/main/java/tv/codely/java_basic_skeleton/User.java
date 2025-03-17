package tv.codely.java_basic_skeleton;

import java.time.LocalDateTime;

public record User(UserId id, UserFullName fullName, AccessLevel accessLevel, LocalDateTime registeredAt) {

    public static User register(String id, String name, String lastName) {
        UserId userId = new UserId(id);
        UserName userName = new UserName(name);
        UserLastName userLastName = new UserLastName(lastName);
        UserFullName fullName = new UserFullName(userName, userLastName);

        return new User(
            userId,
            fullName,
            AccessLevel.normalUser,
            LocalDateTime.now()
        );
    }
}
