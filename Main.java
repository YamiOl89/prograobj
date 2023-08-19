import Padre.Pizza;
import Padre.pizzaItaliana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear ingredientes para la pizza Margarita
        List<String> ingredientesMargarita = new ArrayList<>();
        ingredientesMargarita.add("salsa");
        ingredientesMargarita.add("jamon");
        ingredientesMargarita.add("peperoni");
        ingredientesMargarita.add("champiñones");
        ingredientesMargarita.add("aceitunas");

        // Crear una pizza Margarita
        Pizza pizzaMargarita = new Pizza("Pizza Margarita", 90.00, ingredientesMargarita);
        pizzaMargarita.preparar();
        System.out.println(pizzaMargarita);

        // Crear ingredientes para la pizza Pepperoni
        List<String> ingredientesPizza = new ArrayList<>();
        ingredientesPizza.add("queso");
        ingredientesPizza.add("tomate");
        ingredientesPizza.add("cebolla");

        // Crear una pizza Pepperoni
        pizzaItaliana pizzaItaliana = new pizzaItaliana("Pizza Pepperoni", 90.00, ingredientesPizza, "tomate", 25);
        pizzaItaliana.preparar();
        System.out.println(pizzaItaliana);
    }
}