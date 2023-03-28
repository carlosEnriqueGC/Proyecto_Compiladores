/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerarchivo;

import java.io.File;

/**
 *
 * @author Charly Ponce
 */
public class PrincipalAnalizador {
    public static void main(String[] args) {
        String ruta = "C:/Users/callo/Videos/Proyecto compiladores/Proyecto_Compiladores-main/src/leerarchivo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
