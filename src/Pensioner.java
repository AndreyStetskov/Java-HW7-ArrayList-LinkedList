public class Pensioner extends Person {

    private double pension;


    public Pensioner(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }


    @Override
    public void die() {
        double x = (getAge() - 50) * pension;
        System.out.println(getName() + " died who earned €" + x);
    }


    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}