/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivo;

import java.io.File;


public class PrincipalAnalizador {
    public static void main(String[] args) {
        String ruta = "D:/Proyectos/Proyecto_Compiladores/src/leerarchivo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
