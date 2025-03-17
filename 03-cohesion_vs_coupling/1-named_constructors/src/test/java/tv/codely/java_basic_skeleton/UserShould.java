package tv.codely.java_basic_skeleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class UserShould {

	@Test
	void create_a_user_with_named_constructor() {
		// Generate a random UUID
		String uuid = UUID.randomUUID().toString();
		
		// Use the named constructor to create a user
		User user = User.register(uuid, "John", "Doe");
		
		// Assert user properties
		assertEquals(uuid, user.id().value());
		assertEquals("John", user.fullName().name().value());
		assertEquals("Doe", user.fullName().lastName().value());
		assertEquals("John Doe", user.fullName().value());
		assertEquals(AccessLevel.normalUser, user.accessLevel());
		assertNotNull(user.registeredAt());
	}

	@Test
	void save_logs_to_the_file() {
		Logger logger = LogManager.getLogger(UserShould.class);
		RuntimeException error = new RuntimeException("exceptioooon");
		logger.error("Hello error world!", error);
	}
} 