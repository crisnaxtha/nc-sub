def add_two_numbers() -> int:
    num_arr = input().split(",")
    res = []
    for i in num_arr:
        res.append(int(i))
    return sum(res)   



# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
