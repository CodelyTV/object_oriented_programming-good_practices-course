package tv.codely.java_basic_skeleton;

public final class UserRegistrar {
    private final UserRepository repository;

    public UserRegistrar(UserRepository repository) {
        this.repository = repository;
    }

    public void register(String id, String name, String lastName) {
        User user = User.register(id, name, lastName);
        
        ensureUserDoesNotExist(id);
        
        repository.save(user);
    }
    
    private void ensureUserDoesNotExist(String id) {
        if (repository.search(id).isPresent()) {
            throw new RuntimeException("User already exists");
        }
    }
} 