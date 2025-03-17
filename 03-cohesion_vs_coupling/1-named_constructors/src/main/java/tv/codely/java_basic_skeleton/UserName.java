package tv.codely.java_basic_skeleton;

public record UserName(String value) {
    public UserName {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("UserName cannot be empty");
        }
    }

    @Override
    public String toString() {
        return value;
    }
} 