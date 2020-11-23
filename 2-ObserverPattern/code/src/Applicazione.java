public class Applicazione implements TipologiaNotifica {
    public Applicazione() {
    }

    public void notifica(String articolo) {
        System.out.println("Notifica tramite applicazione del seguente articolo:");
        System.out.println(articolo);
    }
}