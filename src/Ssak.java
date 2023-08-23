public class Ssak implements Zwierze{

        private String imie;
        private int wiek;

        public Ssak(String imie, int wiek){
            this.imie = imie;
            this.wiek = wiek;
        }

    @Override
    public void lataj() {
        System.out.println(imie + " nie potrafi latac!");
    }

    public void biegaj(){
            System.out.println(imie + " lat " + wiek + " wlasnie zaczal biegac");
        }

    @Override
    public void pelzaj() {
        System.out.println(imie + " nie potrafi pelzac!");
    }


}
