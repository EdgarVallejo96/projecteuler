squareSums = 0
sumSquares = 0

for i in range (1,101,1):
    sumSquares = sumSquares + (i**2)
    squareSums = squareSums + i

print((squareSums**2) - sumSquares)