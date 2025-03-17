export class UserName {
	constructor(public readonly value: string) {
		if (value.length < 3) {
			throw new Error("The user name must be at least 3 characters long");
		}
	}
}
