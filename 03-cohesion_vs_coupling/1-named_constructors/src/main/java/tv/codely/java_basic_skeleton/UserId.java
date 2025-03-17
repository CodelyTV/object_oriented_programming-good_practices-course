package tv.codely.java_basic_skeleton;

import java.util.UUID;

public record UserId(String value) {
    public UserId {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("UserId cannot be empty");
        }

        try {
            UUID.fromString(value);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("UserId must be a valid UUID", e);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
