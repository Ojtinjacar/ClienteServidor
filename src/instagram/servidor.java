/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instagram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Estudiante
 */
public class servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Servidor Esperando");
        Socket Cliente = serverSocket.accept();
        
        InputStream flujo_entrada = Cliente.getInputStream();
        OutputStream flujo_salida = Cliente.getOutputStream();
        
        BufferedReader lectura = new BufferedReader(new InputStreamReader(flujo_entrada));
        PrintWriter escritura = new PrintWriter(flujo_salida, true);
        
        BufferedReader lecturaUsuario = new BufferedReader(new InputStreamReader(System.in));
        
        
        String mensajeLeido = "";
       
        while (true) {
            
         //   mensajeUsuario = lecturaUsuario.readLine();

            mensajeLeido = lectura.readLine();
            System.out.println(mensajeLeido);
             System.out.println("Ingrese mensaje ");
            mensajeLeido=lecturaUsuario.readLine();
            escritura.println(mensajeLeido);

        }
    }

}
