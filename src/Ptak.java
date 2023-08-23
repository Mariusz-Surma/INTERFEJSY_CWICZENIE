public class Ptak implements Zwierze{

        private String imie;
        private int wiek;

        public Ptak(String imie, int wiek){
            this.imie = imie;
            this.wiek = wiek;
        }

        public void lataj(){
            System.out.println(imie + " lat " + wiek + " lata!");
        }

    @Override
    public void biegaj() {
        System.out.println("Ptak " + imie + " " + "nie potrafi biegac");
    }

    @Override
    public void pelzaj() {
        System.out.println("Ptak " + imie + " nie potrafi pelzac");
    }

}
