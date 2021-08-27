package Analizador1;

public class Analizadores {
    public static void main(String[] args){
        try {
            String ruta = "src/Analizador1/";
            String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", ruta, "-parser", "parser", ruta + "Sintactico.cup"};
            java_cup.Main.main(opcCUP);
            
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
