package tv.codely.java_basic_skeleton;

import java.time.LocalDateTime;

public class User {
    private final UserId id;
    private final UserFullName fullName;
    private final AccessLevel accessLevel;
    private final LocalDateTime registeredAt;

    public User(UserId id, UserFullName fullName, AccessLevel accessLevel, LocalDateTime registeredAt) {
        this.id = id;
        this.fullName = fullName;
        this.accessLevel = accessLevel;
        this.registeredAt = registeredAt;
    }

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

    public UserId id() {
        return id;
    }

    public UserFullName fullName() {
        return fullName;
    }

    public AccessLevel accessLevel() {
        return accessLevel;
    }

    public LocalDateTime registeredAt() {
        return registeredAt;
    }
}
