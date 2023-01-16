import java.util.Objects;

public class SuperannuationFund {

    private final double COEFFICIENT = 0.02;

    private int AVERAGE = 1500;

    private String name;
    private State national;
    private String dateCreated;

    public SuperannuationFund(String name, State national, String dateCreated) {
        this.name = name;
        this.national = national;
        this.dateCreated = dateCreated;
    }


    public double pensionCalculation (int timeWorked, double minWage, double maxWage) {
        double pension = 0;
        switch (national) {
            case NATIONAL:
                pension = HalfValueUtils.average(minWage, maxWage);
                break;
            case NON_NATIONAL:
                pension = HalfValueUtils.average(minWage, maxWage, AVERAGE);
                break;
            default:
                pension = 0;
        }
        return pension * COEFFICIENT * timeWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getNational() {
        return national;
    }

    public void setNational(State national) {
        this.national = national;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperannuationFund that = (SuperannuationFund) o;
        return Double.compare(that.COEFFICIENT, COEFFICIENT) == 0 && AVERAGE == that.AVERAGE && Objects.equals(name, that.name) && national == that.national && Objects.equals(dateCreated, that.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(COEFFICIENT, AVERAGE, name, national, dateCreated);
    }

    @Override
    public String toString() {
        return "SuperannuationFund{" +
                "COEFFICIENT=" + COEFFICIENT +
                ", AVERAGE=" + AVERAGE +
                ", name='" + name + '\'' +
                ", national=" + national +
                ", dateCreated='" + dateCreated + '\'' +
                '}';
    }
}

