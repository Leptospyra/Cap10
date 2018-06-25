import java.lang.reflect.Array;
import java.util.ArrayList;

public class SelfCheck {
    public static void main(String[] args){
        ArrayList<String> elementos = new ArrayList<String>();
        Exercicio02(elementos);
        Exercicio03(elementos);
        Exercicio04(elementos);
        Exercicio05(elementos);
        Exercicio06(elementos);
        System.out.println(maxLength(elementos)); //Exercicio 07
        Exercicio08(elementos);
    }

    private static void Exercicio08(ArrayList<String> elementos) {

        System.out.println(elementos.contains("IS"));
    }

    private static int maxLength(ArrayList<String> elementos) {
        if (elementos.size()==0){
            return 0;
        }
        String palavra = elementos.get(0);
        int nMax = palavra.length();
        for (int i = 1; i < elementos.size(); i++) {
            palavra = elementos.get(i);
            if (palavra.length() >= nMax) {
                nMax = palavra.length();
            }
        }
        return nMax;
    }

    private static void Exercicio06(ArrayList<String> elementos) {
        for (int i = 0; i < 10; i++) {
            elementos.add(i*2+"");
        }
        System.out.println(elementos.toString());
    }

    private static void Exercicio05(ArrayList<String> elementos) {
        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i).indexOf("a") >= 0) {
                elementos.remove(i);
                i--; // so the new element i will be checked
            }
        }
        System.out.println(elementos.toString());
        /* essa foi minha solução, não sabia usar indexOf
        int i = 0;
        String palavra = "";
        while (i<elementos.size()){
            palavra = elementos.get(i);
            for (int j = 0; j< palavra.length();j++){
                if (palavra.charAt(i)=='a'){
                    elementos.remove(i);
                    i--;
                }

            }
            i++;
        }*/

    }

    private static void Exercicio04(ArrayList<String> elementos) {
        elementos.set(1,"IS");
        System.out.println(elementos.toString());
    }

    private static void Exercicio03(ArrayList<String> elementos) {
        elementos.add(3,"dark");
        elementos.add(4,"and");
        System.out.println(elementos.toString());
    }

    public static void Exercicio02(ArrayList<String> elementos){
        elementos.add("It");
        elementos.add("was");
        elementos.add("a");
        elementos.add("stormy");
        elementos.add("night");
        System.out.println(elementos.size());

    }

}
