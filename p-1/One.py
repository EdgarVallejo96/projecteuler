x = 3
y = 0
while(x < 1000):
    if(x % 3 == 0 or x % 5 == 0):
        y = y + x
    x = x + 1
print(y)