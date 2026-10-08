package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DSTU7624Mac implements Mac {
    private static final int BITS_IN_BYTE = 8;
    private int blockSize;
    private byte[] buf;
    private int bufOff;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f149087c;
    private byte[] cTemp;
    private DSTU7624Engine engine;
    private boolean initCalled = false;
    private byte[] kDelta;
    private int macSize;

    public DSTU7624Mac(int i15, int i16) {
        this.engine = new DSTU7624Engine(i15);
        int i17 = i15 / 8;
        this.blockSize = i17;
        this.macSize = i16 / 8;
        this.f149087c = new byte[i17];
        this.kDelta = new byte[i17];
        this.cTemp = new byte[i17];
        this.buf = new byte[i17];
    }

    private void processBlock(byte[] bArr, int i15) {
        xor(this.f149087c, 0, bArr, i15, this.cTemp);
        this.engine.processBlock(this.cTemp, 0, this.f149087c, 0);
    }

    private void xor(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3) {
        int length = bArr.length - i15;
        int i17 = this.blockSize;
        if (length < i17 || bArr2.length - i16 < i17 || bArr3.length < i17) {
            throw new IllegalArgumentException("some of input buffers too short");
        }
        for (int i18 = 0; i18 < this.blockSize; i18++) {
            bArr3[i18] = (byte) (bArr[i18 + i15] ^ bArr2[i18 + i16]);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i15) {
        int i16 = this.bufOff;
        byte[] bArr2 = this.buf;
        if (i16 % bArr2.length != 0) {
            throw new DataLengthException("input must be a multiple of blocksize");
        }
        xor(this.f149087c, 0, bArr2, 0, this.cTemp);
        xor(this.cTemp, 0, this.kDelta, 0, this.f149087c);
        DSTU7624Engine dSTU7624Engine = this.engine;
        byte[] bArr3 = this.f149087c;
        dSTU7624Engine.processBlock(bArr3, 0, bArr3, 0);
        int i17 = this.macSize;
        if (i17 + i15 > bArr.length) {
            throw new OutputLengthException("output buffer too short");
        }
        System.arraycopy(this.f149087c, 0, bArr, i15, i17);
        reset();
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "DSTU7624Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to DSTU7624Mac");
        }
        this.engine.init(true, cipherParameters);
        this.initCalled = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        Arrays.fill(this.f149087c, (byte) 0);
        Arrays.fill(this.cTemp, (byte) 0);
        Arrays.fill(this.kDelta, (byte) 0);
        Arrays.fill(this.buf, (byte) 0);
        this.engine.reset();
        if (this.initCalled) {
            DSTU7624Engine dSTU7624Engine = this.engine;
            byte[] bArr = this.kDelta;
            dSTU7624Engine.processBlock(bArr, 0, bArr, 0);
        }
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b15) {
        int i15 = this.bufOff;
        byte[] bArr = this.buf;
        if (i15 == bArr.length) {
            processBlock(bArr, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i16 = this.bufOff;
        this.bufOff = i16 + 1;
        bArr2[i16] = b15;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i15, int i16) {
        if (i16 < 0) {
            throw new IllegalArgumentException("can't have a negative input length!");
        }
        int blockSize = this.engine.getBlockSize();
        int i17 = this.bufOff;
        int i18 = blockSize - i17;
        if (i16 > i18) {
            System.arraycopy(bArr, i15, this.buf, i17, i18);
            processBlock(this.buf, 0);
            this.bufOff = 0;
            i16 -= i18;
            i15 += i18;
            while (i16 > blockSize) {
                processBlock(bArr, i15);
                i16 -= blockSize;
                i15 += blockSize;
            }
        }
        System.arraycopy(bArr, i15, this.buf, this.bufOff, i16);
        this.bufOff += i16;
    }
}
