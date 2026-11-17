usersymbol = input("What symbol would you like to use? ")
userwidth = int(input("What's the width of your box? "))
userheight = int(input("What's the height of your box? "))

for i in range(userheight):
    for b in range(userwidth):
        print(usersymbol, end = " ")
    print()