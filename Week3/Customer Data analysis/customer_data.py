def update_purchase(customer_data, name, amount):
    """
    Update the purchase amount for a given customer.
    If the customer does not exist, it's added to the dictionary.
    """
    customer_data[name] = amount

customer_data = {'Pearl': 120, 'Benny': 75, 'Elz': 90}

update_purchase(customer_data, 'Benny', 100)

print("Updated Customer Data:", customer_data)
