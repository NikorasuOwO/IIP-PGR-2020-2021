#include <stdio.h>  
#define TAM_CADENA 200

int main() {

// Puntero a caracter para copiar las cadenas
char *p1, *p2;
// A) Definir las variables cadena y cadena2

char cadena[TAM_CADENA] = "hola soy nicolas";
char cadena2[TAM_CADENA];

// B) Leer cadena de consola
// C) Convertir a mayúsculas

p1 = cadena;
p2 = cadena2;

while (*p1 != '\0') {

    if(*p1 != 32){
        *p2 = *p1 - 32;
        *p2++;
        *p1++;
    }else{

    *p2 = *p1;
    *p2++;
    *p1++;
    

    }

}
    
    // Acordarse de poner el cero final en cadena2

    *p2 = '\0';

    // D) Sacar por consola la cadena2.
    printf("CADENA1: %s\n",cadena);
    printf("CADENA2: %s\n",cadena2);
    return 0;
}