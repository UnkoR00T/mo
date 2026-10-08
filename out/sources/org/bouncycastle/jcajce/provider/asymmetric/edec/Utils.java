package org.bouncycastle.jcajce.provider.asymmetric.edec;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    Utils() {
    }

    private static String generateKeyFingerprint(byte[] bArr) {
        return new Fingerprint(bArr).toString();
    }

    static boolean isValidPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !isValidPrefix(bArr, bArr);
        }
        int i15 = 0;
        for (int i16 = 0; i16 != bArr.length; i16++) {
            i15 |= bArr[i16] ^ bArr2[i16];
        }
        return i15 == 0;
    }

    static String keyToString(String str, String str2, AsymmetricKeyParameter asymmetricKeyParameter) {
        byte[] encoded;
        StringBuilder sb5 = new StringBuilder();
        String strLineSeparator = Strings.lineSeparator();
        if (asymmetricKeyParameter instanceof X448PublicKeyParameters) {
            encoded = ((X448PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        } else if (asymmetricKeyParameter instanceof Ed448PublicKeyParameters) {
            encoded = ((Ed448PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        } else {
            encoded = asymmetricKeyParameter instanceof X25519PublicKeyParameters ? ((X25519PublicKeyParameters) asymmetricKeyParameter).getEncoded() : ((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        }
        sb5.append(str2);
        sb5.append(" ");
        sb5.append(str);
        sb5.append(" [");
        sb5.append(generateKeyFingerprint(encoded));
        sb5.append("]");
        sb5.append(strLineSeparator);
        sb5.append("    public data: ");
        sb5.append(Hex.toHexString(encoded));
        sb5.append(strLineSeparator);
        return sb5.toString();
    }
}
