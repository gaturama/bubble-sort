import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;


public class atividade { 

    public static void main (String[] args) {
        
        System.out.println("*---------------------*");
        System.out.println(" ATIVIDADE AVALIATIVA ");
        System.out.println("*---------------------*");

        
        String arqv = "C:/Users/gabriel.oliveira20/Desktop/Exe JavaPoo/bubble sort/arquivo.txt";

        File file = new File (arqv); // Inserindo o arquivo de texto

        int[] vetor = new int [10];
        
        
        try{
            // Puxando os dados do arquivo de texto para o programa
            FileReader leitura = new FileReader(arqv);
            BufferedReader bufferedReader = new BufferedReader(leitura); //função para ler o arquivo
            int linhas = 0;
            while(bufferedReader.readLine()!= null){
                linhas++;
            }
            bufferedReader.close(); //fechamento da leitura

            int[] lista = new int[linhas]; // programa irá ler linha a linha do arquivo
            leitura = new FileReader(arqv);
            bufferedReader = new BufferedReader(leitura); // releitura do arquivo
            linhas = 0;
            String linha ="";
            while((linha = bufferedReader.readLine())!= null){
                lista[linhas] = Integer.parseInt(linha);
                linhas++;
            }
            bufferedReader.close(); // outro fechamento de leitura

            System.out.println("Array desordenado: ");
            System.out.println(Arrays.toString(lista));

            System.out.println("Passos da Ordenação: ");

            int n = lista.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (lista[j] > lista[j + 1]) {
                        // swap lista[j+1] and lista[j]
                        int temp = lista[j];
                        lista[j] = lista[j + 1];
                        lista[j + 1] = temp;

                        System.out.println(Arrays.toString(lista));
                    }
            
            System.out.println("Array ordenado: ");
            System.out.println(Arrays.toString(lista));
        } catch(IOException e){
            System.out.println("Deu erro, tente novamente!" + e.getMessage()); // mensagem de erro, caso o usuário faça algo errôneo

            
        } 
    }
}
                          

