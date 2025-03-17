import { UserFullName } from "./UserFullName";
import { UserId } from "./UserId";

export class User {
	constructor(
		public readonly id: UserId,
		public readonly fullName: UserFullName,
	) {}
}
