package Analizador2;

public class Analizadores {
    public static void main(String[] args){
        try {
            String ruta = "src/Analizadores/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCUP);
            
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
