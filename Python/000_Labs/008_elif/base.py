num1 = int(input("Please enter a number: "))
operator = input("Please enter an operation: ")
num2 = int(input("Please enter another number: "))

if operator == "-":
    print(str(num1) + " - " + str(num2) + " = " + str(num1 - num2))
elif operator == "+":
    print(str(num1) + " + " + str(num2) + " = " + str(num1 + num2))
elif operator == "*":
    print(str(num1) + " * " + str(num2) + " = " + str(num1 * num2))
elif operator == "/":
    print(str(num1) + "/" + str(num2) + " = " + str(num1/num2))
else:
    print("Sorry I can't do math with that!?!")