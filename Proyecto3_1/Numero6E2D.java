
/**
 * Esta clase recibe un numero que no se puede sobrepasar de ciertos limites y lo almacena  con hasta 2 decimales
 * 
 * @author (Lucas Nuñez)
 * @version (1.0)
 */
public class Numero6E2D
{
    //variable de instancia para almacenar un valor double
    private double numero;
    //variable de clase que define el limite maximo
    private static double limiteMaximo = 999999.99;
    //variable de clase que define el limite minimo 
    private static double limiteMinimo = -999999.99;
    /**
     * Constructor que inicializa la variable numero
     */
    public Numero6E2D()
    {
        // initialise instance variables
        this.numero =0;
    }

    public double getNumero(){
        return numero;
    }
    
    public boolean setNumero(double nuevoNumero){
        if(nuevoNumero >= limiteMinimo && nuevoNumero <= limiteMaximo){
            nuevoNumero = Math.round(nuevoNumero * 100) / 100d;
            numero = nuevoNumero;
            return true;
        }
        return false;
    }
}
