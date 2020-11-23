import java.util.ArrayList;

public class Utente implements Lettore {
    private String username;
    private String articolo;

    private ArrayList<TipologiaNotifica> notifiche;

    public Utente(String username) {
        this.username = username;
        notifiche = new ArrayList<TipologiaNotifica>();
    }

    public void aggiungiBlogger(Editore editore) {
        editore.registraUtente(this);
    }

    public void eliminaBlogger(Editore editore) {
        editore.eliminaUtente(this);
    }

    public void aggiorna(String articolo) {
        this.articolo = articolo;
        notificaUtente();
    }

    public void aggiungiNotifica(TipologiaNotifica notifica) {
        notifiche.add(notifica);
    }

    public void notificaUtente() {
        for (TipologiaNotifica notifica : notifiche) {
            System.out.println();
            System.out.println("Notifico l'utente " + username);
            notifica.notifica(articolo);
        }
    }
}