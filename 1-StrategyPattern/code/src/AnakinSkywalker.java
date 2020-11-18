public class AnakinSkywalker extends Personaggio {
    private String nome;

    public AnakinSkywalker() {
        nome = "Anakin Skywalker";
        setAttacco(new SpadaLaser());
        setDifesa(new ScudoVibranio());
    }

    public void visualizza() {
        System.out.println(nome);
    }
}