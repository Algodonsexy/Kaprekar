
/**
 * Use los comentarios para explicar el objetivo de este programa Kaprekar .
 *
 * @author (BISFORBRACO)
 * @version (#########)
 */
public class Kaprekar
{

    //Input
    int numero4Digitos;
    //Output
    int numeroDeCiclos;
    boolean datosValidos;

    void algoritmo( ){

        int n1, n2, resta;

        n1 = numero4Digitos;

        n2 = 0;

        numeroDeCiclos = 0;

        resta = numero4Digitos;

        if(numero4Digitos<=9999 && numero4Digitos>0){

            datosValidos = true;

            while(resta!=6174 && resta!=0){

                n1 = ordenarDigitos(resta);

                n2 = invertir(n1);

                resta = n1 - n2;

                numeroDeCiclos = numeroDeCiclos + 1;

            }
            if(resta==0)
                numeroDeCiclos = 8;
        }
    }

    int ordenarDigitos(int numeroAOrdenar){

        int mayor, mitad, mitadDos,menor;
        int mayor1000, mitad100, mitadDos10;

        int numeroOrdenado;
        int division = numeroAOrdenar/100;
        int residuo = numeroAOrdenar%100;

        int numero1 = division/10;
        int numero2 = division%10;
        int numero3 = residuo/10;
        int numero4 = residuo%10;

        if(numero1>=numero2 && numero1>=numero3 && numero1>=numero4){
            mayor = numero1;
            if(numero2>=numero3 && numero2>=numero4){

                mitad = numero2;

                if(numero3>= numero4){

                    mitadDos = numero3;
                    menor = numero4;

                }
                else{
                    mitadDos = numero4;
                    menor = numero3;

                }
            }
            else{

                if(numero3>=numero2 && numero3>=numero4){

                    mitad = numero3;
                    if(numero2>=numero4){

                        mitadDos = numero2;

                        menor = numero4;

                    }
                    else{

                        mitadDos = numero4; 
                        menor = numero2;

                    }

                }
                else{

                    mitad = numero4;
                    if(numero2>= numero3){

                        mitadDos = numero2;

                        menor = numero3;

                    }
                    else{

                        mitadDos = numero3;

                        menor = numero2;

                    }
                }
            }

        }
        else{

            if(numero2>=numero1 && numero2>= numero3 && numero2>= numero4){

                mayor = numero2;

                if(numero1>= numero3 && numero1>= numero4){

                    mitad = numero1;

                    if(numero3>= numero4){

                        mitadDos = numero3;
                        menor = numero4;

                    }
                    else{

                        mitadDos = numero4;
                        menor = numero3;

                    }

                }
                else{

                    if(numero3>= numero1 && numero3>=numero4){

                        mitad = numero3;
                        if(numero1>= numero4){

                            mitadDos = numero1;
                            menor = numero4;

                        }
                        else{

                            mitadDos = numero4;

                            menor = numero1;

                        }

                    }
                    else{
                        mitad = numero4;
                        if(numero1 >= numero3){

                            mitadDos = numero1;
                            menor = numero3;

                        }
                        else{

                            mitadDos = numero3;

                            menor = numero1;

                        }

                    }
                }

            }
            else{

                if(numero3>= numero1 && numero3>= numero2 && numero3>=numero4){

                    mayor = numero3;

                    if(numero1>= numero2 && numero1>=numero4){

                        mitad = numero1;

                        if(numero2>= numero4){

                            mitadDos = numero2;

                            menor = numero4;

                        }
                        else{

                            mitadDos = numero4;

                            menor = numero2;

                        }

                    }
                    else{

                        if(numero2>= numero1 && numero2>= numero4){
                            mitad = numero2;
                            if(numero1>=numero4){
                                mitadDos = numero1;
                                menor = numero4;

                            }
                            else{

                                mitadDos = numero4;
                                menor = numero1;

                            }

                        }
                        else{

                            mitad = numero4;

                            if(numero1>= numero2){

                                mitadDos = numero1;

                                menor = numero2;

                            }
                            else{

                                mitadDos = numero2;

                                menor = numero1;

                            }
                        }
                    }

                }
                else{

                    mayor = numero4;

                    if(numero1>= numero3 && numero1>= numero2){

                        mitad = numero1;

                        if(numero3>= numero2){

                            mitadDos = numero3;

                            menor = numero2;
                        }
                        else{

                            mitadDos = numero2;

                            menor = numero3;

                        }

                    }
                    else{

                        if(numero3>= numero1 && numero3>= numero2){

                            mitad = numero3;

                            if(numero1>= numero2){

                                mitadDos = numero1;

                                menor = numero2;

                            }
                            else{

                                mitadDos = numero2;

                                menor = numero1;

                            }

                        }
                        else{

                            mitad = numero2;

                            if(numero1>= numero3){

                                mitadDos = numero1;

                                menor = numero3;

                            }
                            else{

                                mitadDos = numero3;

                                menor = numero1;

                            }

                        }

                    }
                }

            }
        }
    

        mayor1000 = mayor*1000;
        mitad100 = mitad*100;
        mitadDos10 = mitadDos*10;
        numeroAOrdenar = mayor1000 + mitad100 + mitadDos10 + menor;

        numeroOrdenado = numeroAOrdenar;

        return numeroOrdenado;
    }

    int invertir(int numeroAInvertir){
        int resultado;
        int numeroInvertido = 0;
        while(numeroAInvertir!=0){

            resultado = numeroAInvertir%10;

            numeroAInvertir =  numeroAInvertir/10;

            numeroInvertido = numeroInvertido*10+resultado;

        }
        return numeroInvertido;

    }

    //fin method
}//fin class Kaprekar
