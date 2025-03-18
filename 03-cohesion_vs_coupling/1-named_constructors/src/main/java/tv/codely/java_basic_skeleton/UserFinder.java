package tv.codely.java_basic_skeleton;

public class UserFinder {
    private final UserRepository repository;

    public UserFinder(UserRepository repository) {
        this.repository = repository;
    }

    public User find(String id) {
        var user = repository.search(id);

        if (user.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        return user.get();
    }
}
