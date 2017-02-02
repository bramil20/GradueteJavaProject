import tuna
import random

tuna.fish()
gamble=random.randrange(1,980)

if gamble > 500:
   # print(gamble)
    print(str(gamble)+" You have double up")
else:
    #print(gamble)
    print(str(gamble)+" You lose, good day sir")