#!/usr/bin/env python2
#encoding: UTF-8

# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

import random

#
#def calcul_salari(hores, tarifa):
#    return hores*tarifa


#while True:
#    try:
#        hores = int(input('Introdueix hores: '))
#        tarifa = float(input('Introdueix la tarifa: '))
#        break
#    except:
#        print ('Error, no has introduït un número.')
#
#print(calcul_salari(hores,tarifa))
#
#
#    
#def comptadorDeXifres (enter):
#    comptador = 1
#    while enter > 9:
#        enter = enter / 10
#        comptador = comptador + 1
#     
#    return comptador
#        
#        
#        
#while True:
#    try:
#        enter = int(input('Introdueix un numero enter: '))
#        break
#    except:
#        print ("Has d'introduïr un número enter.")
#
#
#print (comptadorDeXifres(enter))


def mcd(num, num2):
    if num2 == 0:
        return num
    return mcd(num2, num % num2)
    
    
#print (mcd(0,5))


def mcd3 (a, b, c):
    return mcd(mcd(a, b), c)

#print (mcd3(40,12,34))
    

def delReves(num):
    longitud = len(str(num))
    
    base = 10 ** (longitud -1) # lki resto 1 a longitud perquè sino me donaria 1000, d'aquesta forma me dona 100
   
    numReves = 0
    while base >= 1:
        
        numReves = numReves + (num % 10) * base
        num = int(num / 10)
        
        base = base / 10
       
    
    return int(numReves)


print (delReves(12345453))

