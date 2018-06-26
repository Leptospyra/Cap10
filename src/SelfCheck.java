import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SelfCheck {
    public static void main(String[] args){
        ArrayList<String> elementos = new ArrayList<String>();
        //Exercicio02(elementos);
        //Exercicio03(elementos);
        //Exercicio04(elementos);
        //Exercicio05(elementos);
        //Exercicio06(elementos);
        //System.out.println(maxLength(elementos)); //Exercicio 07
        //Exercicio08(elementos);
        //Exercicio09(elementos);
        //Exercicio10(elementos);
        //Exercicio11(elementos);
        //Exercicio17();
        Exercicio18();

    }

    private static void Exercicio18() {
        Scanner s = new Scanner(System.in);
        System.out.print("Type a message to sort: ");
        String frase = s.nextLine();

        ArrayList<String> words = new ArrayList<String>();
        Scanner lineScan = new Scanner(frase);
        while (lineScan.hasNext()){
            words.add(lineScan.next());
        }

        System.out.print("Your message sorted: ");
        Collections.sort(words);
        for (String word: words){
            System.out.print(word+" ");
        }
    }

    //
    private static void Exercicio17() {
        Scanner s = new Scanner(System.in);
        System.out.println("Type a name: ");
        String name01 = s.nextLine();
        System.out.println("Type a name: ");
        String name02 = s.nextLine();
        int resultado = name01.compareTo(name02);

        if (resultado < 0){
            System.out.printf("%s goes before %s", name01, name02);
        } else {
            System.out.printf("%s goes before %s", name02, name01);
        }

    }

    private static void Exercicio11(ArrayList<String> elementos) {
        for (String s : elementos) {
            System.out.println(s);
            if (s.equals("hello")) {
                elementos.add("goodbye");
            }
        }
    }

    //write a for-each loop that prints the uppercase version of each String in the list on its own line.
    private static void Exercicio10(ArrayList<String> elementos) {
        elementos.add("It");
        elementos.add("was");
        elementos.add("a");
        elementos.add("stormy");
        elementos.add("night");
        elementos.add(3,"dark");
        elementos.add(4,"and");
        Collections.sort(elementos);

        for (String s : elementos) {
            System.out.println(s.toString().toUpperCase());
        }
    }

    //Given the ArrayList from problem 3, write code to print out the index at which your list contains the value
//“stormy” and the index at which it contains “dark”. Do not use a loop.
    private static void Exercicio09(ArrayList<String> elementos) {
        elementos.add("It");
        elementos.add("was");
        elementos.add("a");
        elementos.add("stormy");
        elementos.add("night");
        elementos.add(3,"dark");
        elementos.add(4,"and");

        System.out.println("Index of Stormy: "+elementos.indexOf("stormy"));
        System.out.println("Index of dark: "+elementos.indexOf("dark"));


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
