import random

numamount = int(input("How many random numbers would you like? "))

numbers = []

for i in range(numamount):
    numbers = numbers + [random.randrange(1, 11)]

print("Your numbers are:", numbers, end = ", ")
print()