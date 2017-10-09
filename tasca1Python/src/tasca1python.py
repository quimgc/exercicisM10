# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

#Exercici 1
#
#def calcularSalari(hores, tarifa):
#    
#    hExtres = 0
#    
#    if hores > 40:
#        
#        hExtres = (hores - 40) * (tarifa / 2) 
#
#    return (hores * tarifa) + hExtres
#    
#
#
#
#
#    
#while True :    
#    try:
#        hores = int(input('Introdueix les hores: '))
#        tarifa = float(input('Introdueix Tarifa: '))
#        print (calcularSalari(hores, tarifa))
#        break
#    
#    except: 
#        print ('no has introduit un numero.') 
#        








##exercici 2
#
#
#def calcula_qualificacio(puntuacio):
#   
#    if(puntuacio==0.6 or puntuacio <=0.69):
#        return "suficient"
#    if(puntuacio==0.7 or puntuacio<=0.79):
#        return "bé"
#    if(puntuacio==0.8 or puntuacio<=0.89):
#        return "notable"
#    if(puntuacio==0.9 or puntuacio<=1):
#        return "excel·lent"
#    
#    
#    return "insuficient"
#
#puntuacio = 0
#try:
#    
#    puntuacio=float(input("Digues una puntuació: "))
#    
#
#except:
#    print("puntuació incorrecta")
#
#print(calcula_qualificacio(puntuacio))


















#Exercici 3

#
#
#def numXifresIteratiu(num):
#    if(type(num)!=int):
#        return -1
#    
#    #Ho declaro en 1 perque el while està fins que num sigui més petit que 10,
#    #si és més petit que 10, senyal que encara queda un nombre per incrementar.
#    
#    numXifres = 1
#    while (num>10):
#        num = num / 10
#        numXifres +=1
#        
#    return numXifres
#
#print("numXifresIteratiu: ", numXifresIteratiu(126775))
#print("numXifresIteratiu: ", numXifresIteratiu(126775.3))
#
#def numXifresSequencial(num):
#    if(type(num)!=int):
#        return -1
#    
#    return len(str(num))
#
#print("numXifresSequencial: ", numXifresSequencial(126775))
#print("numXifresSequencial: ", numXifresSequencial(126775.4))
#






#
##Exercici 4
#def mcd(num, num2):
#    if num2 == 0:
#        return num
#    return mcd(num2, num % num2)
#
##print ("MCD: ", mcd(12,34))
#
#
#
#
#
##Exercici 5
#def mcd3 (a, b, c):
#    return mcd(mcd(a, b), c)
#
#print ("MCD tres nombres: ", mcd3(12,34,54))




#Exercici 6


def delReves(num):
    longitud = len(str(num))
    
    base = 10 ** (longitud -1) # li resto 1 a longitud perquè sino me donaria 1000, d'aquesta forma me dona 100
   
    numReves = 0
    while base >= 1:
        
        numReves = numReves + (num % 10) * base
        num = int(num / 10)
        
        base = base / 10
       
    
    return int(numReves)

#print ("delReves: ",delReves(2345))


def delRevesv2(num):
    
    #declaro una variable base per multiplicar els digits.
    base = 1
    numInvertit = 0 # variable que retornaré amb la cadena invertida.
    numString = str(num) # converteixo la variable passada per paràmetre a String
    
    #recorro un for per tenir cada digit.
    for numero in numString:
        #multiplico 'numero' * base
        numInvertit = numInvertit + int(numero) * base
        #incremento base multiplicada x 10
        base = base * 10
    #retorno el num invertit
    return numInvertit

#print ("delRevesv2: ", delRevesv2(2345))



def delRevesv3(num):
    
    # per utilitzar [::-1] (això el que fa és recorrer l'string a la inversa) es necessita que sigui de tipus String.
    
    return str(num)[::-1]

#print ("delRevesv3: ", delRevesv3(2345))

    

def isPalindrom(num):
    if(delRevesv2(num)==num):
        return True
    return False


#print("isPalindrom: ", isPalindrom(433324))
#print("isPalindrom: ", isPalindrom(43334))

#
def isPrimer(num):
    index = 1
    compt = 0
    while (index <=num):
        if(num % index == 0):
            compt = compt + 1
        index = index + 1
        
    if(compt==2):
        return True
    return False


#print("isPrimer: ", isPrimer(7))
#print("isPrimer: ", isPrimer(11))
#print("isPrimer: ", isPrimer(9))

def seguentPrimer(num):
    num = num + 1
    while(isPrimer(num)==False):
        num = num + 1
    
    return num

#print ("seguentPrimer: ", seguentPrimer(7))
#print ("seguentPrimer: ", seguentPrimer(11))


#exercici 10

def nPrimersNumPrimers(num):
    numPrimers = ""
    numSeguentPrimer = seguentPrimer(0)
    
    while(num>0):
        
        if(isPrimer(numSeguentPrimer)):
            numPrimers += str(numSeguentPrimer) + " "
        
        numSeguentPrimer = seguentPrimer(numSeguentPrimer)
        
        num = num - 1
    
    return numPrimers

print("nPrimersNumPrimers: ",nPrimersNumPrimers(4))
print("nPrimersNumPrimers: ",nPrimersNumPrimers(5))
print("nPrimersNumPrimers: ",nPrimersNumPrimers(10))

        
#    