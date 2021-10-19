#include <stdio.h>
#include <string.h>
int main(int argc, char *argv[]){

    printf("Numero de argumentos: %i\n", argc);
    char temp[30] ="";
    for(int i = 0; i < argc; i++){
        if (strcmp(argv[i],"-c")==0){
            strcpy(temp,"Compilar");
        }

        if (strcmp(argv[i],"-E")==0){
            strcpy(temp,"Preprocesar");
        }
        if (strcmp(argv[i],"-i")==0){
            strcpy(temp,"Incluir ");
            strcat(temp, argv[i+1]);
        }else{
            strcpy(temp, argv[i]);
        }
        printf("Argumento %d es %s\n",i,temp);
    }
    printf("ARGUMENTOS: \n\n");
    for(int i = 0; i < argc; i++){
        printf("%s | ",argv[i]);
    }
}