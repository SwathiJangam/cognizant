# 1. Lists

product_names = []

def add_product(name):
    if name not in product_names:
        product_names.append(name)
        print(f"Product '{name}' added.")
    else:
        print(f"Product '{name}' already exists.")

def remove_product(name):
    if name in product_names:
        product_names.remove(name)
        print(f"Product '{name}' removed.")
    else:
        print(f"Product '{name}' not found.")

def update_product(old_name, new_name):
    if old_name in product_names:
        index = product_names.index(old_name)
        product_names[index] = new_name
        print(f"Product '{old_name}' updated to '{new_name}'.")
    else:
        print(f"Product '{old_name}' not found.")

# 2. Dictionaries

product_details = {}

def add_product_detail(name, quantity, price):
    if name not in product_details:
        product_details[name] = {'quantity': quantity, 'price': price}
        print(f"Product details for '{name}' added.")
    else:
        print(f"Product details for '{name}' already exist.")

def update_product_detail(name, quantity=None, price=None):
    if name in product_details:
        if quantity is not None:
            product_details[name]['quantity'] = quantity
        if price is not None:
            product_details[name]['price'] = price
        print(f"Product details for '{name}' updated.")
    else:
        print(f"Product details for '{name}' not found.")

def delete_product_detail(name):
    if name in product_details:
        del product_details[name]
        print(f"Product details for '{name}' deleted.")
    else:
        print(f"Product details for '{name}' not found.")

# 3. Tuples

def create_product_catalog():
    product_catalog = (
        ('Laptop', 10, 999.99),
        ('Smartphone', 50, 499.99),
        ('Tablet', 20, 299.99)
    )
    return product_catalog

def display_product_catalog(catalog):
    for product in catalog:
        print(f"Product: {product[0]}, Quantity: {product[1]}, Price: {product[2]}")

# 4. Sets

product_categories = set()

def add_category(category):
    product_categories.add(category)
    print(f"Category '{category}' added.")

def remove_category(category):
    if category in product_categories:
        product_categories.remove(category)
        print(f"Category '{category}' removed.")
    else:
        print(f"Category '{category}' not found.")

# 5. Combining Collections

def generate_report_sorted_by_price():
    sorted_products = sorted(product_details.items(), key=lambda x: x[1]['price'])
    for name, details in sorted_products:
        print("Product: ",name," Price: ",details['price']," Quantity: ",details['quantity'])

def find_products_in_price_range(min_price, max_price):
    result = {name for name, details in product_details.items() if min_price <= details['price'] <= max_price}
    return result

if __name__ == "__main__":
    # Lists
    add_product("Laptop")
    add_product("Smartphone")
    add_product("Tablet")
    update_product("Tablet", "iPad")
    remove_product("Smartphone")

    # Dictionaries
    add_product_detail("Laptop", 10, 999.99)
    add_product_detail("iPad", 15, 699.99)
    update_product_detail("Laptop", price=949.99)
    delete_product_detail("Smartphone")

    # Tuples
    catalog = create_product_catalog()
    display_product_catalog(catalog)

    # Sets
    add_category("Electronics")
    add_category("Computing")
    remove_category("Computing")

    # Combining Collections
    print("\nProduct Report (Sorted by Price):")
    generate_report_sorted_by_price()

    print("\nProducts in price range 500 - 1000:")
    products_in_range = find_products_in_price_range(500, 1000)
    print(products_in_range)