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
