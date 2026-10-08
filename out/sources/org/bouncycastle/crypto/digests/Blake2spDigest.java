package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Blake2spDigest implements ExtendedDigest {
    private int depth;
    private int digestLength;
    private int fanout;
    private long innerHashLength;
    private Blake2sDigest root;
    private int bufferPos = 0;
    private int keyLength = 0;
    private int nodeOffset = 0;
    private Blake2sDigest[] S = new Blake2sDigest[8];
    private byte[] salt = null;
    private byte[] key = null;
    private final int BLAKE2S_BLOCKBYTES = 64;
    private final int BLAKE2S_KEYBYTES = 32;
    private final int BLAKE2S_OUTBYTES = 32;
    private final int PARALLELISM_DEGREE = 8;
    private final byte[] singleByte = new byte[1];
    private byte[] param = new byte[32];
    private byte[] buffer = new byte[512];

    public Blake2spDigest(byte[] bArr) {
        init(bArr);
    }

    private void init(byte[] bArr) {
        int i15;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length;
            this.keyLength = length;
            if (length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            this.key = Arrays.clone(bArr);
        }
        this.bufferPos = 0;
        this.digestLength = 32;
        this.fanout = 8;
        this.depth = 2;
        this.innerHashLength = 32L;
        byte[] bArr2 = this.param;
        bArr2[0] = (byte) 32;
        bArr2[1] = (byte) this.keyLength;
        bArr2[2] = (byte) 8;
        bArr2[3] = (byte) 2;
        Pack.intToLittleEndian(0, bArr2, 8);
        byte[] bArr3 = this.param;
        bArr3[14] = 1;
        bArr3[15] = (byte) this.innerHashLength;
        this.root = new Blake2sDigest((byte[]) null, this.param);
        Pack.intToLittleEndian(this.nodeOffset, this.param, 8);
        this.param[14] = 0;
        for (int i16 = 0; i16 < 8; i16++) {
            Pack.intToLittleEndian(i16, this.param, 8);
            this.S[i16] = new Blake2sDigest((byte[]) null, this.param);
        }
        this.root.setAsLastNode();
        this.S[7].setAsLastNode();
        if (bArr == null || (i15 = this.keyLength) <= 0) {
            return;
        }
        byte[] bArr4 = new byte[64];
        System.arraycopy(bArr, 0, bArr4, 0, i15);
        for (int i17 = 0; i17 < 8; i17++) {
            this.S[i17].update(bArr4, 0, 64);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 32);
        for (int i16 = 0; i16 < 8; i16++) {
            int i17 = this.bufferPos;
            int i18 = i16 * 64;
            if (i17 > i18) {
                int i19 = i17 - i18;
                if (i19 > 64) {
                    i19 = 64;
                }
                this.S[i16].update(this.buffer, i18, i19);
            }
            this.S[i16].doFinal(bArr2[i16], 0);
        }
        for (int i25 = 0; i25 < 8; i25++) {
            this.root.update(bArr2[i25], 0, 32);
        }
        int iDoFinal = this.root.doFinal(bArr, i15);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2sp";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.digestLength = 32;
        this.root.reset();
        for (int i15 = 0; i15 < 8; i15++) {
            this.S[i15].reset();
        }
        this.root.setAsLastNode();
        this.S[7].setAsLastNode();
        byte[] bArr = this.key;
        if (bArr != null) {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, this.keyLength);
            for (int i16 = 0; i16 < 8; i16++) {
                this.S[i16].update(bArr2, 0, 64);
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b15) {
        byte[] bArr = this.singleByte;
        bArr[0] = b15;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i15, int i16) {
        int i17 = this.bufferPos;
        int i18 = 512 - i17;
        if (i17 != 0 && i16 >= i18) {
            System.arraycopy(bArr, i15, this.buffer, i17, i18);
            for (int i19 = 0; i19 < 8; i19++) {
                this.S[i19].update(this.buffer, i19 * 64, 64);
            }
            i15 += i18;
            i16 -= i18;
            i17 = 0;
        }
        for (int i25 = 0; i25 < 8; i25++) {
            int i26 = (i25 * 64) + i15;
            for (int i27 = i16; i27 >= 512; i27 -= 512) {
                this.S[i25].update(bArr, i26, 64);
                i26 += 512;
            }
        }
        int i28 = i16 % 512;
        int i29 = i15 + (i16 - i28);
        if (i28 > 0) {
            System.arraycopy(bArr, i29, this.buffer, i17, i28);
        }
        this.bufferPos = i17 + i28;
    }
}
