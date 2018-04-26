package pro_boletin_28;

import javax.swing.JOptionPane;

/**
 *
 * @author abrandarizdominguez
 */
public class Alumno {
    
    private String nombre = "Adrian";
    private int nota = 8;
    private Direccion direccion = new Direccion();
    
    /**
     * Constructor por defecto.
     */
    public Alumno() {
        
    }

    /**
     * Constructor por parámetros.
     * 
     * @param nombre
     * @param nota
     * @param direccion 
     */
    public Alumno(String nombre, int nota, Direccion direccion) {
        this.nombre = nombre;
        this.nota = nota;
        this.direccion = direccion;
    }

    // SETS:
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //GETS:
    
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + ", direccion=" + direccion + '}';
    }
    
    /**
     * Método que pide un nuevo valor y cambia la nota anterior por la nueva.
     */
    public void cambiarNota() {
        int nuevaNota = Integer.parseInt(JOptionPane.showInputDialog("Nueva nota:"));
        setNota(nuevaNota);
    }
    
    public void cambiarCalle() {
        String nuevaCalle = JOptionPane.showInputDialog("Nueva calle:");
        direccion.setCalle(nuevaCalle);
    }
    
    public void ver() {
        Direccion in = new Direccion();
        System.out.println("Nombre: " + nombre
                            + "\nNota: " + nota
                            + "\nDireccion: " + direccion);
    }

    private class Direccion {

        private String calle = "Garcia Barbon";
        private int numero = 20;
        
        /**
         * Constructor por defecto.
         */
        public Direccion() {
            
        }

        /**
         * Constructor por parámetros.
         * 
         * @param calle
         * @param numero 
         */
        public Direccion(String calle, int numero) {
            this.calle = calle;
            this.numero = numero;
        }

        //SETS:
        
        public void setCalle(String calle) {
            this.calle = calle;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        // GETS:
        
        public String getCalle() {
            return calle;
        }

        public int getNumero() {
            return numero;
        }

        @Override
        public String toString() {
            return "\nCalle: " + calle + "\nNumero: " + numero;
        }
        
    }
}
