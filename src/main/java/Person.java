public class Person {

    private double hojde;

    public Person(double hojde) {
        this.hojde = hojde;

    }

    // Konstruktør uden parameter (default constructor)
    public Person() {
    }

    // Get: med return, uden param i (), med variabel
    public double getHojde() {
        return hojde;
    }

    // Set; uden return, med parameter i (), void
    public void setHojde(double hojde) {
        this.hojde = hojde;
    }

}
