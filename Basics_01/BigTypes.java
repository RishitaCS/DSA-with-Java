package Basics_01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTypes {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("6547265936893625739165796325");
        BigInteger b2 = new BigInteger("654726593689362573916579632511263765312451645164");
        BigInteger b3 = b.add(b2);
        System.out.println(b3);
        BigDecimal b4 = new BigDecimal("27658365863876.6234");
    }
}
