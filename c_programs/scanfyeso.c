
int main(){
    float pi;
    printf("¿Cuánto vale pi? (aproximadamente) \n\n");
    scanf("%f", &pi);

    if(pi < 3.15 && pi >= 3.14){

        printf("ok, pi = %f aproximadamente", pi);

    }else{

        printf("pi no es eso lol");
    }

}