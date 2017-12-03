package Harold.p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //librerias a usar
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String cadena;
        bw.write("Ingrese los numeros separados por comas\n");
        bw.flush();
        cadena = br.readLine();
        String b[] = cadena.split(",");//separo por comas y lo guardo en un arreglo
        bw.write("Ingrese k:\n");
        bw.flush();
        int k = Integer.parseInt(br.readLine());
        int cont=0;

        for (int i = 0; i < b.length; i++) {
            for (int j = i+1; j < b.length; j++) {
                if(k==Math.abs(Integer.parseInt(b[i])- Integer.parseInt(b[j])))
                    cont +=1;} }

        bw.write("El contador es: "+cont+"\n");
        bw.flush();}
}
