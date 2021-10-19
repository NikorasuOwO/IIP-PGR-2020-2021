 #include <stdio.h>
 #include <string.h>
 int main() { //función main

    struct CD{ // estructura CD
    
        char titulo[100];
        char artista[100];
        int num_canciones;
        int year;
        float precio;
    };

    //void AsignarDatos(struct CD *puntero, char titulo[100], char artista[100], int num_canciones, int year, float precio);
    
    void AsignarDatos(struct CD *puntero, char titulo[100], char artista[100], int num_canciones, int year, float precio){
        strcpy(puntero->titulo, titulo);
        strcpy(puntero->artista, artista);
        puntero->num_canciones = num_canciones;
        puntero->year = year;
        puntero->precio = precio;
    }

    void ShowCDData(struct CD *puntero){
        printf("\nTitulo: %s\n", puntero->titulo);
        printf("Artista: %s\n", puntero->artista);
        printf("Numero de canciones: %i\n", puntero->num_canciones);
        printf("Año de lanzamiento: %i\n", puntero->year);
        printf("Precio: %f\n", puntero->precio);
    }

    struct CD cd1;

    strcpy(cd1.titulo, "El Mal Querer");

    printf("cd1: %s \n", cd1.titulo);

    struct CD *puntero = &cd1;
    printf("cd1 (usando punteros): %s", puntero->titulo); 

    AsignarDatos(&cd1, "Wish you were here", "Pink Floyd", 5, 1975, 60);

    ShowCDData(&cd1);

 }