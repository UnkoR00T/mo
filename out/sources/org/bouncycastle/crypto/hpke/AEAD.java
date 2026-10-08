package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class AEAD {
    private final short aeadId;
    private final byte[] baseNonce;
    private AEADCipher cipher;
    private final byte[] key;
    private long seq = 0;

    public AEAD(short s15, byte[] bArr, byte[] bArr2) {
        AEADCipher aEADCipherNewInstance;
        this.key = bArr;
        this.baseNonce = bArr2;
        this.aeadId = s15;
        if (s15 == 1 || s15 == 2) {
            aEADCipherNewInstance = GCMBlockCipher.newInstance(AESEngine.newInstance());
        } else if (s15 != 3) {
            return;
        } else {
            aEADCipherNewInstance = new ChaCha20Poly1305();
        }
        this.cipher = aEADCipherNewInstance;
    }

    private byte[] computeNonce() {
        long j15 = this.seq;
        this.seq = 1 + j15;
        byte[] bArrLongToBigEndian = Pack.longToBigEndian(j15);
        byte[] bArrClone = Arrays.clone(this.baseNonce);
        Bytes.xorTo(8, bArrLongToBigEndian, 0, bArrClone, bArrClone.length - 8);
        return bArrClone;
    }

    private byte[] process(boolean z15, byte[] bArr, byte[] bArr2, int i15, int i16) {
        short s15 = this.aeadId;
        if (s15 != 1 && s15 != 2 && s15 != 3) {
            throw new IllegalStateException("Export only mode, cannot be used to seal/open");
        }
        this.cipher.init(z15, new ParametersWithIV(new KeyParameter(this.key), computeNonce()));
        this.cipher.processAADBytes(bArr, 0, bArr.length);
        int outputSize = this.cipher.getOutputSize(i16);
        byte[] bArr3 = new byte[outputSize];
        int iProcessBytes = this.cipher.processBytes(bArr2, i15, i16, bArr3, 0);
        if (iProcessBytes + this.cipher.doFinal(bArr3, iProcessBytes) == outputSize) {
            return bArr3;
        }
        throw new IllegalStateException();
    }

    public byte[] open(byte[] bArr, byte[] bArr2) {
        return process(false, bArr, bArr2, 0, bArr2.length);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2) {
        return process(true, bArr, bArr2, 0, bArr2.length);
    }

    public byte[] open(byte[] bArr, byte[] bArr2, int i15, int i16) {
        Arrays.validateSegment(bArr2, i15, i16);
        return process(false, bArr, bArr2, i15, i16);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2, int i15, int i16) {
        Arrays.validateSegment(bArr2, i15, i16);
        return process(true, bArr, bArr2, i15, i16);
    }
}
