import javax.sql.rowset.spi.SyncResolver;

public class Salvadanaio {
    public static int monete = 0;

    public void inserisci(){
        usa(true);
    }

    public void preleva(){
        usa(false);
    }

    private void usa(boolean aggiungi){
        if(aggiungi){
            monete++;
        }else{
            monete--;
        }
    }
}
