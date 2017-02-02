import random


class Cat:
    def __init__(self):
        self.life = 9
        print('Meow! :@\n')

    def attack(self):  # , number_of_attack_attempts):
        dmg_dealt = random.randrange(1, 7)
        return dmg_dealt

    def defend(self):  # , number_of_attempts_on_your_life):
        counter_attack = random.randrange(1, 6)
        return counter_attack


thomas = Cat()
silvestre = Cat()

# thomas_attacks = thomas.attack()
# silvestre_defends = silvestre.defend()


tom_lives = thomas.life
silvestre_lives = silvestre.life

while (tom_lives > 0 or silvestre_lives > 0):
    thomas.attack()
    silvestre.defend()
    tom_attack = thomas.attack()
    silver_defend = silvestre.defend()

    print('Tom dealt: ' + str(tom_attack) + 'dmg')
    print('Silvestre dealt: ' + str(silver_defend) + 'dmg')

    if (tom_attack > silver_defend):
        silvestre_lives -= 1
        print('Silvestre: ' + str(silvestre_lives) + ' lives left\n')
    else:
        tom_lives -= 1
        print('Thomas: ' + str(tom_lives) + ' lives left\n')
    if tom_lives == 0:
        print('\n~Silvestre is victorious!~\n')
        break
    elif silvestre_lives == 0:
        print('\n~Tom is victorious!~\n')
        break
