package refactoring.types.dealing_with_generalization.form_template_method;

public class ResidentialSite extends Site {
    private double units;
    private double rate;

    @Override
    protected double getTax(double base) {
        return base * super.taxRate;
    }

    @Override
    protected double getBase() {
        return this.units + this.rate;
    }

}
