
package Padre;

public class Topping {
    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.agregarTopping(nombre);
        System.out.println("Agregando topping " + nombre + " a la pizza.");
    }
}