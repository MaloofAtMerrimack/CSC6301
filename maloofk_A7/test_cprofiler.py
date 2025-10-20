import random

def guess():
    return random.randint(2, 5000)

def isPrime(x):
    #This is the function taking most of the time. 
    for i in range(x):
        for j in range(x):
            if i * j == x:
                return False
    return True
    
def isPrimeEfficient(x):
    if x == 1:
        return False
    if x <= 3:
        return True
    if x % 2 == 0 or x % 3 == 0:
        return False
    i = 5
    while i * i <= x:
        if x % i == 0 or x % (i + 2) == 0:
            return False
        i += 6
    return True

def findPrimes(num):
    primes = []
    for i in range(num):
        p = guess()
        while not isPrimeEfficient(p):
            p = guess()
        primes += [p]
    return primes

import cProfile
cProfile.run('print(findPrimes(500)[:10])')



