package refactoring.types.dealing_with_generalization.form_template_method;

public class LifeLineSite extends Site {
    private double units;
    private double rate;

    public double getBillableAmount() {
        double base = this.units + this.rate * 0.5;
        double tax = base * super.taxRate * 0.2;
        return base * tax;
    }
}
