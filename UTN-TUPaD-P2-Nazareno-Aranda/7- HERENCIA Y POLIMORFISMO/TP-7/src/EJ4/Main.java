/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("-------------------");
        }
    }
}
