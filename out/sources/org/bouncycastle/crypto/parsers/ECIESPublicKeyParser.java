package org.bouncycastle.crypto.parsers;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public class ECIESPublicKeyParser implements KeyParser {
    private ECDomainParameters ecParams;

    public ECIESPublicKeyParser(ECDomainParameters eCDomainParameters) {
        this.ecParams = eCDomainParameters;
    }

    @Override // org.bouncycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        boolean z15;
        int i15 = inputStream.read();
        if (i15 < 0) {
            throw new EOFException();
        }
        if (i15 == 0) {
            throw new IOException("Sender's public key invalid.");
        }
        if (i15 == 2 || i15 == 3) {
            z15 = true;
        } else {
            if (i15 != 4 && i15 != 6 && i15 != 7) {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(i15, 16));
            }
            z15 = false;
        }
        ECCurve curve = this.ecParams.getCurve();
        int affinePointEncodingLength = curve.getAffinePointEncodingLength(z15);
        byte[] bArr = new byte[affinePointEncodingLength];
        bArr[0] = (byte) i15;
        int i16 = affinePointEncodingLength - 1;
        if (Streams.readFully(inputStream, bArr, 1, i16) == i16) {
            return new ECPublicKeyParameters(curve.decodePoint(bArr), this.ecParams);
        }
        throw new EOFException();
    }
}
