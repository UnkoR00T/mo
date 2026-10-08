package vn;

import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static boolean a(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a15 = curve.getA();
        BigInteger b15 = curve.getB();
        BigInteger p15 = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p15).equals(bigInteger.pow(3).add(a15.multiply(bigInteger)).add(b15).mod(p15));
    }
}
