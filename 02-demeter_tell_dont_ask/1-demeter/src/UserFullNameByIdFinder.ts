import { UserRepository } from "./UserRepository";

export class UserFullNameByIdFinder {
	constructor(private readonly repository: UserRepository) {}

	find(id: string): string {
		const user = this.repository.search(id);

		if (user === null) {
			throw new Error(`The user ${id} does not exist`);
		}

		return `${user.fullName.name.value} ${user.fullName.lastName.value}`;
	}
}
