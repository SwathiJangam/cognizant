def calculate_pay(hours, rate):
    total_pay = hours * rate
    return total_pay

def main():
    hours_worked = float(input("Enter the number of hours worked: "))
    hourly_rate = float(input("Enter the hourly rate in dollars: "))
    
    employee_pay = calculate_pay(hours_worked, hourly_rate)
    
    print(f"Total pay for the employee: ${employee_pay:.2f}")

if __name__ == "__main__":
    main()
