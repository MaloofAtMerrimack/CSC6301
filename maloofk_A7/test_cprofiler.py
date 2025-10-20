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

