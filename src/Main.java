import java.util.List;

public class Main {
    public static void main(String[] args) {


        Worker firstPerson = new Worker("Sam", 65, 198, 118, List.of("William", "Ava", "Olivia"), 748.89, 355.77);
        double firstPersonsPension = firstPerson.calculatePension(19, 65);
        System.out.println(firstPersonsPension);

        Worker secondPerson = new Worker("Anna", 41, 168, 75, List.of("Liam", "Emma", "Charlotte", "James"), 1184.11, 9514.78);
        double secondPersonsPension = secondPerson.calculatePension(18, 60);
        System.out.println(secondPersonsPension);

        Worker thirdPerson = new Worker("Bill", 11, 139, 31, List.of(), 0, 0);
        double thirdPersonsPension = thirdPerson.calculatePension(18, 65);
        System.out.println(thirdPersonsPension);

        Worker fourthPerson = new Worker("Jessica", 25, 165, 52, List.of("Benjamin", "Evelyn"), 4556.99, 5500);
        double fourthPersonsPension = fourthPerson.calculatePension(18, 60);
        System.out.println(fourthPersonsPension);

        Worker fifthPerson = new Worker("Jenifer", 0, 49, 4, List.of(), 0, 0);
        double fifthPersonsPension = fifthPerson.calculatePension(18, 60);
        System.out.println(fifthPersonsPension);

        Worker sixthPerson = new Worker("Alisa", 49, 158, 51, List.of("Noah", "Mia"), 897.11, 7538.03);
        double sixthPersonsPension = sixthPerson.calculatePension(16, 60);
        System.out.println(sixthPersonsPension);

        Pensioner seventhPerson = new Pensioner("Bruce", 71, 187, 71, List.of("John", "Arnold", "Jason"), 1965.75);
//        seventhPerson.setMinSalary(1965.75);
//        seventhPerson.setMaxSalary(6784.88);
//        double seventhPersonsPension = seventhPerson.calculatePension();
//        System.out.println(seventhPersonsPension);
        seventhPerson.die(65);

        Worker eighthPerson = new Worker("Sarah", 19, 171, 61, List.of(), 2358.07, 3154.44);
        double eighthPersonsPension = eighthPerson.calculatePension(17, 60);
        System.out.println(eighthPersonsPension);

        Pensioner ninthPerson = new Pensioner("Laura", 57, 172, 61, List.of("Elijah", "Ellen", "Elliott"), 5481.24);
//        ninthPerson.setMinSalary(5481.24);
//        ninthPerson.setMaxSalary(35110);
//        double ninthPersonsPension = ninthPerson.calculatePension();
//        System.out.println(ninthPersonsPension);
        ninthPerson.die(43);

        Pensioner tenthPerson = new Pensioner("Monica", 25, 175, 89, List.of("Amelia", "Jonatan", "Sabrina"),7780.87);
//        tenthPerson.setMinSalary(7780.87);
//        tenthPerson.setMaxSalary(8584.88);
//        double tenthPersonsPension = tenthPerson.calculatePension();
//        System.out.println(tenthPersonsPension);
        tenthPerson.die(23);

    }
}