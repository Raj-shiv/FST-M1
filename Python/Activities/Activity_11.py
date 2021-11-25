Fruits={"banana":10, "orange":12,"kiwi":15,"mango":20}
print(Fruits)
Fruit_check = input("Enter Fruit to check").lower()
if Fruit_check in Fruits:
    print("Fruit is available")
else:
    print("Fruit is not available")
