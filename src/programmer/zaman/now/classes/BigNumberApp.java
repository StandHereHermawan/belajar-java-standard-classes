package programmer.zaman.now.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("1000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000");

        BigInteger c = a.add(b);

        System.out.println(c);

        BigDecimal aDec = new BigDecimal("1000000000000000000.12345");
        BigDecimal bDec = new BigDecimal("1900000000000000000.12395");

        BigDecimal cDec = aDec.add(bDec);

        System.out.println(cDec);

    }
}
