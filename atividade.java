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
        String arqv = "C:/Users/Gabriel/github/yourrepositories/bubblesort/arquivo.txt";

        File scan = new File (arqv);

        int[] vetor = new int [5];
        
        while(scan.exists()){
            try{
                FileReader leitura = new FileReader(arqv);
                    BufferedReader bufferedReader = new BufferedReader(leitura);
                         }catch(IOException e){
                                System.out.println(" Deu erro, tente novamente!");
            } 
        }
            int[] vetor1 = new int[5];

            vetor [1] = 5;
                vetor [2] = 6;
                     vetor [3] = 4;
                        vetor [4] = 9;
                            vetor [5] = 7;

                                 for(int i=0; i<vetor.length; i++){
                                    System.out.println(vetor1[i]);                          
                                 }
                                    System.out.println(vetor1);

                                    System.out.println(Arrays.toString(vetor1));
                                }
                            }

