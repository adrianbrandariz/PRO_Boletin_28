/*
 *                              BOLETIN 28
 *
 * Codifica un programa formado por una clase externa llamada Alumno y una clase
 * interna llamada Direccion.
 * La clase Alumno tiene los siguientes atributos:
 *   • nombre ( String )
 *   • nota ( int ).
 *   • direccion ( Direccion )
 *
 * Métodos :
 *   • constructor 
 *   • acceso
 *   • toString
 *   • cambiar nota  cambia la nota de un alumno
 *
 * La clase interna tiene 2 atributos:
 *   • calle ( String )
 *   • numero ( int )
 *
 * Métodos:
 *   • constructor
 *   • acceso
 *   • toString()
 * En la clase principal debes llamar al método mostrar 
 * (muestra todos los datos de la persona), después llamas al método cambiar nota
 * y vuelves a mostrar todos los datos de la persona. 
 */
package pro_boletin_28;

/**
 *
 * @author abrandarizdominguez
 */
public class PRO_Boletin_28 {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        alu1.ver();
        alu1.cambiarNota();
        alu1.ver();
        alu1.cambiarCalle();
        alu1.ver();
    }
    
}
