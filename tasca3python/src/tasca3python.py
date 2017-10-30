# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


#Exercici 1. Escriu un bucle while que comenci en l'últim caràcter de la cadena i faci el seu
#recorregut cap enrere fins al primer caràcter de la mateixa, mostrant cada lletra en una línia
#separada

def demanarCadena():
    cadena = str(input("Introdueix una cadena: "))
    
    while(len(cadena)==0):
        print("Cadena buida.")
        cadena = str(input("Introdueix una cadena: "))
        
    return cadena

def imprimirCadenaReves(cadena):
    index = len(cadena)
    resultat = ''
    while(index>0):
        index=index-1
        resultat+=cadena[index]
        #print(cadena[index])
    return resultat


#imprimirCadenaReves(demanarCadena())

#Exercici 2. Atès que fruita és una cadena, què vol dir fruita [:]? 

#El que vol dir és que imprimeix tota la cadena des de la posició 0.

#Exercici 3. Fes un programa amb una funció anomenada comptador, que accepti una cadena i una
#lletra com a arguments i compti el nombre de vegades que apareix la lletra en la cadena.

def comptador(cadena, lletra):
    cont = 0
    if(len(lletra)== 0 | len(lletra)>1):
        return "Lletra no vàlid"
    for valor in cadena:
        if(lletra == valor):
            cont = cont +1
    
    return cont


#print(comptador("exercici", "e"))
#print(comptador("exercici", "ee"))

#Exercici 4. Hi ha un mètode de cadena anomenat count. Escriu un programa que el cridi i compti el
#nombre de vegades que apareix la lletra "a" a 'banana'.

#print("banana".count("a"))
#print("banana".count("A"))

#Exercici 5. Pren el codi en Python següent, que emmagatzema una cadena: '
#cad = 'X-DSPAM-Confidence: 0.8475 Km'
#Utilitza find i llescat de cadenes (slicing) per extreure la porció de la cadena corresponent al
#número, i després fes servir la funció float per convertir la cadena extreta en un nombre en punt
#flotant.


cad = 'X-DSPAM-Confidence: 0.8475 Km'
resultat = cad [int(cad.find('0')):int(cad.find('5')+1)]
#print (float(resultat))

#Exercici 6. Escriure funcions per donada una cadena de caràcters:
#a) Imprimir esta cadena cada dos caràcters. Ex .: 'recta' hauria d'imprimir 'rca'
#b) Imprimir la cadena en un sentit i en sentit invers. Ex: 'reflex' imprimeix 'reflexxelfer'.

def imprimirCadenaCadaDosCaracters(cadena):
    resultat=''
    cont=0;
    if(len(cadena)==0):
        return "Cadena no valid"

    for valor in cadena:
        if(cont%2==0):
            resultat+=valor
        cont=cont+1
    return resultat
        
#print(imprimirCadenaCadaDosCaracters("qSuSiSm"))
#print(imprimirCadenaCadaDosCaracters(""))
    
def imprimirCadenaAmbdosSentits(cadena):
    if(len(cadena)==0):
        return "Cadena no vàlid"
    return cadena+imprimirCadenaReves(cadena)

#print(imprimirCadenaAmbdosSentits("quim"))
#print(imprimirCadenaAmbdosSentits(""))


#Exercici 7 a)
def inserirCaracterAcadaLletra(cadena,caracter):
    if(len(cadena)== 0):
        return "Cadena no vàlid"
    
    if(len(caracter)== 0 or len(caracter)>1):
        return "caracter no vàlid"

    resultat = ''
    index = 0
    while(index<len(cadena)):
        if(len(cadena)-index == 1):
            resultat+=cadena[index]
            break
        resultat+=cadena[index]+caracter
        index=index+1

    return resultat

#print(inserirCaracterAcadaLletra("cadena","."))

#Exercici b)Substituïu tots els espais pel caràcter. Ex: 'el meu fitxer de text.txt' i '_' hauria de tornar
#'el_meu_fitxer_de_text.txt'

def substituirEspaiPerCaracter(cadena,caracter):
    if(len(cadena)== 0):
        return "Cadena no vàlid"
    
    if(len(caracter)== 0 | len(caracter)>1):
        return "caracter no vàlid"

    resultat = ''
    
    for valor in cadena:
        if(valor==" "):
            resultat+=caracter
        else:
            resultat+=valor

    return resultat

#print(substituirEspaiPerCaracter("cadena a canviar els espais per punts","."))

def substituirDigitsPerCaracter(cadena,caracter):
    if(len(cadena)== 0):
        return "Cadena no vàlid"
    
    if(len(caracter)== 0 | len(caracter)>1):
        return "caracter no vàlid"
    
    resultat = ''
    index = 0
    
    while(index<len(cadena)):
        
        resultat+=caracter
        
        index=index+1
    
    return resultat

#print(substituirDigitsPerCaracter("cadena","X"))

#Insereixi el caràcter cada 3 dígits en la cadena. Ex. '2552552550' i '.' hauria de tornar
#'255.255.255.0'


def inserirCaracterCadaTresDigits(cadena,caracter):
    if(len(cadena)== 0):
        return "Cadena no vàlid"
    
    if(len(caracter)== 0 | len(caracter)>1):
        return "caracter no vàlid"

    resultat = ''
    cont=0
    
    for valor in cadena:
        
        if(cont==3):
            cont=0
            resultat+=caracter
        
        resultat+=valor
        cont+=1
    return resultat
#print(inserirCaracterCadaTresDigits("2552552550","."))


#Exercici 8

#a) Torni només les lletres consonants. Per exemple, si rep 'algoritmes' o 'logaritmes' ha de
#tornar 'lgrtms'. 


def isVocal(lletra):
    lletra = lletra.lower()
    if(lletra == 'a' or lletra == 'e' or lletra == 'i' or lletra=='o' or lletra=='u'):
        return True
    return False
    
def nomesConsonants(cadena):
    cadena2=""
    for valor in cadena:
        if(isVocal(valor)==False):
            cadena2+=valor
    return cadena2
  
#print(nomesConsonants("algoritmes"))

#b) Retorni només les lletres vocals. Per exemple, si rep 'sense consonants' ha de tornar
#'eeooa'. 

def senseConsonants(cadena):
    cadena2=""
    for valor in cadena:
        if(isVocal(valor)):
            cadena2+=valor
    return cadena2
  

#print(senseConsonants("sense consonants"))


#c) Reemplaci cada vocal per la següent vocal. Per exemple, si rep 'vestuari' ha de tornar
#'vistaero'.


def seguentVocal(cadena):
    vocals="aeiou"
    cadena2=""
    
    for valor in cadena:
        
        if(isVocal(valor)):
           
            pos = vocals.find(valor)
       
            if(pos+1 == len(vocals)):
                
                pos = -1
             
            cadena2+=vocals[pos+1]
            
        else:
            
            cadena2+=valor

    return cadena2

#print(seguentVocal("vestuari"))


#d) Indiqueu si es tracta d'un palíndrom. Per exemple, 'A flacs ells escalfa' és un palíndrom
#(es llegeix igual d'esquerra a dreta que de dreta a esquerra).

def isPalindrom(cadena):
    cadena = cadena.lower()
    cadena = substituirEspaiPerCaracter(cadena, "")
    cadenaReves = cadena[::-1]
    
    if(cadena == cadenaReves):
        return True
    return False

#print(isPalindrom("Sera lodo o dolares"))


#Exercici 9

#a) Indiqueu si la segona cadena és una subcadena de la primera. Per exemple, 'cadena' és una
#subcadena de 'subcadena'. 

def isSubcadena(cadena, subcadena):
    
    trobat = False
    
    pos = cadena.find(subcadena[0])

    while(trobat!=True):
        
    
        if(cadena[pos:(len(subcadena)+pos)]==subcadena):
            trobat=True
        else:
            pos = cadena.find(subcadena[0],pos+1)
            
            
        if(pos+len(subcadena)>len(cadena)):
            return False
    
    return True


#print(isSubcadena("subcadena","cadena"))


#print(isSubcadena("subcadenacadenacadenaa","cadenaa"))

#b) Retorni la que sigui anterior en ordre alfabètic. Per exemple, si rep 'kde' i 'gnome' ha de
#tornar 'gnome'.

def ordreAlfabetic(cadena, cadena2):
    if(cadena[0]>cadena2[0]):
        return cadena2
    return cadena


#print(ordreAlfabetic("kde","gnome"))


#Exercici 10

#'capitalize', 'center', 'count', 'decode', 'encode', 'endswith', 'expandtabs', 
#'find', 'format', 'index', 'isalnum', 'isalpha', 'isdigit', 'islower', 'isspace',
#'istitle', 'isupper', 'join', 'ljust', 'lower', 'lstrip', 'partition', 'replace',
#'rfind', 'rindex', 'rjust', 'rpartition', 'rsplit', 'rstrip', 'split', 'splitlines',
#'startswith', 'strip', 'swapcase', 'title', 'translate', 'upper', 'zfill'

cadena = "Hola que tal"

#print(cadena.expandtabs(20))
#print(cadena.find('q'))
print("hola {que} tal".format(que="tal"))

