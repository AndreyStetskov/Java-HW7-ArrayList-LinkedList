import java.util.Objects;
import java.util.Random;

public class Worker extends Person implements AbleToCalculatePension{

    private double minSalary;
    private double maxSalary;

    public Worker(String name, int age, int height, int weight) {
        super(name, age,height, weight);
    }


    @Override
    public void die() {
        System.out.println(getName() + " didn't live up to pension");
    }

    @Override
    public double calculatePension() {
        Random random = new Random();

        String nameOFPensionFond = "This pension fund for " + this.getName();

        int currentYear = 2023;
        int year = this.getAge();

        if (getAge() > 18) {
            year = currentYear - getAge();
        } else {
            year = 0;
        }

        int date;
        int month = random.nextInt(12) + 1;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            date = random.nextInt(30) + 1;
        } else if (month == 2 && year % 4 == 0 && year != 100 || year % 400 == 0) {
            date = random.nextInt(29) + 1;
        } else if (month == 2 && year % 4 != 0) {
            date = random.nextInt(28) + 1;
        } else {
            date = random.nextInt(31) + 1;
        }

        String createdDate = String.valueOf(date) + "." + String.valueOf(month) + "." + String.valueOf(year);

        SuperannuationFund fund = new SuperannuationFund(nameOFPensionFond, State.generateRandom(), createdDate);
        return fund.pensionCalculation(year, getMinSalary(), getMaxSalary());
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
        return Double.compare(worker.minSalary, minSalary) == 0 && Double.compare(worker.maxSalary, maxSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary);
    }

    @Override
    public String
    toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}

