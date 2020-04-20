package ZJOffer;

/**
 * @author zack
 * @create 2020-01-27-17:16
 */
public class Power {

    public double Power(double base, int exponent) {
        double result = 1;
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent > 0) {
            while (exponent > 0) {

                result *= base;
                exponent--;

            }
            return result;
        }
        if (exponent < 0) {
            exponent = 0 - exponent;
            while (exponent > 0) {
                result *= base;
                exponent--;

            }
            return (1 / result);
        }
return result;
    }
}
