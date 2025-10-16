/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author Usuario
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerConTryWithResources {
    public static void main(String[] args) {
        String ruta = "archivo_ejemplo.txt"; // o pedilo por args
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ioe) {
            System.out.println("Error leyendo el archivo: " + ioe.getMessage());
        }
    }
}
