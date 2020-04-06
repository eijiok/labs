package refactoring.types.dealing_with_generalization.form_template_method;

public class LifeLineSite extends Site {
    private double units;
    private double rate;

    protected double getTax(double base) {
        return base * super.taxRate * 0.2;
    }

    protected double getBase() {
        return this.units + this.rate * 0.5;
    }
}
