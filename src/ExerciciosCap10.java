import java.util.ArrayList;
import java.util.Scanner;

public class ExerciciosCap10 {
    public static void main (String[] args){
        ArrayList<String> words = new ArrayList<String>();
        String frase = "tudo que se foi sera denovo do jeito que ja foi um dia tudo passa tudo sempre passara nao adianta sorrir";
        Scanner lineScan = new Scanner(frase);
        while(lineScan.hasNext()){
            words.add(lineScan.next());
        }
        //Exercicio01(words);
        //Exercicio02(words);
        //Exercicio03(words);
        //Exercicio04();
        //Exercicio05();
        //Exercicio06();
        Exercicio07();
    }

    private static void Exercicio07() {
    }

    private static void Exercicio06() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(3);
        numeros.add(8);
        numeros.add(92);
        numeros.add(4);
        numeros.add(2);
        int indice = 0;
        int minimo = numeros.get(0);
        for(Integer n : numeros){
            if (n < minimo){
                minimo = n;
                indice = numeros.indexOf(n);
            }
        }
        numeros.remove(indice);
        numeros.add(0,minimo);

        for(Integer n : numeros){
            System.out.print(n+", ");
        }


    }

    private static void Exercicio05() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> scaleByK = new ArrayList<Integer>();
        numeros.add(4);
        numeros.add(1);
        numeros.add(2);
        numeros.add(0);
        numeros.add(3);
        for (Integer n : numeros){
            if (n == 0){continue; }
            for (int i = 0; i<n;i++){
                scaleByK.add(n);
            }
        }
        for (Integer n : scaleByK){
            System.out.print(n+", ");
        }
    }

    private static void Exercicio04() {
        ArrayList<String> words = new ArrayList<String>();
        String s = "how are you?";
        Scanner lineWord = new Scanner(s);
        while (lineWord.hasNext()){
            words.add(lineWord.next());
        }

        for (int i=1; i<=words.size();i+=2){
            words.add(i,words.get(i-1));
        }
        for (String y : words){
            System.out.print(y+" ");
        }
    }

    //Write a method called removeEvenLength that takes an ArrayList of Strings as a parameter and removes all of
//the Strings of even length from the list.
    private static void Exercicio03(ArrayList<String> words) {
        for (int i = 0; i<words.size(); i++){
            if (words.get(i).length()%2==0){
                words.remove(words.get(i));
            }
        }
        for (String s : words){
            System.out.print(s+" ");
        }

    }

    private static void Exercicio02(ArrayList<String> words) {
        String aux = "";
        for (int i =1; i<words.size();i+=2){
            aux = words.get(i-1);
            words.set(i-1,words.get(i));
            words.set(i, aux);
        }
        for (String s : words){
            System.out.print(s+" ");
        }
    }

    private static void Exercicio01(ArrayList<String> words) {
        char[] vogal = {'a','e','i','o','u' };
        int[] contVogal = new int[5];
        int contPalavras = 0;
        int contVogais = 0;
        for (String palavra : words){ //percorre todo o arrary com as palavras
            contPalavras++;
            for (int i=0; i<palavra.length();i++){ // percorre a palavra caracter por caracter
                for (int j = 0; j<5; j++) {
                    if (vogal[j] == palavra.charAt(i)) {
                        contVogais++;
                    }
                }
            }
        }
        System.out.printf("%3.2f",1.0*contPalavras/contVogais);
    }
}
