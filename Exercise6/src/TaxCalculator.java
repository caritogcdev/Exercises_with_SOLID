public class TaxCalculator implements TaxStrategy{
    private String country;

    public TaxCalculator(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public double calculateTax(String country) {
        return 0;
    }
}
