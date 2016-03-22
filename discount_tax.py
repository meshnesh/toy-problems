VAT = 0.19
price_before_discount = float(input("Enter the price of a product: "))


discount = int(input("Enter the discount offered (0 - 100): "))

discount_amount = price_before_discount * discount / 100

price_after_discount = price_before_discount - discount_amount

sales_tax = price_after_discount * VAT

price_after_tax = price_after_discount + sales_tax

print("The discounted after-tax price is:", price_after_tax)