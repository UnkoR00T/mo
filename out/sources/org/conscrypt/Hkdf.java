package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public final class Hkdf {
    private final String hmacName;
    private final int macLength;

    public Hkdf(String str) {
        Objects.requireNonNull(str);
        this.hmacName = str;
        this.macLength = Mac.getInstance(str).getMacLength();
    }

    private Mac getMac(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance(this.hmacName);
        mac.init(new SecretKeySpec(bArr, "RAW"));
        return mac;
    }

    public byte[] expand(byte[] bArr, byte[] bArr2, int i15) throws NoSuchAlgorithmException, InvalidKeyException {
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        Preconditions.checkArgument(i15 >= 0, "Negative length");
        Preconditions.checkArgument(i15 <= getMacLength() * GF2Field.MASK, "Length too long");
        Mac mac = getMac(bArr);
        int macLength = getMacLength();
        byte[] bArrDoFinal = new byte[0];
        byte[] bArr3 = new byte[i15];
        byte[] bArr4 = {0};
        int i16 = 0;
        while (i16 < i15) {
            bArr4[0] = (byte) (bArr4[0] + 1);
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            bArrDoFinal = mac.doFinal(bArr4);
            int iMin = Math.min(macLength, i15 - i16);
            System.arraycopy(bArrDoFinal, 0, bArr3, i16, iMin);
            i16 += iMin;
        }
        return bArr3;
    }

    public byte[] extract(byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        Preconditions.checkArgument(bArr2.length > 0, "Empty keying material");
        if (bArr.length == 0) {
            bArr = new byte[getMacLength()];
        }
        return getMac(bArr).doFinal(bArr2);
    }

    public int getMacLength() {
        return this.macLength;
    }
}
