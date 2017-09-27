# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

if __name__ == "__main__":
    print ("Hello World")


#edat = input('Quina edat tens?\n')
#print('El doble de la teua edat és: '+str(2*int(edat))) #passem l'string a enter i despres ho passem tot a string

#nom = input('Digues el teu nom:\n')
#print ('hola, '+nom.strip())  #strip() és per treure els espais del principi de la cadena.
#print (type(nom))
#
#
#hores = int(input('Introdueix Hores:\n '))
#tarifa = float(input('Introdueix Tarifa:\n '))
#print('Salari: '+str(round(hores*tarifa, 2)))


num = 1
if True :
    print ("True")
    print ("2ª linia")
    
elif num>=1 :
    print ('False')

else :
    print('false ')
   
     
while True :    
    try:
        hores = int(input('Introdueix les hores:'))
        tarifa = float(input('Introdueix Tarifa: '))
        print('Salari: '+str(round(hores*tarifa, 2)))
        break
    
    except: 
        print ('no has introduït un numero.')
        