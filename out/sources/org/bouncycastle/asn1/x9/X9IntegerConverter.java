package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: loaded from: classes5.dex */
public class X9IntegerConverter {
    public int getByteLength(ECCurve eCCurve) {
        return eCCurve.getFieldElementEncodingLength();
    }

    public byte[] integerToBytes(BigInteger bigInteger, int i15) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i15 < byteArray.length) {
            byte[] bArr = new byte[i15];
            System.arraycopy(byteArray, byteArray.length - i15, bArr, 0, i15);
            return bArr;
        }
        if (i15 <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i15];
        System.arraycopy(byteArray, 0, bArr2, i15 - byteArray.length, byteArray.length);
        return bArr2;
    }

    public int getByteLength(ECFieldElement eCFieldElement) {
        return eCFieldElement.getEncodedLength();
    }
}
