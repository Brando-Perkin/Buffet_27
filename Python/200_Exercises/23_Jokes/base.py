import requests

num = int(input("How many jokes would you like? "))
joketype = int(input("Would you like a 1 part or 2 part joke(type either 1 or 2)? "))

if joketype == 1:
    for count in range(0, num):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        print()
        print(joke["joke"])
elif joketype == 2:
    for count in range(0, num):
        joke2 = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print()
        print(joke2["setup"])
        print(joke2["delivery"])
else:
    print()
    print("That answer doesnt work. If you really want to hear a joke, Try Again!!")


