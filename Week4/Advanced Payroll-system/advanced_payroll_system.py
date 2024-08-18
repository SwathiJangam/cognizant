class Employee:
    def __init__(self, name, hours_worked, hourly_rate):
        self.name = name
        self.hours_worked = hours_worked
        self.hourly_rate = hourly_rate

    def calculate_pay(self):
        if self.hours_worked > 40:
            regular_pay = 40 * self.hourly_rate
            overtime_pay = (self.hours_worked - 40) * 1.5 * self.hourly_rate
            total_pay = regular_pay + overtime_pay
        else:
            total_pay = self.hours_worked * self.hourly_rate
        return total_pay

class Manager(Employee):
    def __init__(self, name, hours_worked, hourly_rate, bonus):
        super().__init__(name, hours_worked, hourly_rate)
        self.bonus = bonus

    def calculate_pay(self):
        total_pay = super().calculate_pay() + self.bonus
        return total_pay

employee = Employee(name = "Pearl", hours_worked = 45, hourly_rate = 35)
manager = Manager(name ="Adina", hours_worked = 50, hourly_rate = 40, bonus = 1000)

print("Total pay for ",employee.name,"is $" + str(employee.calculate_pay()))
print("Total pay for ",manager.name,"is $" + str(manager.calculate_pay()))
