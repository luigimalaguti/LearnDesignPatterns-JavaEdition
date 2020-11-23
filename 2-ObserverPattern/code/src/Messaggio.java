public class Messaggio implements TipologiaNotifica {
    public Messaggio() {
    }

    public void notifica(String articolo) {
        System.out.println("Notifica tramite messaggio del seguente articolo:");
        System.out.println(articolo);
    }
}