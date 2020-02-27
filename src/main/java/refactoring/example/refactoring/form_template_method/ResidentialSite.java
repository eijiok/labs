package refactoring.example.refactoring.form_template_method;

public class ResidentialSite extends Site {
    private int units;
    private double rate;

    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * super.taxRate;
        return base + tax;
    }
}
