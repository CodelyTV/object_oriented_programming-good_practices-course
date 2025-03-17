package tv.codely.java_basic_skeleton;

public record UserLastName(String value) {
    public UserLastName {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("UserLastName cannot be empty");
        }
    }

    @Override
    public String toString() {
        return value;
    }
} 