from user_id import UserId
from user_name import UserName
from user_last_name import UserLastName
from user_full_name import UserFullName

class User:
    def __init__(self, user_id, name, last_name):
        self.id = UserId(user_id)
        self.full_name = UserFullName(
            UserName(name),
            UserLastName(last_name)
        )
    
    def display_information(self):
        return f"User ID: {self.id}, Full Name: {self.full_name}" 