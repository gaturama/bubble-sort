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

        // Inserindo dados do arquivo de texto
        String valores = new String(); 
        String arqv = "C:/Users/gabriel.oliveira20/Desktop/Exe JavaPoo/bubble sort/arquivo.txt";

        File file = new File (arqv);

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

                                int[] lista = new int[linhas]; 
                                    leitura = new FileReader(arqv);
                                        bufferedReader = new BufferedReader(leitura); // releitura do arquivo
                                            linhas = 0;
                                                String linha ="";
                                                     while((linha = bufferedReader.readLine())!= null){
                                                        lista[linhas] = Integer.parseInt(linha);
                                                             linhas++;
                                                        }
                                                             bufferedReader.close();

                                                                System.out.println(Arrays.toString(lista));

                                                                    for (int i = linhas; i < 0; i++ ){ //tentativa de ordenar o array :(
                                                                         System.out.println(vetor[linhas]);
                                                                     }
                                                                 }catch(IOException e){
                                                            System.out.println("Deu erro, tente novamente!" + e.getMessage()); // mensagem de erro, caso o usuário faça algo errôneo
                                                             } 
                                                         }
                                                      }
                          

