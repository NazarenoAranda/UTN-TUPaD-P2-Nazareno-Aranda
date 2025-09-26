/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio8;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Juan Perez", "juan@mail.com");
        FirmaDigital firma1 = new FirmaDigital("ABC123", LocalDate.now(), usuario1);

        Documento doc1 = new Documento("Contrato", "Contenido del contrato...");
        doc1.agregarFirma(firma1);

        System.out.println(doc1);
    }
}
