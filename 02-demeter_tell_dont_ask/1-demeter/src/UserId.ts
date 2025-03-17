export class UserId {
	constructor(public readonly value: string) {
		if (value.length !== 36) {
			throw new Error("The user id must be a valid uuid");
		}
	}
}
