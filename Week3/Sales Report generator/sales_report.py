def generate_report(sales):
    total_sales = 0

    for sale in sales:
        if sale > 500:
            print(f"Sale: ${sale} - Highlighted")
        else:
            print(f"Sale: ${sale}")

        total_sales += sale

    return total_sales

sales_list = [200, 600, 150, 800, 300]

total_sales = generate_report(sales_list)

print(f"Total Sales: ${total_sales}")
