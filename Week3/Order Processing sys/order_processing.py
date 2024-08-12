def apply_discount(order_amount):
    if order_amount>100:
        discount=order_amount*0.10
        order_amount-=discount
    return order_amount

example_order_amount=150

final_price=apply_discount(example_order_amount)

print("Final price after discount:", final_price)