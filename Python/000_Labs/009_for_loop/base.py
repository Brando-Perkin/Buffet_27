linelength = int(input("Please enter a line length: "))
direction = input("Do you want a horizontal or vertical line? ")

if direction == "horizontal" or direction == "Horizontal":
    for i in range(linelength):
        print("*", end = " ")
elif direction == "vertical" or direction == "Vertical":
    for i in range(linelength):
        print("*")
else:
    print("That doesn't work for me. Try a different direction!!")
