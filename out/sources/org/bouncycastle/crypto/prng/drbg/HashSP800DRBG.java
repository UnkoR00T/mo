package org.bouncycastle.crypto.prng.drbg;

import java.util.Hashtable;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
public class HashSP800DRBG implements SP80090DRBG {
    private static final int MAX_BITS_REQUEST = 262144;
    private static final byte[] ONE = {1};
    private static final long RESEED_MAX = 140737488355328L;
    private static final Hashtable seedlens;
    private byte[] _C;
    private byte[] _V;
    private Digest _digest;
    private EntropySource _entropySource;
    private long _reseedCounter;
    private int _securityStrength;
    private int _seedLength;

    static {
        Hashtable hashtable = new Hashtable();
        seedlens = hashtable;
        hashtable.put("SHA-1", Integers.valueOf(440));
        hashtable.put("SHA-224", Integers.valueOf(440));
        hashtable.put(XMSSKeyParameters.SHA_256, Integers.valueOf(440));
        hashtable.put(SPHINCSKeyParameters.SHA512_256, Integers.valueOf(440));
        hashtable.put("SHA-512/224", Integers.valueOf(440));
        hashtable.put("SHA-384", Integers.valueOf(888));
        hashtable.put(XMSSKeyParameters.SHA_512, Integers.valueOf(888));
    }

    public HashSP800DRBG(Digest digest, int i15, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        if (i15 > Utils.getMaxSecurityStrength(digest)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (entropySource.entropySize() < i15) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this._digest = digest;
        this._entropySource = entropySource;
        this._securityStrength = i15;
        this._seedLength = ((Integer) seedlens.get(digest.getAlgorithmName())).intValue();
        byte[] bArrHash_df = Utils.hash_df(this._digest, Arrays.concatenate(getEntropy(), bArr2, bArr), this._seedLength);
        this._V = bArrHash_df;
        byte[] bArr3 = new byte[bArrHash_df.length + 1];
        System.arraycopy(bArrHash_df, 0, bArr3, 1, bArrHash_df.length);
        this._C = Utils.hash_df(this._digest, bArr3, this._seedLength);
        this._reseedCounter = 1L;
    }

    private void addTo(byte[] bArr, byte[] bArr2) {
        int i15 = 0;
        for (int i16 = 1; i16 <= bArr2.length; i16++) {
            int i17 = (bArr[bArr.length - i16] & 255) + (bArr2[bArr2.length - i16] & 255) + i15;
            i15 = i17 > 255 ? 1 : 0;
            bArr[bArr.length - i16] = (byte) i17;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i18 = (bArr[bArr.length - length] & 255) + i15;
            i15 = i18 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i18;
        }
    }

    private void doHash(byte[] bArr, byte[] bArr2) {
        this._digest.update(bArr, 0, bArr.length);
        this._digest.doFinal(bArr2, 0);
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private byte[] hash(byte[] bArr) {
        byte[] bArr2 = new byte[this._digest.getDigestSize()];
        doHash(bArr, bArr2);
        return bArr2;
    }

    private byte[] hashgen(byte[] bArr, int i15) {
        int i16 = i15 / 8;
        int digestSize = i16 / this._digest.getDigestSize();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i16];
        int digestSize2 = this._digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        for (int i17 = 0; i17 <= digestSize; i17++) {
            doHash(bArr2, bArr4);
            int i18 = i17 * digestSize2;
            int i19 = i16 - i18;
            if (i19 > digestSize2) {
                i19 = digestSize2;
            }
            System.arraycopy(bArr4, 0, bArr3, i18, i19);
            addTo(bArr2, ONE);
        }
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z15) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        }
        if (this._reseedCounter > RESEED_MAX) {
            return -1;
        }
        if (z15) {
            reseed(bArr2);
            bArr2 = null;
        }
        if (bArr2 != null) {
            byte[] bArr3 = this._V;
            byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
            bArr4[0] = 2;
            System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
            System.arraycopy(bArr2, 0, bArr4, this._V.length + 1, bArr2.length);
            addTo(this._V, hash(bArr4));
        }
        byte[] bArrHashgen = hashgen(this._V, length);
        byte[] bArr5 = this._V;
        byte[] bArr6 = new byte[bArr5.length + 1];
        System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
        bArr6[0] = 3;
        addTo(this._V, hash(bArr6));
        addTo(this._V, this._C);
        long j15 = this._reseedCounter;
        addTo(this._V, new byte[]{(byte) (j15 >> 24), (byte) (j15 >> 16), (byte) (j15 >> 8), (byte) j15});
        this._reseedCounter++;
        System.arraycopy(bArrHashgen, 0, bArr, 0, bArr.length);
        return length;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._digest.getDigestSize() * 8;
    }

    @Override // org.bouncycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        byte[] bArrHash_df = Utils.hash_df(this._digest, Arrays.concatenate(ONE, this._V, getEntropy(), bArr), this._seedLength);
        this._V = bArrHash_df;
        byte[] bArr2 = new byte[bArrHash_df.length + 1];
        bArr2[0] = 0;
        System.arraycopy(bArrHash_df, 0, bArr2, 1, bArrHash_df.length);
        this._C = Utils.hash_df(this._digest, bArr2, this._seedLength);
        this._reseedCounter = 1L;
    }
}
