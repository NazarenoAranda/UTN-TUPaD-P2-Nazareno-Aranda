/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author Usuario
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        System.out.print("Ruta del archivo a leer: ");
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();
        try {
            File file = new File(ruta);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: archivo no encontrado -> " + ruta);
        } finally {
            sc.close();
        }
    }
}
