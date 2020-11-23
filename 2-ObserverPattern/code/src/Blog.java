public class Blog {
    public static void main(String[] args) {
        Blogger techCrunch = new Blogger();
        Blogger wired = new Blogger();

        Utente antonio = new Utente("Antonio");
        Utente giuseppe = new Utente("Giuseppe");
        Utente viola = new Utente("Viola");
        Utente leonardo = new Utente("Leonardo");
        Utente gioia = new Utente("Gioia");

        antonio.aggiungiBlogger(techCrunch);
        giuseppe.aggiungiBlogger(techCrunch);
        viola.aggiungiBlogger(techCrunch);
        viola.aggiungiBlogger(wired);
        leonardo.aggiungiBlogger(wired);
        gioia.aggiungiBlogger(wired);

        antonio.aggiungiNotifica(new Email());
        antonio.aggiungiNotifica(new Messaggio());
        viola.aggiungiNotifica(new Applicazione());
        leonardo.aggiungiNotifica(new Applicazione());
        leonardo.aggiungiNotifica(new Email());
        leonardo.aggiungiNotifica(new Messaggio());

        String articoloTechCrunch = "Articolo TechCrunch";
        String articoloWired = "Articolo Wired";

        techCrunch.aggiornaUtenti(articoloTechCrunch);
        wired.aggiornaUtenti(articoloWired);
    }
}