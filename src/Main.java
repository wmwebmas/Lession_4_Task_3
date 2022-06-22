public class Main {

    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        int pay1 = (int) payment.calculate(1_000_000, 9.99f, 12);
        System.out.println("Ежемесячный платёж при оформлении кредита на 1 год составит  " + pay1 + " рублей");

        System.out.println();

        int pay2 = (int) payment.calculate(1_000_000, 9.99f, 24);
        System.out.println("Ежемесячный платёж при оформлении кредита на 2 года составит  " + pay2 + " рублей");

        System.out.println();

        int pay3 = (int) payment.calculate(1_000_000, 9.99f, 36);
        System.out.println("Ежемесячный платёж при оформлении кредита на 3 года составит  " + pay3 + " рублей");
    }
}
