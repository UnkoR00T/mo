package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Blake2bpDigest implements ExtendedDigest {
    private int depth;
    private int digestLength;
    private int fanout;
    private long innerHashLength;
    private Blake2bDigest root;
    private int bufferPos = 0;
    private int keyLength = 0;
    private int nodeOffset = 0;
    private Blake2bDigest[] S = new Blake2bDigest[4];
    private byte[] salt = null;
    private byte[] key = null;
    private final int BLAKE2B_BLOCKBYTES = 128;
    private final int BLAKE2B_KEYBYTES = 64;
    private final int BLAKE2B_OUTBYTES = 64;
    private final int PARALLELISM_DEGREE = 4;
    private final byte[] singleByte = new byte[1];
    private byte[] param = new byte[64];
    private byte[] buffer = new byte[512];

    public Blake2bpDigest(byte[] bArr) {
        init(bArr);
    }

    private void init(byte[] bArr) {
        int i15;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length;
            this.keyLength = length;
            if (length > 64) {
                throw new IllegalArgumentException("Keys > 64 bytes are not supported");
            }
            this.key = Arrays.clone(bArr);
        }
        this.bufferPos = 0;
        this.digestLength = 64;
        this.fanout = 4;
        this.depth = 2;
        this.innerHashLength = 64L;
        byte[] bArr2 = this.param;
        bArr2[0] = (byte) 64;
        bArr2[1] = (byte) this.keyLength;
        bArr2[2] = (byte) 4;
        bArr2[3] = (byte) 2;
        bArr2[16] = 1;
        bArr2[17] = (byte) 64;
        this.root = new Blake2bDigest((byte[]) null, this.param);
        Pack.intToLittleEndian(this.nodeOffset, this.param, 8);
        this.param[16] = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            Pack.intToLittleEndian(i16, this.param, 8);
            this.S[i16] = new Blake2bDigest((byte[]) null, this.param);
        }
        this.root.setAsLastNode();
        this.S[3].setAsLastNode();
        if (bArr == null || (i15 = this.keyLength) <= 0) {
            return;
        }
        byte[] bArr3 = new byte[128];
        System.arraycopy(bArr, 0, bArr3, 0, i15);
        for (int i17 = 0; i17 < 4; i17++) {
            this.S[i17].update(bArr3, 0, 128);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i15) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
        for (int i16 = 0; i16 < 4; i16++) {
            int i17 = this.bufferPos;
            int i18 = i16 * 128;
            if (i17 > i18) {
                int i19 = i17 - i18;
                if (i19 > 128) {
                    i19 = 128;
                }
                this.S[i16].update(this.buffer, i18, i19);
            }
            this.S[i16].doFinal(bArr2[i16], 0);
        }
        for (int i25 = 0; i25 < 4; i25++) {
            this.root.update(bArr2[i25], 0, 64);
        }
        int iDoFinal = this.root.doFinal(bArr, i15);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2bp";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.digestLength = 64;
        this.root.reset();
        for (int i15 = 0; i15 < 4; i15++) {
            this.S[i15].reset();
        }
        this.root.setAsLastNode();
        this.S[3].setAsLastNode();
        byte[] bArr = this.key;
        if (bArr != null) {
            byte[] bArr2 = new byte[128];
            System.arraycopy(bArr, 0, bArr2, 0, this.keyLength);
            for (int i16 = 0; i16 < 4; i16++) {
                this.S[i16].update(bArr2, 0, 128);
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
        int i18 = 1024 - i17;
        if (i17 != 0 && i16 >= i18) {
            System.arraycopy(bArr, i15, this.buffer, i17, i18);
            for (int i19 = 0; i19 < 4; i19++) {
                this.S[i19].update(this.buffer, i19 * 128, 128);
            }
            i15 += i18;
            i16 -= i18;
            i17 = 0;
        }
        for (int i25 = 0; i25 < 4; i25++) {
            int i26 = (i25 * 128) + i15;
            for (int i27 = i16; i27 >= 512; i27 -= 512) {
                this.S[i25].update(bArr, i26, 128);
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
