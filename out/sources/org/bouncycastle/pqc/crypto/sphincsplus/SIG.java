package org.bouncycastle.pqc.crypto.sphincsplus;

/* JADX INFO: loaded from: classes5.dex */
class SIG {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f149587r;
    private final SIG_FORS[] sig_fors;
    private final SIG_XMSS[] sig_ht;

    public SIG(int i15, int i16, int i17, int i18, int i19, int i25, byte[] bArr) {
        byte[] bArr2 = new byte[i15];
        this.f149587r = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        this.sig_fors = new SIG_FORS[i16];
        int i26 = i15;
        for (int i27 = 0; i27 != i16; i27++) {
            byte[] bArr3 = new byte[i15];
            System.arraycopy(bArr, i26, bArr3, 0, i15);
            i26 += i15;
            byte[][] bArr4 = new byte[i17][];
            for (int i28 = 0; i28 != i17; i28++) {
                byte[] bArr5 = new byte[i15];
                bArr4[i28] = bArr5;
                System.arraycopy(bArr, i26, bArr5, 0, i15);
                i26 += i15;
            }
            this.sig_fors[i27] = new SIG_FORS(bArr3, bArr4);
        }
        this.sig_ht = new SIG_XMSS[i18];
        for (int i29 = 0; i29 != i18; i29++) {
            int i35 = i25 * i15;
            byte[] bArr6 = new byte[i35];
            System.arraycopy(bArr, i26, bArr6, 0, i35);
            i26 += i35;
            byte[][] bArr7 = new byte[i19][];
            for (int i36 = 0; i36 != i19; i36++) {
                byte[] bArr8 = new byte[i15];
                bArr7[i36] = bArr8;
                System.arraycopy(bArr, i26, bArr8, 0, i15);
                i26 += i15;
            }
            this.sig_ht[i29] = new SIG_XMSS(bArr6, bArr7);
        }
        if (i26 != bArr.length) {
            throw new IllegalArgumentException("signature wrong length");
        }
    }

    public byte[] getR() {
        return this.f149587r;
    }

    public SIG_FORS[] getSIG_FORS() {
        return this.sig_fors;
    }

    public SIG_XMSS[] getSIG_HT() {
        return this.sig_ht;
    }
}
