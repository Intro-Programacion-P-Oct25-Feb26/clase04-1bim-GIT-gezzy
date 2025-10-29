/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        // Uso de printf
        // f: formato

        String nombreEstudiante = "Jesus David";
        String apellidoEstudiante = "Maldonado Zambrano";
        int edad = 18;
        String direccion = "Zarzas 2";
        String uni = "UTPL";
        String ciclo = "Primer ciclo";
        String assig = "Introduccion a la programacion";
        String paralelo = "Paralelo A";

        System.out.printf("Nombre: \n\t%s\nApellido:\n\t%s\nEdad:%s\n"
                + "Direccion:\n\n\t%s\n--------------------------------\n"
                + "Universidad:%s\nCiclo:%s\nAsignatura:%s\nParalelo:\n\t%s",
                nombreEstudiante, apellidoEstudiante, edad, direccion, uni, ciclo, assig, paralelo);

    }
}
