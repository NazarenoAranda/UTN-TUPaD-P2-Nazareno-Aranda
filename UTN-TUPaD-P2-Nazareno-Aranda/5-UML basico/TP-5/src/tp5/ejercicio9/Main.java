/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Ana Gómez", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Martín López", "Cardiología");

        CitaMedica cita1 = new CitaMedica(LocalDate.of(2025, 10, 5), LocalTime.of(10, 30), paciente1, profesional1);

        System.out.println(cita1);
    }
}
