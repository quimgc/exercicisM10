# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


# Exercici 1
cont = 0
sumaTotal = 0 
mitjana = 0


while(True):
    try:
        valor = input("Introdueix un nombre: ")
        if(str(valor)=="fi"):
            break
        int(valor)
        cont = int(cont + 1)
        sumaTotal += int(valor)
        
    except:
        print("Entrada erronia")
    

print("La suma total: " + str(sumaTotal) + ", la quantitat de numeros introduïts: " + str(cont) + " i la mitjana: " + str(sumaTotal / cont))
    
    

#Exercici 2
import sys

cont = 0
sumaTotal = 0 
numPetit = sys.maxsize
numGran = -sys.maxsize


while(True):
    try:
        valor = input("Introdueix un nombre: ")
        
        if(str(valor)=="fi"):
            
            break
            
        int(valor)
        
        cont = int(cont + 1)
        
        sumaTotal += int(valor)
        
        if(int(numPetit)>int(valor)):
            
            numPetit = valor
            
        if(int(numGran)<int(valor)):
            
            numGran=valor
        
    except:
        
        print("Entrada erronia")
    

print("La suma total: " + str(sumaTotal) + ", la quantitat de numeros introduïts: " + str(cont) +" , el numero mes gran es: " + str(numGran) + " i el mes petit: " + str(numPetit))


#Exercici 3

def aproximaPi(fraccions):
  

    numerador = 2
    denominador = 1
    cont = 0
    pi = float(numerador/denominador)
    while(fraccions!=0):
        cont+=1
        if(cont%2==0):
            numerador +=2
        else: 
            denominador +=2
        pi =float(pi * float(numerador/denominador))
        fraccions -=1
        
    return pi

print("aproximaPi", aproximaPi(700))

while(True):
    try:
        fraccions = int(input("Digues un numero de fraccions: "))
        break
    except:
        print("Ha de ser un int")

print(aproximaPi(fraccions))
        

#Exercici 4

def esApocaliptic(n):
    if "666" in str(n):
        return True
    return False
    
n = 14666
print("El numero " + str(n) + " es Apocaliptic: " , esApocaliptic(n))
n = 1466
print("El numero " + str(n) + " es Apocaliptic: " , esApocaliptic(n))
#Exercici 5

def esApilable(n):
    compt=1
    while(n>0):
        n=n-compt
        compt+=1
    
    if(n==0):
        return True
    return False

print(esApilable(36))
print(esApilable(10))
print(esApilable(9))

    
#Exercici 6
import math

def esQuadrat(n):
    
    if(n%math.sqrt(n)==0):
        return True
    return False


n=36
print("El numero " + str(n) + " amb el metode esApilable: " + str(esApilable(n)) + " i amb el metode esQaudrat: " + str(esQuadrat(n)))
n=10
print("El numero " + str(n) + " amb el metode esApilable: " + str(esApilable(n)) + " i amb el metode esQaudrat: " + str(esQuadrat(n)))
n=9
print("El numero " + str(n) + " amb el metode esApilable: " + str(esApilable(n)) + " i amb el metode esQaudrat: " + str(esQuadrat(n)))


#Exercici 7

def factorial(n):
    numFactorial = 1
    while n >= 1:
        numFactorial = numFactorial * n
        n = n - 1
    return numFactorial



def combinatori(m,n):
	return factorial(m+n-1)/factorial(n)*(factorial(m-1))
    
    
print("esCombinatori", combinatori(10,2))

#Exercici 8
import random
def aleatori(n):
    return random.randint(0,n-1)

def llansamentDauMoneda():
    contDau = 0
    contMoneda = 0
    n = 0
    while(n<=99):
        if(aleatori(6)%2!=0):
            contDau+=1
        if(aleatori(2)%2!=0):
            contMoneda+=1
        n+=1
    
    return "Dau: " + str(contDau) + "\n Moneda: " + str(contMoneda)


print(llansamentDauMoneda())


#exercici 9


def esPerfecte(n):
    suma=0
    copiaN = n-1
    
    while(copiaN>0):
        
        if(int(n%copiaN)==0):
            suma += int(copiaN)
        copiaN-=1
    return suma==n

print(esPerfecte(6))
print(esPerfecte(28))
print(esPerfecte(30))