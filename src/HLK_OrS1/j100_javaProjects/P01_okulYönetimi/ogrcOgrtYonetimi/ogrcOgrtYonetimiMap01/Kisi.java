package HLK_OrS1.j100_javaProjects.P01_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap01;

public class Kisi {

    private String adSoyad ="";
    private String yas ="";

    public Kisi() {
    }

    public Kisi(String adSoyad, String yas) {
        this.adSoyad = adSoyad;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", yas='" + yas + '\'' +
                '}';
    }
}
