package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
class GOSTUtil {
    GOSTUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString();
    }

    static String privateKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb5 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = gOST3410Parameters.getA().modPow(bigInteger, gOST3410Parameters.getP());
        sb5.append(str);
        sb5.append(" Private Key [");
        sb5.append(generateKeyFingerprint(bigIntegerModPow, gOST3410Parameters));
        sb5.append("]");
        sb5.append(strLineSeparator);
        sb5.append("                  Y: ");
        sb5.append(bigIntegerModPow.toString(16));
        sb5.append(strLineSeparator);
        return sb5.toString();
    }

    static String publicKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuilder sb5 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        sb5.append(str);
        sb5.append(" Public Key [");
        sb5.append(generateKeyFingerprint(bigInteger, gOST3410Parameters));
        sb5.append("]");
        sb5.append(strLineSeparator);
        sb5.append("                 Y: ");
        sb5.append(bigInteger.toString(16));
        sb5.append(strLineSeparator);
        return sb5.toString();
    }
}
