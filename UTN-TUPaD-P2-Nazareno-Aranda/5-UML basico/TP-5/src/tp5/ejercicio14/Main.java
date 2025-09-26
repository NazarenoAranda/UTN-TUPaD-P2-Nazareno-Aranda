/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio14;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto("Documental", 45);

        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto1);
    }
}
