import { UserLastName } from "./UserLastName";
import { UserName } from "./UserName";

export class UserFullName {
	constructor(
		public readonly name: UserName,
		public readonly lastName: UserLastName,
	) {}
}
