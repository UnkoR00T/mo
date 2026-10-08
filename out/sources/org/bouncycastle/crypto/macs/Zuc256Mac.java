package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.Zuc128CoreEngine;
import org.bouncycastle.crypto.engines.Zuc256CoreEngine;

/* JADX INFO: loaded from: classes5.dex */
public final class Zuc256Mac implements Mac {
    private static final int TOPBIT = 128;
    private int theByteIndex;
    private final InternalZuc256Engine theEngine;
    private final int[] theKeyStream;
    private final int[] theMac;
    private final int theMacLength;
    private Zuc256CoreEngine theState;
    private int theWordIndex;

    private static class InternalZuc256Engine extends Zuc256CoreEngine {
        public InternalZuc256Engine(int i15) {
            super(i15);
        }

        int createKeyStreamWord() {
            return super.makeKeyStreamWord();
        }
    }

    public Zuc256Mac(int i15) {
        this.theEngine = new InternalZuc256Engine(i15);
        this.theMacLength = i15;
        int i16 = i15 / 32;
        this.theMac = new int[i16];
        this.theKeyStream = new int[i16 + 1];
    }

    private int getKeyStreamWord(int i15, int i16) {
        int[] iArr = this.theKeyStream;
        int i17 = this.theWordIndex;
        int i18 = iArr[(i17 + i15) % iArr.length];
        if (i16 == 0) {
            return i18;
        }
        int i19 = iArr[((i17 + i15) + 1) % iArr.length];
        return (i19 >>> (32 - i16)) | (i18 << i16);
    }

    private void initKeyStream() {
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.theMac;
            if (i16 >= iArr.length) {
                break;
            }
            iArr[i16] = this.theEngine.createKeyStreamWord();
            i16++;
        }
        while (true) {
            int[] iArr2 = this.theKeyStream;
            if (i15 >= iArr2.length - 1) {
                this.theWordIndex = iArr2.length - 1;
                this.theByteIndex = 3;
                return;
            } else {
                iArr2[i15] = this.theEngine.createKeyStreamWord();
                i15++;
            }
        }
    }

    private void shift4Final() {
        int i15 = (this.theByteIndex + 1) % 4;
        this.theByteIndex = i15;
        if (i15 == 0) {
            this.theWordIndex = (this.theWordIndex + 1) % this.theKeyStream.length;
        }
    }

    private void shift4NextByte() {
        int i15 = (this.theByteIndex + 1) % 4;
        this.theByteIndex = i15;
        if (i15 == 0) {
            this.theKeyStream[this.theWordIndex] = this.theEngine.createKeyStreamWord();
            this.theWordIndex = (this.theWordIndex + 1) % this.theKeyStream.length;
        }
    }

    private void updateMac(int i15) {
        int i16 = 0;
        while (true) {
            int[] iArr = this.theMac;
            if (i16 >= iArr.length) {
                return;
            }
            iArr[i16] = iArr[i16] ^ getKeyStreamWord(i16, i15);
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        shift4Final();
        updateMac(this.theByteIndex * 8);
        int i16 = 0;
        while (true) {
            int[] iArr = this.theMac;
            if (i16 >= iArr.length) {
                reset();
                return getMacSize();
            }
            Zuc128CoreEngine.encode32be(iArr[i16], bArr, (i16 * 4) + i15);
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.theMacLength;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.theMacLength / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        this.theEngine.init(true, cipherParameters);
        this.theState = (Zuc256CoreEngine) this.theEngine.copy();
        initKeyStream();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Zuc256CoreEngine zuc256CoreEngine = this.theState;
        if (zuc256CoreEngine != null) {
            this.theEngine.reset(zuc256CoreEngine);
        }
        initKeyStream();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b15) {
        shift4NextByte();
        int i15 = this.theByteIndex * 8;
        int i16 = 128;
        int i17 = 0;
        while (i16 > 0) {
            if ((b15 & i16) != 0) {
                updateMac(i15 + i17);
            }
            i16 >>= 1;
            i17++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            update(bArr[i15 + i17]);
        }
    }
}
