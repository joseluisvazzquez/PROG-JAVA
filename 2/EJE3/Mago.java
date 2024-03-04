package EJE3;

public class Mago extends Personaje{
    private int energia;

    public Mago(String nombre, int vida, int fuerza, int energia) {
        super(nombre, vida, fuerza);
        this.energia = energia;
    }
    public int getEnergia() {
        return energia;
    }
    @Override
    public void Atacar(Personaje objetivo) {
       if( this.energia > 4){
            objetivo.recibirAtaque(getFuerza()*2);
            this.energia = this.energia - 4;
       }else{
        System.out.println("MANA INSUFICIENTE....");
       }
        
    }
    @Override
    public void recibirAtaque(int cantidad) {
        this.setVida(this.getVida()-cantidad); 
        
    }
    public boolean Vivo(){
        if(getVida() > 0){
            // vivo = true;
            return true;

        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Vida:"+getVida()+"----"+getNombre(); 
    }
    

}
