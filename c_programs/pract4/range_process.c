/***code of my_child.c***/ 
#include <stdio.h> 
#include <stdlib.h>

int var = 1;
 
int main(int argc, char *argv[]) {

    for(int i=0; i < 5 && var > 0; i++){
        var = fork();
        if (var == 0){
            sleep(10);
            break;
        }
        printf("Process %ld,my parent %ld\n" ,(long)getpid(),(long)getppid()); 
    }
    if(var > 0){
        wait();
    }
    return 0; 
}

/*
procesoPadre:  |      |       |
proceso Hijo:  |      |       |
*/

//En suspenso (S) porque la orden sleep suspende la ejecución del programa x segundos

