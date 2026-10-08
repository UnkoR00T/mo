package org.bouncycastle.pqc.crypto.sphincsplus;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
class HarakaSXof extends HarakaSBase {
    public HarakaSXof(byte[] bArr) {
        byte[] bArr2 = new byte[640];
        update(bArr, 0, bArr.length);
        doFinal(bArr2, 0, 640);
        this.haraka512_rc = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 10, 8);
        this.haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
        for (int i15 = 0; i15 < 10; i15++) {
            interleaveConstant32(this.haraka256_rc[i15], bArr2, i15 << 5);
            interleaveConstant(this.haraka512_rc[i15], bArr2, i15 << 6);
        }
    }

    public int doFinal(byte[] bArr, int i15, int i16) {
        byte[] bArr2 = this.buffer;
        int i17 = this.off;
        bArr2[i17] = (byte) (bArr2[i17] ^ 31);
        bArr2[31] = (byte) (bArr2[31] ^ 128);
        int i18 = i16;
        while (i18 >= 32) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i15, 32);
            i15 += 32;
            i18 -= 32;
        }
        if (i18 > 0) {
            haraka512Perm(this.buffer);
            System.arraycopy(this.buffer, 0, bArr, i15, i18);
        }
        reset();
        return i16;
    }

    public String getAlgorithmName() {
        return "Haraka-S";
    }

    public void update(byte b15) {
        byte[] bArr = this.buffer;
        int i15 = this.off;
        int i16 = i15 + 1;
        this.off = i16;
        bArr[i15] = (byte) (b15 ^ bArr[i15]);
        if (i16 == 32) {
            haraka512Perm(bArr);
            this.off = 0;
        }
    }

    public void update(byte[] bArr, int i15, int i16) {
        int i17 = (this.off + i16) >> 5;
        int i18 = i15;
        for (int i19 = 0; i19 < i17; i19++) {
            while (true) {
                int i25 = this.off;
                if (i25 < 32) {
                    byte[] bArr2 = this.buffer;
                    this.off = i25 + 1;
                    bArr2[i25] = (byte) (bArr[i18] ^ bArr2[i25]);
                    i18++;
                }
            }
            haraka512Perm(this.buffer);
            this.off = 0;
        }
        while (i18 < i15 + i16) {
            byte[] bArr3 = this.buffer;
            int i26 = this.off;
            this.off = i26 + 1;
            bArr3[i26] = (byte) (bArr3[i26] ^ bArr[i18]);
            i18++;
        }
    }
}
