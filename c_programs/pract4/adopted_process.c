/***code of my_child.c***/ 
#include <stdio.h> 
#include <stdlib.h>

int var = 1;
 
int main(int argc, char *argv[]) {

    for(int i=0; i < 5; i++){
        var = fork();
        if (var == 0){
            sleep(20);
            exit(0);
        }
        printf("Process %ld,my parent %ld\n" ,(long)getpid(),(long)getppid()); 
    }
    if(var > 0){
        sleep(5);
    }
    return 0; 
}

/*
Los adopta el 4096 LOL
*/

