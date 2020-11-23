public class Email implements TipologiaNotifica {
    public Email() {
    }

    public void notifica(String articolo) {
        System.out.println("Notifica tramite email del seguente articolo:");
        System.out.println(articolo);
    }
}