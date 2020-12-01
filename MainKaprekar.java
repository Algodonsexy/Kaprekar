
/**
 * Use los comentarios para explicar el objetivo de este programa MainKaprekar .
 *
 * @author (BISFORBRACO)
 * @version (#########)
 */
public class MainKaprekar
{
    public static void main (String [] args)
    {
        Kaprekar k = new Kaprekar();
        
        Consola c = new Consola();
        
        //
        
        k.numero4Digitos = c.leerEntero("Número de 4 dígitos:");
        
        //
        
        k.algoritmo();
        
        //
        if(!k.datosValidos)
        c.imprimir("Datos Inválidos");
        else{
        c.imprimir("Ciclos Kaprekar:" + k.numeroDeCiclos);
    }
    
    
    }
    
    
    
    
    
}//fin class MainKaprekar
