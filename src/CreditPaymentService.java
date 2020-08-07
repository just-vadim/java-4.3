public class CreditPaymentService {
    public double calculate(int creditSum, int creditTerm, double interestRate){
        double monthlyRate = interestRate / 100 / 12;
        double monthlyPay = creditSum * ((monthlyRate * Math.pow((1 + monthlyRate), creditTerm)) / (Math.pow((1 + monthlyRate), creditTerm) - 1));
        return monthlyPay;
    }
}