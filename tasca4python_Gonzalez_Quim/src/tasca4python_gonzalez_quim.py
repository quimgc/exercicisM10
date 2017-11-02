# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

#Exercici 1.- Escriu una funció anomenada retalla, que prengui una llista, la modifiqui eliminant els
#elements primer i últim, i retorni None.


def retalla(llista):
    try:
        del llista[0]
        del llista[len(llista)-1]
    except:
        return ("No has introduït una llista.")
    return None

llista = ['a','b','c','d','e']
#print(llista)
#print(retalla(llista))
#print(llista)

#Exercici 2.- Escriu una funció anomenada centre, que prengui una llista i retorni una altra que
#contingui tots els elements de l'original, menys el primer i l'últim. 

def centre(llista):
    try:
        llistaCopia = llista
        del llista[0]
        del llista[len(llista)-1]
    except:
        return ("No has introduït una llista.")
    return llistaCopia

#print(llista)
#print(centre(llista))


#Exercici 5.- Reescriu el programa que demana a l'usuari una llista de nombres i imprimeix en
#pantalla el màxim i mínim dels nombres introduïts al final, quan l'usuari introdueix "fi". Escriu ara
#el programa de manera que emmagatzemi els números que l'usuari introdueixi en una llista i usa les
#funcions max() i min() per calcular els nombres màxim i mínim després que el bucle acabi.
#Introdueix un nombre: 6
#Introdueix un nombre: 2
#Introdueix un nombre: 9
#Introdueix un nombre: 3
#Introdueix un nombre: 5
#Introdueix un nombre: fi
#Màxim: 9.0
#Mínim: 2.0

def minMax(llista):
    return  "Mínim " + min(llista) +" Màxim " + max(llista)


llistaNombres = []

#while(True):
#    try:
#        valor = input("Introdueix un nombre: ")
#        if(str(valor)=="fi"):
#            break
#        int(valor)
#        llistaNombres.append(valor)
#    except:
#        print("Entrada erronia")

#print(llistaNombres)
#print(minMax(llistaNombres))

#Exercici 6 
#Escriure una funció que rebi dos llistes 
#i retorni el seu producte escalar.

def producteEscalar(llista, llista2):
    if(len(llista)==0 or len(llista2)==0 or list(llista)==False or list(llista2))==False:
        return 0
    index = 0
    sumatori = 0
    if(len(llista)==len(llista2)):
        while(index<len(llista)):
            if(type(llista[index]) == int and type(llista2[index])==int):
                sumatori += llista[index] + llista2[index]
                index=index+1
            else:
                return None
    else:
        if(len(llista)<len(llista2)):
            while(index<len(llista)):
                if(type(llista[index]) == int):
                    sumatori+=llista[index]
                    index = index + 1
                else:
                    return None
        else:
            while(index<(len(llista2))):
                if(type(llista2[index]) == int):
                    sumatori+=llista2[index]
                    index = index + 1
                else:
                    return None
    return "Sumatori Escalar: " , sumatori

llista = [1,1,1,1,1,1,1,1]
llista2 = [1,1,1,1,1,1,1,'a']
#print(producteEscalar(llista,llista2))
llista = [1,1,1,1,1,1,1,1]
llista2 = [1,1,1,1,1,1,1]
#print(producteEscalar(llista,llista2))
llista = [1,1,1,1,1,1,1,1]
llista2 = [1,1,1,1,1,1,1,1]
#print(producteEscalar(llista,llista2))
 
#Exercici 7.- Donada una llista de nombres enters, escriure una funció que retorne una llista amb tots
#els que siguin primers.
#codi reaprofitat de tasca1
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

def llistaPrimers(llista):
    if(len(llista)==0 or list(llista)==False):
        return "La llista no és vàlid"
    listPrimers = []
    for valor in llista:
        try:
            if(isPrimer(valor)):
                listPrimers.append(valor)
        except:
            return "No has passat un numero a la posició" , llista.index(valor)
    return listPrimers
        
llista = [1,2,3,4,5,6,7,'a',9,10,11]        
print(llistaPrimers(llista))
llista = [1,2,3,4,5,6,7,8,9,10,11]        
print(llistaPrimers(llista))

#Exercici 8

def llistaK(llista, k):
    if(list(llista)==False or llista==null or k==null or int(k)==False):
        return None
    
    menorK = []
    igualK = []
    majorK = []
    for valor in llista:
        
    