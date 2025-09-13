def calculate_tax(income):
    if income < 500:
        tax_rate = 0.10
    elif income < 1500:
        tax_rate = 0.15
    elif income < 2500:
        tax_rate = 0.20
    else:
        tax_rate = 0.30

    tax_withheld = income * tax_rate
    return tax_withheld

def main():
    try:
        income = float(input("Enter weekly income: $"))
        tax = calculate_tax(income)
        print(f"Weekly Tax Withholding: ${tax:.2f}")
    except ValueError:
        print("Invalid input. Please enter a numeric value.")

if __name__ == "__main__":
    main()