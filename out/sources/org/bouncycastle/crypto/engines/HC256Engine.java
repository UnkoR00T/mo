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
public class HC256Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f149040iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f149041p = new int[1024];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f149042q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

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

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f149040iv.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.f149040iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f149040iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f149040iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i15 = 0; i15 < 32; i15++) {
            int i16 = i15 >> 2;
            iArr[i16] = iArr[i16] | ((this.key[i15] & 255) << ((i15 & 3) * 8));
        }
        for (int i17 = 0; i17 < 32; i17++) {
            int i18 = (i17 >> 2) + 8;
            iArr[i18] = iArr[i18] | ((this.f149040iv[i17] & 255) << ((i17 & 3) * 8));
        }
        for (int i19 = 16; i19 < 2560; i19++) {
            int i25 = iArr[i19 - 2];
            int i26 = iArr[i19 - 15];
            iArr[i19] = ((i25 >>> 10) ^ (rotateRight(i25, 17) ^ rotateRight(i25, 19))) + iArr[i19 - 7] + ((i26 >>> 3) ^ (rotateRight(i26, 7) ^ rotateRight(i26, 18))) + iArr[i19 - 16] + i19;
        }
        System.arraycopy(iArr, 512, this.f149041p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f149042q, 0, 1024);
        for (int i27 = 0; i27 < 4096; i27++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i15, int i16) {
        return (i15 << (-i16)) | (i15 >>> i16);
    }

    private int step() {
        int i15;
        int i16;
        int i17 = this.cnt;
        int i18 = i17 & 1023;
        if (i17 < 1024) {
            int[] iArr = this.f149041p;
            int i19 = iArr[(i18 - 3) & 1023];
            int i25 = iArr[(i18 - 1023) & 1023];
            int i26 = iArr[i18];
            int iRotateRight = iArr[(i18 - 10) & 1023] + (rotateRight(i25, 23) ^ rotateRight(i19, 10));
            int[] iArr2 = this.f149042q;
            iArr[i18] = i26 + iRotateRight + iArr2[(i19 ^ i25) & 1023];
            int[] iArr3 = this.f149041p;
            int i27 = iArr3[(i18 - 12) & 1023];
            i15 = iArr2[i27 & GF2Field.MASK] + iArr2[((i27 >> 8) & GF2Field.MASK) + 256] + iArr2[((i27 >> 16) & GF2Field.MASK) + 512] + iArr2[((i27 >> 24) & GF2Field.MASK) + 768];
            i16 = iArr3[i18];
        } else {
            int[] iArr4 = this.f149042q;
            int i28 = iArr4[(i18 - 3) & 1023];
            int i29 = iArr4[(i18 - 1023) & 1023];
            int i35 = iArr4[i18];
            int iRotateRight2 = iArr4[(i18 - 10) & 1023] + (rotateRight(i29, 23) ^ rotateRight(i28, 10));
            int[] iArr5 = this.f149041p;
            iArr4[i18] = i35 + iRotateRight2 + iArr5[(i28 ^ i29) & 1023];
            int[] iArr6 = this.f149042q;
            int i36 = iArr6[(i18 - 12) & 1023];
            i15 = iArr5[i36 & GF2Field.MASK] + iArr5[((i36 >> 8) & GF2Field.MASK) + 256] + iArr5[((i36 >> 16) & GF2Field.MASK) + 512] + iArr5[((i36 >> 24) & GF2Field.MASK) + 768];
            i16 = iArr6[i18];
        }
        int i37 = i16 ^ i15;
        this.cnt = (this.cnt + 1) & 2047;
        return i37;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
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
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f149040iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f149040iv = new byte[0];
            parameters = cipherParameters;
        }
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + cipherParameters.getClass().getName());
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), this.key.length * 8, cipherParameters, Utils.getPurpose(z15)));
        this.initialised = true;
    }
}
