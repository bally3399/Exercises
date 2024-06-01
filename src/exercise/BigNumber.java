package exercise;

import java.util.*;
import java.math.BigInteger;

public class BigNumber {

    public String add(String number, String add) {
        BigInteger bigNum1 = new BigInteger(number);
        BigInteger bigNum2 = new BigInteger(add);
        BigInteger sum = bigNum1.add(bigNum2);
        return sum.toString();
    }

    public String multiply(String number, String add) {
        BigInteger bigNum1 = new BigInteger(number);
        BigInteger bigNum2 = new BigInteger(add);
        BigInteger multiply = bigNum1.multiply(bigNum2);
        return multiply.toString();
    }
}
