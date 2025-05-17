import javax.swing.JOptionPane;


/*Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase
JOptionPane y metodo showInputDialog().
Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
 (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre
de la persona.
Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."*/
public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre completo de la primera persona:");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre completo de la segunda persona:");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre completo de la tercera persona:");
        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max : nombre3;
        System.out.println("La persona con el nombre más largo es: " + max);
    }
}
