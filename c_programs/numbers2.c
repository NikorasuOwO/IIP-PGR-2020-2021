#include <stdio.h>

#define N 10

int Number;

int main(){ 
        int i;
        Number=N;
	printf("Cuantos números quieres imprimir? ");
	scanf("%i",&Number);
        printf("The first %d natural numbers are:\n", Number);

        for(i=0; i<Number; i++){ 
                printf("%d\n",i);
        }

        printf("BYE!\n");
        return 0;

}
