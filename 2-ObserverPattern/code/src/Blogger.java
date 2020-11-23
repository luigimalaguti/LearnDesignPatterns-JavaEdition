import java.util.ArrayList;

public class Blogger implements Editore {
    private ArrayList<Lettore> lettori;
    
    public Blogger() {
        lettori = new ArrayList<Lettore>();
    }

    public void pubblica(String articolo) {
        aggiornaUtenti(articolo);
    }

    public void registraUtente(Lettore lettore) {
        lettori.add(lettore);
    }

    public void eliminaUtente(Lettore lettore) {
        if (!lettori.contains(lettore))
            lettori.add(lettore);
    }

    public void aggiornaUtenti(String articolo) {
        for (Lettore lettore : lettori)
            lettore.aggiorna(articolo);
    }
}