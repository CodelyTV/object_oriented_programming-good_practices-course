package tv.codely.java_basic_skeleton;

import java.util.Optional;

public class FakeUserRepository implements UserRepository {
    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> search(String id) {
        return Optional.empty();
    }
}
