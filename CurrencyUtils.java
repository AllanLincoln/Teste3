import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtils {


    public static String toBrazilianCurrency(BigDecimal amount) {

        BigDecimal displayVal = amount.setScale(2, RoundingMode.HALF_EVEN);
        Locale brazil = Locale.of("pt","BR");
        NumberFormat brazilFormat = NumberFormat.getCurrencyInstance(brazil);
        brazilFormat.setMinimumFractionDigits(2);
        brazilFormat.setMaximumFractionDigits(2);
        return brazilFormat.format(displayVal.doubleValue());

    }

}