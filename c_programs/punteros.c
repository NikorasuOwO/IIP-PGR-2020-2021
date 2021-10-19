#include <stdio.h> //Librería estandar

int main() { //Función main
/*
	int datos[5] = {1,5,25,125,625};
	int *puntero = &datos[0];

	for(puntero ; *puntero <= 700 ; puntero++){

		printf("dirección: %p | valor: %i\n", puntero, *puntero);
	}
	puntero++;
	printf(" TEST!! dirección: %p | valor: %i\n", puntero, *puntero);
	*/
	
	//long l = 1808080;
	int a = 18;
	int* b = &a;
	//int* c = &l;

	printf("a: %i, valor de b: %p, valor de la referencia de b: %i\n", a, b, *b);
	printf("a: %i, dirección de a: %p\n", a, &a);

}
