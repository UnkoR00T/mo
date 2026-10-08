package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class ISAACEngine implements StreamCipher {
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private int[] engineState = null;
    private int[] results = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f149043a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f149044b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f149045c = 0;
    private int index = 0;
    private byte[] keyStream = new byte[1024];
    private byte[] workingKey = null;
    private boolean initialised = false;

    private void isaac() {
        int i15;
        int i16;
        int i17 = this.f149044b;
        int i18 = this.f149045c + 1;
        this.f149045c = i18;
        this.f149044b = i17 + i18;
        for (int i19 = 0; i19 < 256; i19++) {
            int[] iArr = this.engineState;
            int i25 = iArr[i19];
            int i26 = i19 & 3;
            if (i26 == 0) {
                i15 = this.f149043a;
                i16 = i15 << 13;
            } else if (i26 == 1) {
                i15 = this.f149043a;
                i16 = i15 >>> 6;
            } else if (i26 != 2) {
                if (i26 == 3) {
                    i15 = this.f149043a;
                    i16 = i15 >>> 16;
                }
                int i27 = this.f149043a + iArr[(i19 + 128) & GF2Field.MASK];
                this.f149043a = i27;
                int i28 = iArr[(i25 >>> 2) & GF2Field.MASK] + i27 + this.f149044b;
                iArr[i19] = i28;
                int[] iArr2 = this.results;
                int i29 = iArr[(i28 >>> 10) & GF2Field.MASK] + i25;
                this.f149044b = i29;
                iArr2[i19] = i29;
            } else {
                i15 = this.f149043a;
                i16 = i15 << 2;
            }
            this.f149043a = i15 ^ i16;
            int i210 = this.f149043a + iArr[(i19 + 128) & GF2Field.MASK];
            this.f149043a = i210;
            int i211 = iArr[(i25 >>> 2) & GF2Field.MASK] + i210 + this.f149044b;
            iArr[i19] = i211;
            int[] iArr3 = this.results;
            int i212 = iArr[(i211 >>> 10) & GF2Field.MASK] + i25;
            this.f149044b = i212;
            iArr3[i19] = i212;
        }
    }

    private void mix(int[] iArr) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = i15 ^ (i16 << 11);
        iArr[0] = i17;
        int i18 = iArr[3] + i17;
        iArr[3] = i18;
        int i19 = iArr[2];
        int i25 = i16 + i19;
        iArr[1] = i25;
        int i26 = i25 ^ (i19 >>> 2);
        iArr[1] = i26;
        int i27 = iArr[4] + i26;
        iArr[4] = i27;
        int i28 = i19 + i18;
        iArr[2] = i28;
        int i29 = i28 ^ (i18 << 8);
        iArr[2] = i29;
        int i35 = iArr[5] + i29;
        iArr[5] = i35;
        int i36 = i18 + i27;
        iArr[3] = i36;
        int i37 = i36 ^ (i27 >>> 16);
        iArr[3] = i37;
        int i38 = iArr[6] + i37;
        iArr[6] = i38;
        int i39 = i27 + i35;
        iArr[4] = i39;
        int i45 = (i35 << 10) ^ i39;
        iArr[4] = i45;
        int i46 = iArr[7] + i45;
        iArr[7] = i46;
        int i47 = i35 + i38;
        iArr[5] = i47;
        int i48 = (i38 >>> 4) ^ i47;
        iArr[5] = i48;
        int i49 = i17 + i48;
        iArr[0] = i49;
        int i55 = i38 + i46;
        iArr[6] = i55;
        int i56 = (i46 << 8) ^ i55;
        iArr[6] = i56;
        int i57 = i26 + i56;
        iArr[1] = i57;
        int i58 = i46 + i49;
        iArr[7] = i58;
        int i59 = (i49 >>> 9) ^ i58;
        iArr[7] = i59;
        iArr[2] = i29 + i59;
        iArr[0] = i49 + i57;
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        if (this.engineState == null) {
            this.engineState = new int[256];
        }
        if (this.results == null) {
            this.results = new int[256];
        }
        for (int i15 = 0; i15 < 256; i15++) {
            int[] iArr = this.engineState;
            this.results[i15] = 0;
            iArr[i15] = 0;
        }
        this.f149045c = 0;
        this.f149044b = 0;
        this.f149043a = 0;
        this.index = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i16 = 0; i16 < length; i16 += 4) {
            this.results[i16 >>> 2] = Pack.littleEndianToInt(bArr2, i16);
        }
        int[] iArr2 = new int[8];
        for (int i17 = 0; i17 < 8; i17++) {
            iArr2[i17] = -1640531527;
        }
        for (int i18 = 0; i18 < 4; i18++) {
            mix(iArr2);
        }
        int i19 = 0;
        while (i19 < 2) {
            for (int i25 = 0; i25 < 256; i25 += 8) {
                for (int i26 = 0; i26 < 8; i26++) {
                    iArr2[i26] = iArr2[i26] + (i19 < 1 ? this.results[i25 + i26] : this.engineState[i25 + i26]);
                }
                mix(iArr2);
                for (int i27 = 0; i27 < 8; i27++) {
                    this.engineState[i25 + i27] = iArr2[i27];
                }
            }
            i19++;
        }
        isaac();
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ISAAC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            setKey(key);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length < 32 ? key.length * 8 : 256, cipherParameters, Utils.getPurpose(z15)));
        } else {
            throw new IllegalArgumentException("invalid parameter passed to ISAAC init - " + cipherParameters.getClass().getName());
        }
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
            if (this.index == 0) {
                isaac();
                this.keyStream = Pack.intToBigEndian(this.results);
            }
            byte[] bArr3 = this.keyStream;
            int i19 = this.index;
            bArr2[i18 + i17] = (byte) (bArr3[i19] ^ bArr[i18 + i15]);
            this.index = (i19 + 1) & 1023;
        }
        return i16;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b15) {
        if (this.index == 0) {
            isaac();
            this.keyStream = Pack.intToBigEndian(this.results);
        }
        byte[] bArr = this.keyStream;
        int i15 = this.index;
        byte b16 = (byte) (b15 ^ bArr[i15]);
        this.index = (i15 + 1) & 1023;
        return b16;
    }
}
