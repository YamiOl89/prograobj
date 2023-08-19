package Padre;

import java.util.List;

public class pizzaItaliana extends Pizza {
    private String salsa;
    private int tiempoEnHorno;

    public pizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando la pizza italiana...");
        super.preparar();
        System.out.println("Agregando salsa " + salsa + " durante la preparación.");
        for (String topping : getIngredientes()) {
            System.out.println("Agregando topping " + topping + " a la pizza italiana.");
        }
    }

    @Override
    public String toString() {
        String mensaje = super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno;
        if (super.estaLista) {
            mensaje += " (Italiana)";
        }
        return mensaje;
    }
}