package org.example;

public class Ev {
    private String adres;
    private int odaSayisi;
    private int banyoSayisi;
    private int katSayisi;
    private boolean bahçeVarMi;
  


    public String getAdres() {
        returnadres;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public int getBanyoSayisi(){
        return banyoSayisi;
    }
    public int getKatSayisi(){
        return katSayisi;
    }
   public boolean isBahceVarMi(){
        return bahceVarMi;
     }
    public static class EvBuilder {
        private final Ev ev;

        public EvBuilder() {
            ev = new Ev();
        }

        public EvBuilder setAdres(String adres) {
            ev.adres = adres;
            return this;
        }

        public EvBuilder setOdaSayisi(int odaSayisi) {
            ev.odaSayisi = odaSayisi;
            return this;
        }

        public EvBuilder setBanyoSayisi(int banyoSayisi){
            ev.banyoSayisi=banyoSayisi;
            return this;
        }

        public EvBuilder setKatSayisi(int katSayisi){
            ev.katSayisi=katSayisi;
            return this;
        }
        public EvBuilder setBahceVarMi(boolean bahceVarMi){
            ev.bahceVarMi=bahceVarMi;
            return this;
        }
       
        public Ev build() {
            return ev;
        }
    }

    }
