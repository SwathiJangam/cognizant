def check_inventory(inventory):
    for item, quantity in inventory:
        if quantity == 0:
            print(f"Alert: '{item}' is out of stock!")

inventory_list = [('Lipstick', 10), ('Lip Liner', 0), ('Lip Gloss', 5)]

check_inventory(inventory_list)
