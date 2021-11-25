Player1 = input("Player1 choose the Rock/paper/scissor")
Player2 = input("Player2 choose the Rock/paper/scissor")

if (Player1=="Rock") and (Player2=="scissor"):
    print("Player1 wins the match") 
elif (Player1=="scissor") and (Player2=="Paper"):
    print("Player1 wins the match")
elif (Player1=="paper") and (Player2=="Rock"):
    print("Player1 wins the match")
elif (Player2=="scissor") and (Player1=="Paper"):
    print("Player2 wins the match")
elif (Player2=="paper") and (Player1=="Rock"):
    print("Player2 wins the match")
elif(Player2=="Rock") and (Player1=="scissor"):
    print("Player2 wins the match")
else:
    print("match is Tie")