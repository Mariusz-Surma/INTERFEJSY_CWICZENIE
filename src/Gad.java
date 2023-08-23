public class Gad implements Zwierze{

    private String imie;
    private int wiek;

    public Gad(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public void lataj() {
        System.out.println(imie + " nie potrafi latac!");
    }

    @Override
    public void biegaj() {
        System.out.println(imie + " lat " + wiek + " wlasnie zaczal wolno biec!");
    }

    public void pelzaj(){
        System.out.println(imie + " lat " + wiek + " właśnie zaczal pelzac!");
    }

}
