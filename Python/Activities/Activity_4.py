
while True:
    Player1 = input("Player1 choose the Rock/paper/scissor").lower()
    Player2 = input("Player2 choose the Rock/paper/scissor").lower()

    if (Player1=="rock") and (Player2=="scissor"):
        print("Player1 wins the match") 
    elif (Player1=="scissor") and (Player2=="Paper"):
        print("Player1 wins the match")
    elif (Player1=="paper") and (Player2=="rock"):
        print("Player1 wins the match")
    elif (Player2=="scissor") and (Player1=="paper"):
        print("Player2 wins the match")
    elif (Player2=="paper") and (Player1=="rock"):
        print("Player2 wins the match")
    elif(Player2=="rock") and (Player1=="scissor"):
        print("Player2 wins the match")
    else:
        print("match is Tie")

    Repeat = input("Would you like to try one more Game ? Y/N")
    if(Repeat=='Y'):
        pass
    elif(Repeat=='N'):
        raise SystemExit
    else:
        print("Invalid selection try next time!!")
        raise SystemExit