package tv.codely.java_basic_skeleton;

import java.util.Optional;

public interface UserRepository {
    void save(User user);

    Optional<User> search(String id);
}
