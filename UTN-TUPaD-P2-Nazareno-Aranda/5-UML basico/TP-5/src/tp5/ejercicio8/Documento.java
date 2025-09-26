/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio8;
import java.util.ArrayList;
import java.util.List;

public class Documento {
    private String titulo;
    private String contenido;
    private List<FirmaDigital> firmas; // Composición: Documento controla la existencia

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmas = new ArrayList<>();
    }

    public void agregarFirma(FirmaDigital firma) {
        firmas.add(firma);
    }

    @Override
    public String toString() {
        return "Documento: " + titulo + "\nContenido: " + contenido + "\nFirmas: " + firmas;
    }
}
