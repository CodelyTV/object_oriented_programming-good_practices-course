from user_name import UserName
from user_last_name import UserLastName

class UserFullName:
    def __init__(self, name, last_name):
        self.name = name
        self.last_name = last_name

    def formatted(self):
        return f"{self.name} {self.last_name}"
        
    def __str__(self):
        return self.formatted()
