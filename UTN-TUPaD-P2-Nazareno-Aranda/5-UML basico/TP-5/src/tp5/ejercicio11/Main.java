/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("The Beatles", "Rock");
        Cancion cancion1 = new Cancion("Hey Jude", artista1);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1);
    }
}
