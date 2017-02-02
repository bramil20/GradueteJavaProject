def health_calculator(age, apples_ate, cigs_smoked):
    your_life=(100-age)+apples_ate*3.5-cigs_smoked*2
    print(your_life)

my_data=[50,1,1]

health_calculator(my_data[0],my_data[1],my_data[2])
health_calculator(*my_data)