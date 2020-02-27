package refactoring.example.refactoring.form_template_method;

public class LifelineSite extends Site {
    private int units;
    private double rate;

    public double getBillableAmount() {
        double base = units * rate * 0.5;
        double tax = base * super.taxRate * 0.2;
        return base + tax;
    }
}
