/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer3CSV;

import Ejer2CSV.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Jose
 */
public class escenario1 {

    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema de registro");
        System.out.println("Desea : 1)Ingresar Programador \n"
                + "2)Añadir especializacion al programador \n"
                + "3)Añadir Lider de Proyecto \n");
        Scanner s = new Scanner(System.in);
        int caso = s.nextInt();
        switch (caso) {
            case 1:
                opc c = new opc();
                Scanner dni = new Scanner(System.in);
                System.out.println("Ingrese su Identificacion");
                int ced = dni.nextInt();
                String verifico = c.consulta(1, ced);
                if (verifico == null) {
                    Scanner nom = new Scanner(System.in);
                    Scanner em = new Scanner(System.in);
                    Scanner leg = new Scanner(System.in);
                    System.out.println("Ingrese el Nombre");
                    String nomb = nom.next();
                    System.out.println("Ingrese su sallario");
                    int ema = em.nextInt();
                    System.out.println("Ingrese su lenguaje de programacion");
                    String len = leg.nextLine();
                    String txt = ced + ";" + nomb + ";" + ema + ";" + len + ";";
                    c.insertar(1, txt);
                    JOptionPane.showMessageDialog(null, "Programador registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero de cedula ya ha sido registrado");
                }
                break;
            case 2:
                opc doc = new opc();
                Scanner dn = new Scanner(System.in);
                System.out.println("Ingrese su Identificacion");
                int ce = dn.nextInt();
                String ver = doc.consulta(2, ce);
                if (ver == null) {
                    Scanner nom = new Scanner(System.in);
                    Scanner em = new Scanner(System.in);
                    Scanner ho = new Scanner(System.in);
                    Scanner es = new Scanner(System.in);
                    System.out.println("Ingrese el Nombre");
                    String nomb = nom.next();
                    System.out.println("Ingrese el Email");
                    String ema = em.next();
                    System.out.println("Escoja la especializacion : \n"
                            + "1) Docente Titular\n"
                            + "2) Docente Auxiliar\n");
                    int e = es.nextInt();
                    String er = null;
                    if (e == 1) {
                        er = "Docente Tiular";
                    } else if (e == 2) {
                        er = "Docente Auxiliar";
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    String hc;
                    if (er == "Docente Titular") {
                        System.out.println("Ingrese el horario de clases");
                        hc = ho.nextLine();
                    } else {
                        System.out.println("Ingrese el horario de tutoria");
                        hc = ho.nextLine();
                    }
                    String txt;
                    if (er == "Docente Titular") {
                        txt = ce + ";" + nomb + ";" + ema + ";" + er + ";" + hc + ";" + ";";
                    } else {
                        txt = ce + ";" + nomb + ";" + ema + ";" + er + ";" + ";" + hc + ";";
                    }
                    //txt = ce + ";" + nomb + ";" + ema + ";" + er + ";" + h;
                    doc.insertar(2, txt);
                    JOptionPane.showMessageDialog(null, "Docente registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero de cedula ya ha sido registrado");
                }
                break;
            case 3:
                opc co = new opc();
                Scanner cd = new Scanner(System.in);
                System.out.println("Ingrese el codigo del componente");
                int codi = cd.nextInt();
                String verific = opc.consulta(3, codi);
                if (verific == null) {
                    Scanner nom = new Scanner(System.in);
                    Scanner em = new Scanner(System.in);
                    System.out.println("Ingrese el Nombre");
                    String nomb = nom.next();
                    System.out.println("Ingrese el numero de creditos del componente");
                    int ema = em.nextInt();
                    String txt = co + ";" + nomb + ";" + ema + ";";
                    co.insertar(3, txt);
                    JOptionPane.showMessageDialog(null, "Componente registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "El codigo del componente ya ha sido registrado");
                }
                break;
        }
    }
}
