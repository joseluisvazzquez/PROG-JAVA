package EJE6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ProductoMain {
    public static void main(String[] args) {
        String sharePath = "C:\\Users\\alumne-DAM\\Documents\\PROG-JAVA\\t2\\EJE6\\Map Prouctos.txt";
        HashMap<Integer, Producto> getInfo = new HashMap<Integer, Producto>();

    }
    public static void leerProductos(String sharePath, HashMap<Integer, Producto> getInfo) throws IOException{
        File filename = new File(sharePath);
        BufferedReader rd = new BufferedReader(new FileReader(filename) );
        String linea = null;
        linea = rd.readLine();

        while(linea != null){
            String[] values = linea.split(",");
            


        }


    }
}
