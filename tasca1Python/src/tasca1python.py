# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

#Exercici 1

def calcularSalari(hores, tarifa):
    
    hExtres = 0
    
    if hores>40:
        
        hExtres = (hores - 40) *(tarifa / 2) 

    return (hores * tarifa) + hExtres
    



    
    
while True :    
    try:
        hores = int(input('Introdueix les hores: '))
        tarifa = float(input('Introdueix Tarifa: '))
        print (calcularSalari(hores, tarifa))
        break
    
    except: 
        print ('no has introduit un numero.') 
        



# Exercici 3