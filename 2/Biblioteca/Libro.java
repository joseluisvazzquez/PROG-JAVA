package Biblioteca;

class Libro {
    private String titulo;
    private String autor;
    private int calif;
    
    public Libro(String titulo, String autor, int calif) {
        this.titulo = titulo;
        this.autor = autor;
        this.calif = calif;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public  String getTitulo(){
        return titulo; 
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setCalif(int calif){
        this.calif = calif;
    }
    public int getCalif(){
        return calif;
    }

}