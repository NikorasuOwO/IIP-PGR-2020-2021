#include <stdio.h>
int main(int argc, char *argv[]){

    printf("Numero de argumentos: %i\n", argc);
    for(int i = 0; i < argc; i++){

        printf("Argumento %d es %s\n",i,argv[i]);
    }
}