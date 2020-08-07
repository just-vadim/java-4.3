public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSumInRoubles = 1000000;
        int creditTermInMonths = 36;
        double interestRate = 9.99;
        double monthlyPay = service.calculate(creditSumInRoubles, creditTermInMonths, interestRate);
        System.out.printf("Сумма кредита: %s ₽%n",creditSumInRoubles);
        if (creditTermInMonths == 12){
            System.out.printf("Срок кредита: %s%n", "1 год" );
        }
        if (creditTermInMonths == 24){
            System.out.printf("Срок кредита: %s%n", "2 годa" );
        }
        if (creditTermInMonths == 36) {
            System.out.printf("Срок кредита: %s%n", "3 годa" );
        }
        System.out.printf("Процентная ставка: %.2f %%%n", interestRate);
        System.out.printf("Ежемесячный платёж: %.0f ₽", monthlyPay);
    }
}