public class CreditPaymentService {

    public float calculate(float amount, float persent, float period) {
        float payment = 0, monthBet = 0, coefficient = 0;

        monthBet = persent / 12 / 100;

        coefficient = (monthBet * (float) Math.pow((1 + monthBet), period)) / ((float) Math.pow ((1 + monthBet), period) - 1);

        payment = amount * coefficient;

        return payment;
    }
}
