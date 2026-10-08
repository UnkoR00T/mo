package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
public class HC128Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149037iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f149038p = new int[512];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f149039q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i15, int i16) {
        return mod512(i15 - i16);
    }

    private static int f1(int i15) {
        return (i15 >>> 3) ^ (rotateRight(i15, 7) ^ rotateRight(i15, 18));
    }

    private static int f2(int i15) {
        return (i15 >>> 10) ^ (rotateRight(i15, 17) ^ rotateRight(i15, 19));
    }

    private int g1(int i15, int i16, int i17) {
        return (rotateRight(i15, 10) ^ rotateRight(i17, 23)) + rotateRight(i16, 8);
    }

    private int g2(int i15, int i16, int i17) {
        return (rotateLeft(i15, 10) ^ rotateLeft(i17, 23)) + rotateLeft(i16, 8);
    }

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (iStep & GF2Field.MASK);
            bArr[1] = (byte) ((iStep >> 8) & GF2Field.MASK);
            bArr[2] = (byte) ((iStep >> 16) & GF2Field.MASK);
            bArr[3] = (byte) ((iStep >> 24) & GF2Field.MASK);
        }
        byte[] bArr2 = this.buf;
        int i15 = this.idx;
        byte b15 = bArr2[i15];
        this.idx = 3 & (i15 + 1);
        return b15;
    }

    private int h1(int i15) {
        int[] iArr = this.f149039q;
        return iArr[i15 & GF2Field.MASK] + iArr[((i15 >> 16) & GF2Field.MASK) + 256];
    }

    private int h2(int i15) {
        int[] iArr = this.f149038p;
        return iArr[i15 & GF2Field.MASK] + iArr[((i15 >> 16) & GF2Field.MASK) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        if (this.f149037iv.length != 16) {
            throw new IllegalArgumentException("The IV must be 128 bits long");
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[1280];
        for (int i15 = 0; i15 < 16; i15++) {
            int i16 = i15 >> 2;
            iArr[i16] = ((this.key[i15] & 255) << ((i15 & 3) * 8)) | iArr[i16];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i17 = 0;
        while (true) {
            byte[] bArr = this.f149037iv;
            if (i17 >= bArr.length || i17 >= 16) {
                break;
            }
            int i18 = (i17 >> 2) + 8;
            iArr[i18] = ((bArr[i17] & 255) << ((i17 & 3) * 8)) | iArr[i18];
            i17++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i19 = 16; i19 < 1280; i19++) {
            iArr[i19] = f2(iArr[i19 - 2]) + iArr[i19 - 7] + f1(iArr[i19 - 15]) + iArr[i19 - 16] + i19;
        }
        System.arraycopy(iArr, 256, this.f149038p, 0, 512);
        System.arraycopy(iArr, 768, this.f149039q, 0, 512);
        for (int i25 = 0; i25 < 512; i25++) {
            this.f149038p[i25] = step();
        }
        for (int i26 = 0; i26 < 512; i26++) {
            this.f149039q[i26] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i15) {
        return i15 & 1023;
    }

    private static int mod512(int i15) {
        return i15 & 511;
    }

    private static int rotateLeft(int i15, int i16) {
        return (i15 >>> (-i16)) | (i15 << i16);
    }

    private static int rotateRight(int i15, int i16) {
        return (i15 << (-i16)) | (i15 >>> i16);
    }

    private int step() {
        int iH2;
        int i15;
        int iMod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f149038p;
            iArr[iMod512] = iArr[iMod512] + g1(iArr[dim(iMod512, 3)], this.f149038p[dim(iMod512, 10)], this.f149038p[dim(iMod512, 511)]);
            iH2 = h1(this.f149038p[dim(iMod512, 12)]);
            i15 = this.f149038p[iMod512];
        } else {
            int[] iArr2 = this.f149039q;
            iArr2[iMod512] = iArr2[iMod512] + g2(iArr2[dim(iMod512, 3)], this.f149039q[dim(iMod512, 10)], this.f149039q[dim(iMod512, 511)]);
            iH2 = h2(this.f149039q[dim(iMod512, 12)]);
            i15 = this.f149039q[iMod512];
        }
        int i16 = i15 ^ iH2;
        this.cnt = mod1024(this.cnt + 1);
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i15 + i16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i18 = 0; i18 < i16; i18++) {
            bArr2[i17 + i18] = (byte) (bArr[i15 + i18] ^ getByte());
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b15) {
        return (byte) (b15 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("no IV passed");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.f149037iv = parametersWithIV.getIV();
        CipherParameters parameters = parametersWithIV.getParameters();
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + cipherParameters.getClass().getName());
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z15)));
        this.initialised = true;
    }
}
