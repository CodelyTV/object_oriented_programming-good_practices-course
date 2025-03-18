package tv.codely.java_basic_skeleton;

import java.time.LocalDateTime;

public final class UserRegistrar {
    private final UserRepository repository;

    public UserRegistrar(UserRepository repository) {
        this.repository = repository;
    }

    public void register(String id, String name, String lastName) {
        var user = new User(
            new UserId(id),
            new UserFullName(new UserName(name), new UserLastName(lastName)),
            AccessLevel.normalUser,
            LocalDateTime.now()
        );

        repository.save(user);
    }
}
