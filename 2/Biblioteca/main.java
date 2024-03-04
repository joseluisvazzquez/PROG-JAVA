package Biblioteca;
public class main {
    public static void main(String[] args) {
        Estanteria e = new Estanteria();
        e.AñadirLibro("L1","Vegeta777", 3);
        e.AñadirLibro("L2", "Willy", 6);
        e.AñadirLibro("L3","Coco", 2);
        e.AñadirLibro("L4", "Auron", 9);
        e.AñadirLibro("L5", "Zelda", 8);
        e.Top10();
        e.EliminarLibro("Coco");
        e.Mostrarlibro();
       
    }
}
