package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
class DHUtil {
    DHUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, DHParameters dHParameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString();
    }

    static String privateKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb5 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        BigInteger bigIntegerModPow = dHParameters.getG().modPow(bigInteger, dHParameters.getP());
        sb5.append(str);
        sb5.append(" Private Key [");
        sb5.append(generateKeyFingerprint(bigIntegerModPow, dHParameters));
        sb5.append("]");
        sb5.append(strLineSeparator);
        sb5.append("              Y: ");
        sb5.append(bigIntegerModPow.toString(16));
        sb5.append(strLineSeparator);
        return sb5.toString();
    }

    static String publicKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuilder sb5 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        sb5.append(str);
        sb5.append(" Public Key [");
        sb5.append(generateKeyFingerprint(bigInteger, dHParameters));
        sb5.append("]");
        sb5.append(strLineSeparator);
        sb5.append("             Y: ");
        sb5.append(bigInteger.toString(16));
        sb5.append(strLineSeparator);
        return sb5.toString();
    }
}
