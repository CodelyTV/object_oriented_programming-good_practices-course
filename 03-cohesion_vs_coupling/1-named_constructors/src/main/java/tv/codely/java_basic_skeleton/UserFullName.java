package tv.codely.java_basic_skeleton;

public record UserFullName(UserName name, UserLastName lastName) {
    public String value() {
        return name.value() + " " + lastName.value();
    }

    @Override
    public String toString() {
        return value();
    }
} 