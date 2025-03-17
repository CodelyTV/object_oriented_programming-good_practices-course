from product_id import ProductId
from product_name import ProductName
from product_price import ProductPrice

class Product:
    def __init__(self, product_id, name, price):
        self.id = ProductId(product_id)
        self.name = ProductName(name)
        self.price = ProductPrice(price)
    
    def display_information(self):
        return f"Product ID: {self.id}, Name: {self.name}, Price: {self.price}" 