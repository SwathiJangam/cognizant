import os
import logging
from datetime import datetime

logging.basicConfig(filename='transaction_errors.log', level=logging.ERROR, format='%(asctime)s %(levelname)s: %(message)s')

class InvalidTransactionError(Exception):
    pass
def validate_transaction(transaction):
    if not isinstance(transaction, dict):
        raise InvalidTransactionError("Transaction data must be a dictionary.")
    if 'amount' not in transaction or not isinstance(transaction['amount'], (int, float)):
        raise InvalidTransactionError("Transaction must have a valid amount.")
    if 'description' not in transaction or not isinstance(transaction['description'], str):
        raise InvalidTransactionError("Transaction must have a valid description.")
    return True

def process_transaction(transaction):
    try:
        # Validate the transaction
        validate_transaction(transaction)
        # Simulate processing (for example, writing to a file)
        with open('transactions.txt', 'a') as file:
            file.write(f"{transaction['amount']}, {transaction['description']}\n")
        print("Transaction processed successfully.")
    except InvalidTransactionError as e:
        print(f"Error: {e}")
        log_error(e)
    except FileNotFoundError:
        error_msg = "Transaction file not found. Please ensure the file exists."
        print(f"Error: {error_msg}")
        log_error(error_msg)
    except Exception as e:
        print("An unexpected error occurred.")
        log_error(e)
    else:
        print("Transaction completed with no errors.")
    finally:
        print("Transaction processing finished.")

def log_error(error):
    logging.error(f"Exception: {str(error)}")

def main():
    print("Welcome to the Financial Transaction Processor")

    while True:
        try:
            # Simulate user input
            amount = float(input("Enter transaction amount: "))
            description = input("Enter transaction description: ")
            transaction = {'amount': amount, 'description': description}

            # Process the transaction
            process_transaction(transaction)
        except ValueError:
            print("Invalid input. Please enter a numeric value for the amount.")
        except Exception as e:
            print("An unexpected error occurred during user input.")
            log_error(e)

        another = input("Do you want to process another transaction? (yes/no): ").lower()
        if another != 'yes':
            print("Thank you for using the Financial Transaction Processor")
            break

if __name__ == "__main__":
    main()