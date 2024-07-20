# Print a table containing multiplication tables.

number = 3
multiply = 0
for i in range(1, 13):
    multiply = i * number
    print(number, 'x', i, '=', multiply)