import java.util.ArrayList;
import java.util.Collections;
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
        //Exercicio07(words);
        //Exercicio08();
        //Exercicio09();
        //Exercicio10();
        //Exercicio11(); // ja fiz antes
        //Exercicio12();
        //Exercicio13// ja fiz antes
        //Exercicio14(words); // o pulo do gato é criar uma variavel com o tamanho do array e usar a variavel no loop
        //Exercicio15(words);
        //Exercicio16();
        //novo();
        immutability();
    }

    private static void immutability() {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        String s3 = s2.concat("3");
        s3.concat("oi");
        s3+=s1;
        System.out.println(s2);
        System.out.println(s3);

    }

    public static void novo(){
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for(int i=0; i<names.size(); i++) {
            String name = names.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }
    private static void Exercicio16() {
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        String fraseA1 = "0 2 4 6 8 10";
        String fraseA2 = "1 3 5 7 9 11 13";
        Scanner lineScanA1 = new Scanner(fraseA1);
        Scanner lineScanA2 = new Scanner(fraseA2);
        while(lineScanA1.hasNext()){
            a1.add(lineScanA1.next());
        }
        while(lineScanA2.hasNext()){
            a2.add(lineScanA2.next());
        }
        interleave(a1, a2);
    }

    private static void interleave(ArrayList<String> a1, ArrayList<String> a2) {
        int menorDosArrays = Math.min(a1.size(), a2.size());
        int i;
        for (i=0; i<menorDosArrays;i++){
            a1.add(i*2+1,a2.get(i));
        }
        if (i <  a2.size()){ //eu errei aqui por que a1 foi almentando de tamanho (a2>a1 não funcionaria)
            for (int j=i; j<a2.size();j++ ){
                a1.add(a2.get(j));
            }
        }
        for(String n : a1){
            System.out.print(n+", ");
        }
    }

    private static void Exercicio15(ArrayList<String> array) {
        for(String n : array){
            System.out.print(n+", ");
        }
        int oldSize = array.size();
        for (int i = 0; i < oldSize / 2; i++) {
            String segundoElemento = array.get(i+1);
            array.remove(i+1);
            array.set(i,"(\""+array.get(i)+" "+segundoElemento+"\")");
        }
        System.out.println();
        for(String n : array){
            System.out.print(n+", ");
        }
    }

    //Write a method called removeShorterStrings that accepts an ArrayList of strings as a parameter and removes
//from each pair of values the shorter string in the pair. If the list is of odd length, the final element is unchanged.
    private static void Exercicio14(ArrayList<String> array) {
        /*ArrayList<String> words2 = new ArrayList<String>();

        for (int i =1; i<words.size();i+=2){
            int tamanho1 = words.get(i-1).length();
            int tamanho2 = words.get(i).length();
            if (tamanho2>tamanho1){
                words2.add(words.get(i));
            }else{
                words2.add(words.get(i-1));
            }
        }*/
        for(String n : array){
            System.out.print(n+", ");
        }
        int oldSize = array.size();

        for (int i = 0; i < oldSize / 2; i++) {
            int length1 = array.get(i).length();
            int length2 = array.get(i + 1).length();
            if (length1 == length2) {
                array.remove(i);
            } else if (length1 > length2) {
                array.remove(i + 1);
            } else {
                array.remove(i);
            }
        }
        System.out.println();
        for(String n : array){
            System.out.print(n+", ");
        }
    }

    //Write a method called markLength4 that accepts an ArrayList of strings as a parameter and that places a string of
//four asterisks "****" in front of every string of length 4.
    private static void Exercicio12() {
        ArrayList<String>  words = new ArrayList<>();
        ArrayList<String>  wordsFinal = new ArrayList<>();
        String frase = "this is lots of fun for Java coders";
        Scanner scan = new Scanner(frase);
        while (scan.hasNext()){
            words.add(scan.next());
        }
        for (String s : words){
            if (s.length()==4){
                wordsFinal.add("****");
            }
            wordsFinal.add(s);
        }
        for(String n : words){
            System.out.print(n+", ");
        }
        System.out.println();
        for(String f : wordsFinal){
            System.out.print(f+", ");
        }
    }


    private static void Exercicio10() {
        String wInicial = "free";
        String wFinal = "rich";
        int resultado = 0;
        ArrayList<String>  words = new ArrayList<>();
        String frase = "to be or not to be that is the question";
        Scanner scan = new Scanner(frase);
        while (scan.hasNext()){
            words.add(scan.next());
        }

        for (int i=0;i<words.size();i++){
            if ((wInicial.compareTo(words.get(i))<=0) && (wFinal.compareTo(words.get(i))>=0)){
                words.remove(i);
            }
        }
        for(String n : words){
            System.out.print(n+", ");
        }

    }

    private static void Exercicio09() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(7);
        numeros.add(2);
        numeros.add(0);
        numeros.add(0);
        numeros.add(4);
        numeros.add(0);
        numeros.add(9);
        numeros.add(0);
        numeros.add(6);
        numeros.add(4);
        numeros.add(8);
        int firstIndex = numeros.indexOf(0);
        int lastIndex = numeros.lastIndexOf(0);
        System.out.println(lastIndex - firstIndex +1 );
    }

    //Write a method called removeZeroes that takes as a parameter an ArrayList of integers and eliminates any
//occurrences of the number 0 from the list. For example, if the list stores the values (0, 7, 2, 0, 0, 4, 0) before the
//method is called, it should store the values (7, 2, 4) after the method finishes executing.
    private static void Exercicio08() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        numeros.add(0);
        numeros.add(7);
        numeros.add(2);
        numeros.add(0);
        numeros.add(0);
        numeros.add(4);
        numeros.add(0);
        for (int i=0; i<numeros.size();i++){
            if (numeros.get(i)!=0){
                lista.add(numeros.get(i));
            }
        }
        for(Integer n : lista){
            System.out.print(n+", ");
        }

    }

    //Write a method called removeDuplicates that takes as a parameter a sorted ArrayList of Strings and eliminates
//any duplicates from the list.
    private static void Exercicio07(ArrayList<String> words) {

        Collections.sort(words);
        for (int i=1; i<words.size();i++){
            if (words.get(i).equals(words.get(i-1))){
                words.remove(i-1);
            }
        }
        for(String n : words){
            System.out.print(n+", ");
        }
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
