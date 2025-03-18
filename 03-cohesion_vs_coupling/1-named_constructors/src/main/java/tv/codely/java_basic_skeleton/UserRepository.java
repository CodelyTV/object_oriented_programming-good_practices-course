package tv.codely.java_basic_skeleton;

import java.util.Optional;

public interface UserRepository {
    Optional<User> search(String id);
}
