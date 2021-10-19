/***code of my_child.c***/ 
#include <stdio.h> 
#include <stdlib.h> 
 
int main(int argc, char *argv[]) 
{ printf("Process %ld \n", (long)getpid()); 
 fork(); 
 printf("Process %ld,my parent %ld\n" ,(long)getpid(),(long)getppid()); 
 sleep(15); 
 return 0; 
}

/*
procesoPadre: 37227 |   33799   |   sleep 15
proceso Hijo: 37229 |   37227   |   sleep 15
*/

