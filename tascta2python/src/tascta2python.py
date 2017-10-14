# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


# Exercici 1
#cont = 0
#sumaTotal = 0 
#mitjana = 0
#
#
#while(True):
#    try:
#        valor = input("Introdueix un nombre: ")
#        if(str(valor)=="fi"):
#            break
#        int(valor)
#        cont = int(cont + 1)
#        sumaTotal += int(valor)
#        
#    except:
#        print("Entrada erronia")
#    
#
#print("La suma total: " + str(sumaTotal) + ", la quantitat de numeros introduïts: " + str(cont) + " i la mitjana: " + str(sumaTotal / cont))
    
    

#Exercici 2
import sys

cont = 0
sumaTotal = 0 
numPetit = sys.maxsize
numGran = -sys.maxsize



#while(True):
#    try:
#        valor = input("Introdueix un nombre: ")
#        
#        if(str(valor)=="fi"):
#            
#            break
#            
#        int(valor)
#        
#        cont = int(cont + 1)
#        
#        sumaTotal += int(valor)
#        
#        if(int(numPetit)>int(valor)):
#            
#            numPetit = valor
#            
#        if(int(numGran)<int(valor)):
#            
#            numGran=valor
#        
#    except:
#        
#        print("Entrada erronia")
#    
#
#print("La suma total: " + str(sumaTotal) + ", la quantitat de numeros introduïts: " + str(cont) +" , el numero mes gran es: " + str(numGran) + " i el mes petit: " + str(numPetit))


#Exercici 3

def aproximaPi(fraccions):
  

    numerador = 2
    denominador = 1
    cont = 0
    pi = float(numerador/denominador)
    print ("i1", pi)
    while(fraccions!=0):
        print("numerador", numerador)
        print("denominador", denominador)


        cont+=1
        print("cont", cont)
        if(cont%2==0):
            numerador +=2

        else: 
            denominador +=2
        pi =float(pi * float(numerador/denominador))
        fraccions -=1
        
    return pi
    

      
#while(True):
#    try:
#        fraccions = int(input("Digues un numero de fraccions: "))
#        break
#    except:
#        print("Ha de ser un int")
#
#print(aproximaPi(fraccions))
        

#Exercici 4

#Exercici 5

def esApilable(n):
    compt=1
    while(n>0):
        n=n-compt
        compt+=1
    
    if(n==0):
        return True
    return False


    
#Exercici 6
import math

def esQuadrat(n):
    
    if(n%math.sqrt(n)==0):
        return True
    return False


n=36

print("El numero " + str(n) + " amb el metode esApilable: " + str(esApilable(n)) + " i amb el metode esQaudrat: " + str(esQuadrat(n)))