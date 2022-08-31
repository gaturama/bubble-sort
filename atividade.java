import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;

public class atividade {

    public static void main (String[] args) {
        
        System.out.println("*---------------------*");
        System.out.println(" ATIVIDADE AVALIATIVA ");
        System.out.println("*---------------------*");

        String valores = new String();
        String arqv = "C:/Users/Gabriel/github/yourrepositories/bubblesort/arquivo.txt";

        File scan = new File (arqv);

        int[] vetor = new int [5];
        
        while(scan.exists()){
            try{
                FileReader leitura = new FileReader(arqv);
                    BufferedReader bufferedReader = new BufferedReader(leitura);
            }catch(IOException e){
                
            }
        }

            //ABAIXO ESTÃO OS VALORES RECEBIDOS DO ARQUIVO DE TEXTO.   
            vetor[0] = 5;
                vetor[1] = 6;
                    vetor[2] = 4;
                        vetor[3] = 9;
                            vetor[4] = 7;

                                }
            
        
    }
