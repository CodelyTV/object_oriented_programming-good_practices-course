export class UserLastName {
	constructor(public readonly value: string) {
		if (value.length < 3) {
			throw new Error("The user last must be at least 3 characters long");
		}
	}
}
