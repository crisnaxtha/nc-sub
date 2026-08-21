from typing import List

def read_integers() -> List[int]:
    inpu = input()
    res = []
    for i in inpu.split(","):
        res.append(int(i))
    return res;

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
