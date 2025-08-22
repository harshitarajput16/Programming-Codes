

from p41_simpleInterest import SI

p = int(input("Enter the principal : "));
r = float(input("Enter rate : "))
n = int(input("Enter time : "))

si = SI(p,r,n)

print(si)