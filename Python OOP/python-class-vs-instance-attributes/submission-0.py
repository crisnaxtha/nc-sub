class BankAccount: 
    # TODO: Add class and instance attributes at their appropriate places
    total_accounts = 0
    total_balance = 0

    def __init__(self, name: str, balance: float) -> None:
        self.name = name
        self.balance = balance
        BankAccount.total_accounts += 1
        BankAccount.total_balance += balance


# TODO: Create two accounts
bank_account = BankAccount("Alice", 1000)
bank_account2 = BankAccount("Bob", 2000)
# TODO: Print the information using the mentioned format

print(f"{bank_account.name}'s balance: ${bank_account.balance}")
print(f"{bank_account2.name}'s balance: ${bank_account2.balance}")

print(f"Total Accounts: {BankAccount.total_accounts}")
print(f"Total Balance: ${BankAccount.total_balance}")
