from user import User
from product import Product

def bad_example():
    user = User(1, "Javier", "Ferrer")

    product1 = Product(101, "Smartphone", 799.99)
    product2 = Product(102, "Headphones", 149.99)

    if product1 not in user.saved_products:
        user.saved_products.append(product1)

    if product2 not in user.saved_products:
        user.saved_products.append(product2)

    if not user.saved_products:
        saved_products_text = "No saved products"
    else:
        saved_products_text = f"{user.full_name.name.value} {user.full_name.last_name.value}'s saved products:\n"
        for saved_product in user.saved_products:
            product_id = saved_product.id.value
            product_name = saved_product.name.value
            product_price = saved_product.price.value
            saved_products_text += f"- Product ID: {product_id}, Name: {product_name}, Price: ${product_price:.2f}\n"

    print(saved_products_text)

    user.saved_products.remove(product1)

    remaining_products = len(user.saved_products)
    print(f"Remaining saved products after removal: {remaining_products}")


def good_example():
    user = User(1, "Javier", "Ferrer")

    product1 = Product(101, "Smartphone", 799.99)
    product2 = Product(102, "Headphones", 149.99)

    user.add_to_saved_products(product1)
    user.add_to_saved_products(product2)

    print(user.display_saved_products())

    user.remove_from_saved_products(product1)

    print("After removing a product:")
    print(user.display_saved_products())


if __name__ == "__main__":
    print("Bad example (Ask approach):")
    bad_example()

    print("\nGood example (Tell approach):")
    good_example()
