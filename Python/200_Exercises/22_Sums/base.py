usernum = int(input("Please enter a number: "))
count = 0

for x in range(1, usernum + 1):
    count = count + x
    print(x, end = " ")
    if x != usernum:
        print("+", end = " ")
print()
print("The sum of 1 to " + str(usernum) + " is: " + str(count))