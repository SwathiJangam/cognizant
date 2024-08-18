import threading
import time
import json

class Inventory:
    def __init__(self):
        self.stock = {}
        self.lock = threading.Lock()

    def add_item(self, item, quantity):
        with self.lock:
            if item in self.stock:
                self.stock[item] += quantity
            else:
                self.stock[item] = quantity

    def remove_item(self, item, quantity):
        with self.lock:
            if item in self.stock:
                if self.stock[item] >= quantity:
                    self.stock[item] -= quantity
                else:
                    print("Insufficient stock for", item)
            else:
                print(item, "not found in stock")

    def check_stock(self, item):
        with self.lock:
            return self.stock.get(item, 0)

    def save_to_file(self, filename):
        try:
            with open(filename, 'w') as file:
                json.dump(self.stock, file)
        except IOError as e:
            print("Error saving to file:", e)

    def load_from_file(self, filename):
        try:
            with open(filename, 'r') as file:
                self.stock = json.load(file)
        except (IOError, json.JSONDecodeError) as e:
            print("Error loading from file:", e)

    def restock_alert(self):
        alert_count = 0
        while alert_count < 3:
            time.sleep(5)
            for item, quantity in self.stock.items():
                if quantity < 10:
                    print("Restock alert:", item, "is low in stock with quantity:", quantity)
                    alert_count += 1

inventory = Inventory()

inventory.add_item("pen", 20)
inventory.add_item("notebook", 15)
inventory.add_item("eraser", 3)

inventory.save_to_file("inventory_data.json")

inventory.load_from_file("inventory_data.json")
print("Loaded inventory state:", inventory.stock)

restock_thread = threading.Thread(target=inventory.restock_alert)
restock_thread.start()

