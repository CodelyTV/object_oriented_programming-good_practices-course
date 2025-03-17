import { User } from "../src/User";
import { UserFullName } from "../src/UserFullName";
import { UserFullNameByIdFinder } from "../src/UserFullNameByIdFinder";
import { UserId } from "../src/UserId";
import { UserLastName } from "../src/UserLastName";
import { UserName } from "../src/UserName";
import { UserRepository } from "../src/UserRepository";

describe("UserFullNameByIdFinder", () => {
	const validUuid = "550e8400-e29b-41d4-a716-446655440000";

	const mockUserRepository: UserRepository = {
		search: jest.fn((id: string) => {
			if (id === validUuid) {
				return new User(
					new UserId(validUuid),
					new UserFullName(new UserName("Javier"), new UserLastName("Ferrer")),
				);
			}

			return null;
		}),
	};

	it("throw an error searching a non existing user", () => {
		const nonExistingUuid = "550e8400-e29b-41d4-a716-446655440001";

		const finder = new UserFullNameByIdFinder(mockUserRepository);

		expect(() => {
			finder.find(nonExistingUuid);
		}).toThrow(`The user ${nonExistingUuid} does not exist`);

		expect(mockUserRepository.search).toHaveBeenCalledWith(nonExistingUuid);
	});

	it("return an existing user full name", () => {
		const finder = new UserFullNameByIdFinder(mockUserRepository);

		const result = finder.find(validUuid);

		expect(result).toBe("Javier Ferrer");
		expect(mockUserRepository.search).toHaveBeenCalledWith(validUuid);
	});
});
