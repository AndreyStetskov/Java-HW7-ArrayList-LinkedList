import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pensioner extends Person {

    private double pension;


    public Pensioner(String name, int age, int height, int weight, List<String> child, double pension) {
        super(name, age, height, weight, child);
        this.pension = pension;
    }

    @Override
    public void die(int retirementAge) {
        double earned = (getAge() - retirementAge) * pension;
        switch (getChild().size()) {
            case 0 -> System.out.println(getName() + " died who earned €" + earned + ". And " + getName() + " doesn't have children");
            case 1 -> System.out.println(getName() + " died who earned €" + earned + ". But " + getName() + " has child");
            default -> System.out.println(getName() + " died who earned €" + earned + ". But " + getName() + " has " + getChild().size() + " children");
        }
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pensioner pensioner = (Pensioner) o;
        return Double.compare(pensioner.pension, pension) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pension);
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
}