public class App {
    public static void main(String[] args) throws Exception {
        Salvadanaio s = new Salvadanaio();
        
        Azione inserireMonete = new Azione(s, true, 10000);
        Azione prelevareMonete = new Azione(s, false, 10000);
        
        inserireMonete.start();
        prelevareMonete.start();

        inserireMonete.join();
        prelevareMonete.join();

        System.out.println(Salvadanaio.monete);
    }
}
