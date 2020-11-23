public class Gioco {
    public static void main(String[] args) {
        Rubber rubber = new Rubber();
        AnakinSkywalker anakin = new AnakinSkywalker();

        System.out.println("Guerra tra:");
        rubber.visualizza();
        System.out.println("VS");
        anakin.visualizza();
        System.out.println();

        anakin.visualizza();
        anakin.usaAttacco();

        rubber.visualizza();
        rubber.usaDifesa();
        rubber.movimento();
        rubber.usaAttacco();

        anakin.visualizza();
        anakin.setAttacco(new OndaEnergetica());
        anakin.usaAttacco();
    }
}