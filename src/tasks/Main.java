package tasks;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Mydlo", "asd", "asd");
        Product product1 = new Product("Mydlo", "asd", "asd");
        Product product2 = new Product("Mydlo", "asd", "asd");

        Guarantee guarantee = new Guarantee(product, LocalDate.of(2017, 5, 20));
        Guarantee guarantee2 = new Guarantee(product1, LocalDate.of(2017, 12, 15));
        Guarantee guarantee3 = new Guarantee(product2, LocalDate.of(2017, 11, 20));

        System.out.println(guarantee.isValid());
        System.out.println(guarantee2.isValid());
        System.out.println(guarantee3.isValid());
    }
}
