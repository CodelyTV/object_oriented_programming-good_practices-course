class ProductPrice:
    def __init__(self, value):
        self.value = value
        
    def __str__(self):
        return f"${self.value:.2f}" 