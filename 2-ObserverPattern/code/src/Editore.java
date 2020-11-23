public interface Editore {
    void registraUtente(Lettore osservatore);
    void eliminaUtente(Lettore osservatore);
    void aggiornaUtenti(String articolo);
}