
# prompts for user input

price_before_discount = float(input("Enter the price of a product: "))


# prompts for user input in discount

discount = int(input("Enter the discount offered (0 - 100): "))

# calculates the discount of the price


discount_amount = price_before_discount * discount / 100

# subtracts the current price and the discount

price_after_discount = price_before_discount - discount_amount


# prints out the discounted price
print("The price after discount is:", price_after_discount)