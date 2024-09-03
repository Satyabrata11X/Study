def AreaS(s):
    return(s*s)
def AreaR(l,b):
    return(l*b)
def Volume(l,b,h):
    return(l*b*h)
def Prime(n):
    if i<1:
        print("Give a value >1")
    else:
        i=2
        while(i<=n/2):
            if n%i==0:
                print("Composite")
                break
                i+=1
            if i>n/2:
                print("Prime")
def EvenOdd(n):
    if n%2==0:
        print("Even")
    else:
        print("Odd")
print("choice\n 1.Area of Square\n 2.Area of Rectangle\n 3.Volume of Cube\n 4.Prime or not\n 5.Even or Odd\n")
n=int(input("Enter your Choice: "))
if n==1:
    s=int(input("Enter Side"))
    print("Area of Square=",AreaS(s))
elif n==2:
    l=int(input("Enter length: "))
    b=int(input("Enter breath: "))
    print("Area of the Rectangle=",AreaR(l,b))
elif n==3:
    l=int(input("Enter length"))
    b=int(input("Enter your breath"))
    h=int(input("Enter your height"))
    print("Volume of Cube=",Volume(l,b,h))
elif n==4:
    n=int(input("Enter the value of n"))
    print("result",Prime(n))
elif n==5:
    n=int(input("Enter the value of n"))
    print("result",EvenOdd)
    