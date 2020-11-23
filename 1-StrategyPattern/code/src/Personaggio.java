public abstract class Personaggio {
    protected TipologiaAttacco tipologiaAttacco;
    protected TipologiaDifesa tipologiaDifesa;

    public abstract void visualizza();
    
    public void movimento() {
        System.out.println("Mi sto muovendo!");
    }
    public void usaAttacco() {
        tipologiaAttacco.attacco();
    }
    public void setAttacco(TipologiaAttacco tipologiaAttacco) {
        this.tipologiaAttacco = tipologiaAttacco;
    }
    public void usaDifesa() {
        tipologiaDifesa.difesa();
    }
    public void setDifesa(TipologiaDifesa tipologiaDifesa) {
        this.tipologiaDifesa = tipologiaDifesa;
    }
}