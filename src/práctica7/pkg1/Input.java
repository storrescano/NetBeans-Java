package práctica7.pkg1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import static práctica7.pkg1.Práctica71.lector;


public class Input {
    
    public static void InputStream(String origen,String destino){
        int posicion;
        System.out.println("Introduzca la ruta de origen.");
        try (FileInputStream entrada = new FileInputStream(lector.nextLine());
                FileOutputStream salida = new FileOutputStream(lector.nextLine())){
            do {
                posicion = entrada.read();
                if (posicion != -1){
                    salida.write((char)posicion);
                }
            } while (posicion != -1);
        } 
        catch (IOException exc){
            
        }
    }
}
