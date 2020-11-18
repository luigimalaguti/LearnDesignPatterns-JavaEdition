public class Rubber extends Personaggio {
    private String nome;

    public Rubber() {
        nome = "Rubber";
        setAttacco(new PugnoAllungabile());
        setDifesa(new Ragnatele());
    }

    public void visualizza() {
        System.out.println(nome);
    }
}