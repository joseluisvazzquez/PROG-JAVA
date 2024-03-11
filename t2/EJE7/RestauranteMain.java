package EJE7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class RestauranteMain {
    public static void main(String[] args) {
        List<Restaurante> restaurantes = new ArrayList<>();
        String path = "pathAbsoluto";
        File fl = new File(path);
        try (BufferedReader br = new BufferedReader(fl)) {
        } catch (IOException e) {
           
            e.printStackTrace();
        }

    }
}
