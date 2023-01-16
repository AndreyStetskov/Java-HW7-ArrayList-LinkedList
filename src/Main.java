public class Main {
    public static void main(String[] args) {


        Worker firstPerson = new Worker("Sam", 65, 198, 118);
        firstPerson.setMinSalary(748.89);
        firstPerson.setMaxSalary(3525.77);
        double firstPersonsPension = firstPerson.calculatePension();
        System.out.println(firstPersonsPension);

        Worker secondPerson = new Worker("Anna", 41, 168, 75);
        secondPerson.setMinSalary(1184.11);
        secondPerson.setMaxSalary(9514.78);
        double secondPersonsPension = secondPerson.calculatePension();
        System.out.println(secondPersonsPension);

        Worker thirdPerson = new Worker("Bill", 11, 139, 31);
        thirdPerson.setMinSalary(0);
        thirdPerson.setMaxSalary(0);
        double thirdPersonsPension = thirdPerson.calculatePension();
        System.out.println(thirdPersonsPension);

        Worker fourthPerson = new Worker("Jessica", 25, 165, 52);
        fourthPerson.setMinSalary(4556.99);
        fourthPerson.setMaxSalary(5500);
        double fourthPersonsPension = fourthPerson.calculatePension();
        System.out.println(fourthPersonsPension);

        Worker fifthPerson = new Worker("Jenifer", 0, 49, 4);
        fifthPerson.setMinSalary(0);
        fifthPerson.setMaxSalary(0);
        double fifthPersonsPension = fifthPerson.calculatePension();
        System.out.println(fifthPersonsPension);

        Worker sixthPerson = new Worker("Alisa", 49, 158, 51);
        sixthPerson.setMinSalary(897.11);
        sixthPerson.setMaxSalary(7538.03);
        double sixthPersonsPension = sixthPerson.calculatePension();
        System.out.println(sixthPersonsPension);

        Worker seventhPerson = new Worker("Bruce", 71, 187, 71);
        seventhPerson.setMinSalary(1965.75);
        seventhPerson.setMaxSalary(6784.88);
        double seventhPersonsPension = seventhPerson.calculatePension();
        System.out.println(seventhPersonsPension);

        Worker eighthPerson = new Worker("Sarah", 19, 171, 61);
        eighthPerson.setMinSalary(2358.07);
        eighthPerson.setMaxSalary(3154.44);
        double eighthPersonsPension = eighthPerson.calculatePension();
        System.out.println(eighthPersonsPension);

        Worker ninthPerson = new Worker("Laura", 57, 172, 61);
        ninthPerson.setMinSalary(5481.24);
        ninthPerson.setMaxSalary(35110);
        double ninthPersonsPension = ninthPerson.calculatePension();
        System.out.println(ninthPersonsPension);

        Worker tenthPerson = new Worker("Monica", 25, 175, 89);
        tenthPerson.setMinSalary(7780.87);
        tenthPerson.setMaxSalary(8584.88);
        double tenthPersonsPension = tenthPerson.calculatePension();
        System.out.println(tenthPersonsPension);

    }
}