public class Main {
    public static void main(String[] args) {
      Ev ev = new Ev.EvBuilder()
        .setAdres("Ata Mahallesi no:10")
        .setOdaSayisi(4)
        .setBanyoSayisi(2)
        .setKatSayisi(10)
        .setBahceVarMi(false)
        .build();
  
    System.out.println("Ev Özellikleri:");
        System.out.println("Adres: " + ev.getAdres());
        System.out.println("Oda Sayisi: " + ev.getOdaSayisi());
        System.out.println("Banyo Sayisi: " + ev.getBanyoSayisi());
        System.out.println("Kat Sayisi: " + ev.getKatSayisi());
        System.out.println("Bahce Var Mi?: " + (ev.isBahceVarmi() ? "Evet" : "Hayır"));
    }
}
