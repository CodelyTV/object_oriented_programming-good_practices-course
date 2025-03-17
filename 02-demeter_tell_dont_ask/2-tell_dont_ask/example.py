from user import User

def bad_example():
    user = User(1, "Javier", "Ferrer")

    full_name = f"{user.full_name.name.value} {user.full_name.last_name.value}"
    print(f"User ID: {user.id.value}, Full Name: {full_name}")


def good_example():
    user = User(1, "Javier", "Ferrer")

    print(user.display_information())


if __name__ == "__main__":
    print("Bad example (Ask approach):")
    bad_example()

    print("\nGood example (Tell approach):")
    good_example()
