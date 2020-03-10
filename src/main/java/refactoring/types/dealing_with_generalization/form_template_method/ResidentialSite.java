package refactoring.types.dealing_with_generalization.form_template_method;

public class ResidentialSite extends Site {
    private double units;
    private double rate;

    public double getBillableAmount() {
        double base = this.units + this.rate;
        double tax = base * super.taxRate;
        return base * tax;
    }

}
