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
        self.saved_products = []
    
    def display_information(self):
        return f"User ID: {self.id}, Full Name: {self.full_name}" 
    
    def add_to_saved_products(self, product):
        if product not in self.saved_products:
            self.saved_products.append(product)
    
    def remove_from_saved_products(self, product):
        if product in self.saved_products:
            self.saved_products.remove(product)
    
    def display_saved_products(self):
        if not self.saved_products:
            return "No saved products"
        
        result = f"{self.full_name}'s saved products:\n"
        for product in self.saved_products:
            result += f"- {product.display_information()}\n"
        return result 