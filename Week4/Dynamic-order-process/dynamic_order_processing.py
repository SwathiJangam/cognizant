from abc import ABC, abstractmethod

class DiscountStrategy(ABC):
    @abstractmethod
    def apply_discount(self, order_amount):
        pass

class RegularDiscount(DiscountStrategy):
    def apply_discount(self, order_amount):
        return order_amount

class PremiumDiscount(DiscountStrategy):
    def apply_discount(self, order_amount):
        return order_amount * 0.9

class VIPDiscount(DiscountStrategy):
    def apply_discount(self, order_amount):
        return order_amount * 0.8

class Order:
    def __init__(self, customer_type, order_amount):
        self.customer_type = customer_type
        self.order_amount = order_amount

    def final_price(self):
        if self.customer_type == "regular":
            discount_strategy = RegularDiscount()
        elif self.customer_type == "premium":
            discount_strategy = PremiumDiscount()
        elif self.customer_type == "VIP":
            discount_strategy = VIPDiscount()
        else:
            raise ValueError("Invalid customer type")

        return discount_strategy.apply_discount(self.order_amount)

order1 = Order("regular", 100)
order2 = Order("premium", 100)
order3 = Order("VIP", 100)

# Print the final prices after applying discounts.
print(f"Final price for regular customer: ${order1.final_price()}")
print(f"Final price for premium customer: ${order2.final_price()}")
print(f"Final price for VIP customer: ${order3.final_price()}")
