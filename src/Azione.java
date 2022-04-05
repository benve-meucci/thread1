public class Azione extends Thread{
    boolean aggiungi; 
    Salvadanaio salvadanaio;
    int quantita;
    
    public Azione(Salvadanaio s, boolean a, int q) {
        salvadanaio = s;
        aggiungi = a;
        quantita = q;
    }
    
    public void run(){
        for(int i=0; i < quantita; i++){
            if(aggiungi){
                salvadanaio.inserisci();
            }else{
                salvadanaio.preleva();
            }
        }
    }


}
