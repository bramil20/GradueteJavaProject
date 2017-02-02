counter = 5
while counter > 0:
    try:
        question_for_dummies = int(input("What is your favorite number?"))
        print(str(question_for_dummies) + ' is your favorite number :)')
        print(str(18 / question_for_dummies) + ' is when is 18 divided by your number')
        break
    except ValueError:
        print('You need to tell me a number')
        counter -= 1
    except ZeroDivisionError:
        print("You number can't be divided from 18. Try again.")
        counter -= 1
    finally:
        if (counter == 0):
            print("You are an idiot can't even write a number")
        else:
            print('Your life counter is: ' + str(counter))
