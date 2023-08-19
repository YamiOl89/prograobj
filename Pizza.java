package Padre;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;
    private List<String> ingredientes;
    boolean estaLista;

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.estaLista = false;
    }

    public void preparar() {
        System.out.println("Preparando la pizza...");
        estaLista = true;
    }

    public void agregarTopping(String topping) {
        ingredientes.add(topping);
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        String mensaje = "El nombre de la pizza: " + nombre + ", y el precio es: " + precio;
        if (nombre.equals("Pizza Margarita")) {
            mensaje += ", Ingredientes: " + ingredientes.toString();
        }
        if (estaLista) {
            mensaje += ", la pizza está lista para ser servida.";
        }
        return mensaje;
    }
}