
/**
 * Dada una cadena invertir la misma y mostrar por pantalla.
 */
public class Ej2
{
    public static void main()
    {
        int cantidad=0,fin=0;
        String S1="esta oracion debe estar invertida";
        fin=S1.length()-1;
        for(int i=fin;i>=0;i--)
        {
            System.out.print(S1.charAt(i));
            System.out.print("Generar conflicto local");
        }
    }
}
