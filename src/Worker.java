import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Worker extends Person implements AbleToCalculatePension{

    private double minSalary;
    private double maxSalary;
    private final int CHILD_ALLOWANCE = 200;

    public Worker(String name, int age, int height, int weight, List<String> child, double minSalary, double maxSalary) {
        super(name, age, height, weight, child);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    @Override
    public void die(int retirementAge) {
        System.out.println(getName() + " didn't live up to pension");
    }

    @Override
    public double calculatePension(int startUpAge, int retirementAge) {

        String nameOFPensionFond = "The pension fund has a registered: " + getName();

        int experience;;

        if (getAge() > startUpAge && getAge() < retirementAge) {
            experience = getAge() - startUpAge;
        } else if (getAge() >= retirementAge){
            experience = retirementAge - startUpAge;
        } else {
            experience = 0;
        }

        SuperannuationFund fund = new SuperannuationFund(nameOFPensionFond, TypeOfFund.generateRandom(), DateGeneration.generateOfDate(getAge()));
        minSalary += 200 * getChild().size();
        return fund.pensionCalculation(experience, minSalary, maxSalary);
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.minSalary, minSalary) == 0 && Double.compare(worker.maxSalary, maxSalary) == 0 && CHILD_ALLOWANCE == worker.CHILD_ALLOWANCE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary, CHILD_ALLOWANCE);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", CHILD_ALLOWANCE=" + CHILD_ALLOWANCE +
                '}';
    }
}

