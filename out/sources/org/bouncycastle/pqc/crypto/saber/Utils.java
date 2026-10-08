package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes5.dex */
class Utils {
    private final int SABER_EP;
    private final int SABER_ET;
    private final int SABER_KEYBYTES;
    private final int SABER_L;
    private final int SABER_N;
    private final int SABER_POLYBYTES;
    private final boolean usingEffectiveMasking;

    public Utils(SABEREngine sABEREngine) {
        this.SABER_N = sABEREngine.getSABER_N();
        this.SABER_L = sABEREngine.getSABER_L();
        this.SABER_ET = sABEREngine.getSABER_ET();
        this.SABER_POLYBYTES = sABEREngine.getSABER_POLYBYTES();
        this.SABER_EP = sABEREngine.getSABER_EP();
        this.SABER_KEYBYTES = sABEREngine.getSABER_KEYBYTES();
        this.usingEffectiveMasking = sABEREngine.usingEffectiveMasking;
    }

    private void BS2POLq(byte[] bArr, int i15, short[] sArr) {
        short s15 = 0;
        if (this.usingEffectiveMasking) {
            while (s15 < this.SABER_N / 2) {
                short s16 = (short) (s15 * 2);
                int i16 = ((short) (s15 * 3)) + i15;
                int i17 = bArr[i16] & 255;
                byte b15 = bArr[i16 + 1];
                sArr[s16] = (short) (i17 | ((b15 & 15) << 8));
                sArr[s16 + 1] = (short) (((bArr[i16 + 2] & 255) << 4) | ((b15 >> 4) & 15));
                s15 = (short) (s15 + 1);
            }
            return;
        }
        while (s15 < this.SABER_N / 8) {
            short s17 = (short) (s15 * 8);
            int i18 = ((short) (s15 * 13)) + i15;
            int i19 = bArr[i18] & 255;
            byte b16 = bArr[i18 + 1];
            sArr[s17] = (short) (i19 | ((b16 & 31) << 8));
            int i25 = ((b16 >> 5) & 7) | ((bArr[i18 + 2] & 255) << 3);
            byte b17 = bArr[i18 + 3];
            sArr[s17 + 1] = (short) (i25 | ((b17 & 3) << 11));
            int i26 = (b17 >> 2) & 63;
            byte b18 = bArr[i18 + 4];
            sArr[s17 + 2] = (short) (i26 | ((b18 & 127) << 6));
            int i27 = ((b18 >> 7) & 1) | ((bArr[i18 + 5] & 255) << 1);
            byte b19 = bArr[i18 + 6];
            sArr[s17 + 3] = (short) (i27 | ((b19 & 15) << 9));
            int i28 = ((b19 >> 4) & 15) | ((bArr[i18 + 7] & 255) << 4);
            byte b25 = bArr[i18 + 8];
            sArr[s17 + 4] = (short) (i28 | ((b25 & 1) << 12));
            int i29 = (b25 >> 1) & CertificateBody.profileType;
            byte b26 = bArr[i18 + 9];
            sArr[s17 + 5] = (short) (i29 | ((b26 & 63) << 7));
            int i35 = ((b26 >> 6) & 3) | ((bArr[i18 + 10] & 255) << 2);
            byte b27 = bArr[i18 + 11];
            sArr[s17 + 6] = (short) (i35 | ((b27 & 7) << 10));
            sArr[s17 + 7] = (short) (((bArr[i18 + 12] & 255) << 5) | ((b27 >> 3) & 31));
            s15 = (short) (s15 + 1);
        }
    }

    private void POLp2BS(byte[] bArr, int i15, short[] sArr) {
        for (short s15 = 0; s15 < this.SABER_N / 4; s15 = (short) (s15 + 1)) {
            short s16 = (short) (s15 * 4);
            int i16 = ((short) (s15 * 5)) + i15;
            short s17 = sArr[s16];
            bArr[i16] = (byte) (s17 & 255);
            short s18 = sArr[s16 + 1];
            bArr[i16 + 1] = (byte) (((s17 >> 8) & 3) | ((s18 & 63) << 2));
            int i17 = (s18 >> 6) & 15;
            short s19 = sArr[s16 + 2];
            bArr[i16 + 2] = (byte) (i17 | ((s19 & 15) << 4));
            short s25 = sArr[s16 + 3];
            bArr[i16 + 3] = (byte) (((s19 >> 4) & 63) | ((s25 & 3) << 6));
            bArr[i16 + 4] = (byte) ((s25 >> 2) & GF2Field.MASK);
        }
    }

    private void POLq2BS(byte[] bArr, int i15, short[] sArr) {
        short s15 = 0;
        if (this.usingEffectiveMasking) {
            while (s15 < this.SABER_N / 2) {
                short s16 = (short) (s15 * 2);
                int i16 = ((short) (s15 * 3)) + i15;
                short s17 = sArr[s16];
                bArr[i16] = (byte) (s17 & 255);
                short s18 = sArr[s16 + 1];
                bArr[i16 + 1] = (byte) (((s17 >> 8) & 15) | ((s18 & 15) << 4));
                bArr[i16 + 2] = (byte) ((s18 >> 4) & GF2Field.MASK);
                s15 = (short) (s15 + 1);
            }
            return;
        }
        while (s15 < this.SABER_N / 8) {
            short s19 = (short) (s15 * 8);
            int i17 = ((short) (s15 * 13)) + i15;
            short s25 = sArr[s19];
            bArr[i17] = (byte) (s25 & 255);
            short s26 = sArr[s19 + 1];
            bArr[i17 + 1] = (byte) (((s25 >> 8) & 31) | ((s26 & 7) << 5));
            bArr[i17 + 2] = (byte) ((s26 >> 3) & GF2Field.MASK);
            int i18 = (s26 >> 11) & 3;
            short s27 = sArr[s19 + 2];
            bArr[i17 + 3] = (byte) (i18 | ((s27 & 63) << 2));
            int i19 = (s27 >> 6) & CertificateBody.profileType;
            short s28 = sArr[s19 + 3];
            bArr[i17 + 4] = (byte) (i19 | ((s28 & 1) << 7));
            bArr[i17 + 5] = (byte) ((s28 >> 1) & GF2Field.MASK);
            int i25 = (s28 >> 9) & 15;
            short s29 = sArr[s19 + 4];
            bArr[i17 + 6] = (byte) (i25 | ((s29 & 15) << 4));
            bArr[i17 + 7] = (byte) ((s29 >> 4) & GF2Field.MASK);
            int i26 = (s29 >> 12) & 1;
            short s35 = sArr[s19 + 5];
            bArr[i17 + 8] = (byte) (i26 | ((s35 & 127) << 1));
            int i27 = (s35 >> 7) & 63;
            short s36 = sArr[s19 + 6];
            bArr[i17 + 9] = (byte) (i27 | ((s36 & 3) << 6));
            bArr[i17 + 10] = (byte) ((s36 >> 2) & GF2Field.MASK);
            short s37 = sArr[s19 + 7];
            bArr[i17 + 11] = (byte) (((s36 >> 10) & 7) | ((s37 & 31) << 3));
            bArr[i17 + 12] = (byte) ((s37 >> 5) & GF2Field.MASK);
            s15 = (short) (s15 + 1);
        }
    }

    public void BS2POLT(byte[] bArr, int i15, short[] sArr) {
        int i16 = this.SABER_ET;
        short s15 = 0;
        if (i16 == 3) {
            while (s15 < this.SABER_N / 8) {
                short s16 = (short) (s15 * 8);
                int i17 = ((short) (s15 * 3)) + i15;
                byte b15 = bArr[i17];
                sArr[s16] = (short) (b15 & 7);
                sArr[s16 + 1] = (short) ((b15 >> 3) & 7);
                byte b16 = bArr[i17 + 1];
                sArr[s16 + 2] = (short) (((b15 >> 6) & 3) | ((b16 & 1) << 2));
                sArr[s16 + 3] = (short) ((b16 >> 1) & 7);
                sArr[s16 + 4] = (short) ((b16 >> 4) & 7);
                byte b17 = bArr[i17 + 2];
                sArr[s16 + 5] = (short) (((b16 >> 7) & 1) | ((b17 & 3) << 1));
                sArr[s16 + 6] = (short) ((b17 >> 2) & 7);
                sArr[s16 + 7] = (short) ((b17 >> 5) & 7);
                s15 = (short) (s15 + 1);
            }
            return;
        }
        if (i16 == 4) {
            while (s15 < this.SABER_N / 2) {
                short s17 = (short) (s15 * 2);
                byte b18 = bArr[i15 + s15];
                sArr[s17] = (short) (b18 & 15);
                sArr[s17 + 1] = (short) ((b18 >> 4) & 15);
                s15 = (short) (s15 + 1);
            }
            return;
        }
        if (i16 == 6) {
            while (s15 < this.SABER_N / 4) {
                short s18 = (short) (s15 * 4);
                int i18 = ((short) (s15 * 3)) + i15;
                byte b19 = bArr[i18];
                sArr[s18] = (short) (b19 & 63);
                byte b25 = bArr[i18 + 1];
                sArr[s18 + 1] = (short) (((b19 >> 6) & 3) | ((b25 & 15) << 2));
                byte b26 = bArr[i18 + 2];
                sArr[s18 + 2] = (short) (((b25 & 255) >> 4) | ((b26 & 3) << 4));
                sArr[s18 + 3] = (short) ((b26 & 255) >> 2);
                s15 = (short) (s15 + 1);
            }
        }
    }

    public void BS2POLVECp(byte[] bArr, short[][] sArr) {
        for (byte b15 = 0; b15 < this.SABER_L; b15 = (byte) (b15 + 1)) {
            BS2POLp(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b15, sArr[b15]);
        }
    }

    public void BS2POLVECq(byte[] bArr, int i15, short[][] sArr) {
        for (byte b15 = 0; b15 < this.SABER_L; b15 = (byte) (b15 + 1)) {
            BS2POLq(bArr, (this.SABER_POLYBYTES * b15) + i15, sArr[b15]);
        }
    }

    public void BS2POLmsg(byte[] bArr, short[] sArr) {
        for (byte b15 = 0; b15 < this.SABER_KEYBYTES; b15 = (byte) (b15 + 1)) {
            for (byte b16 = 0; b16 < 8; b16 = (byte) (b16 + 1)) {
                sArr[(b15 * 8) + b16] = (short) ((bArr[b15] >> b16) & 1);
            }
        }
    }

    public void BS2POLp(byte[] bArr, int i15, short[] sArr) {
        for (short s15 = 0; s15 < this.SABER_N / 4; s15 = (short) (s15 + 1)) {
            short s16 = (short) (s15 * 4);
            int i16 = ((short) (s15 * 5)) + i15;
            int i17 = bArr[i16] & 255;
            byte b15 = bArr[i16 + 1];
            sArr[s16] = (short) (i17 | ((b15 & 3) << 8));
            byte b16 = bArr[i16 + 2];
            sArr[s16 + 1] = (short) (((b15 >> 2) & 63) | ((b16 & 15) << 6));
            int i18 = (b16 >> 4) & 15;
            byte b17 = bArr[i16 + 3];
            sArr[s16 + 2] = (short) (i18 | ((b17 & 63) << 4));
            sArr[s16 + 3] = (short) (((bArr[i16 + 4] & 255) << 2) | ((b17 >> 6) & 3));
        }
    }

    public void POLT2BS(byte[] bArr, int i15, short[] sArr) {
        int i16 = this.SABER_ET;
        short s15 = 0;
        if (i16 == 3) {
            while (s15 < this.SABER_N / 8) {
                short s16 = (short) (s15 * 8);
                int i17 = ((short) (s15 * 3)) + i15;
                int i18 = (sArr[s16] & 7) | ((sArr[s16 + 1] & 7) << 3);
                short s17 = sArr[s16 + 2];
                bArr[i17] = (byte) (i18 | ((s17 & 3) << 6));
                int i19 = ((s17 >> 2) & 1) | ((sArr[s16 + 3] & 7) << 1) | ((sArr[s16 + 4] & 7) << 4);
                short s18 = sArr[s16 + 5];
                bArr[i17 + 1] = (byte) (i19 | ((s18 & 1) << 7));
                bArr[i17 + 2] = (byte) (((sArr[s16 + 7] & 7) << 5) | ((s18 >> 1) & 3) | ((sArr[s16 + 6] & 7) << 2));
                s15 = (short) (s15 + 1);
            }
            return;
        }
        if (i16 == 4) {
            while (s15 < this.SABER_N / 2) {
                short s19 = (short) (s15 * 2);
                bArr[i15 + s15] = (byte) (((sArr[s19 + 1] & 15) << 4) | (sArr[s19] & 15));
                s15 = (short) (s15 + 1);
            }
            return;
        }
        if (i16 == 6) {
            while (s15 < this.SABER_N / 4) {
                short s25 = (short) (s15 * 4);
                int i25 = ((short) (s15 * 3)) + i15;
                int i26 = sArr[s25] & 63;
                short s26 = sArr[s25 + 1];
                bArr[i25] = (byte) (i26 | ((s26 & 3) << 6));
                short s27 = sArr[s25 + 2];
                bArr[i25 + 1] = (byte) (((s26 >> 2) & 15) | ((s27 & 15) << 4));
                bArr[i25 + 2] = (byte) (((sArr[s25 + 3] & 63) << 2) | ((s27 >> 4) & 3));
                s15 = (short) (s15 + 1);
            }
        }
    }

    public void POLVECp2BS(byte[] bArr, short[][] sArr) {
        for (byte b15 = 0; b15 < this.SABER_L; b15 = (byte) (b15 + 1)) {
            POLp2BS(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b15, sArr[b15]);
        }
    }

    public void POLVECq2BS(byte[] bArr, short[][] sArr) {
        for (byte b15 = 0; b15 < this.SABER_L; b15 = (byte) (b15 + 1)) {
            POLq2BS(bArr, this.SABER_POLYBYTES * b15, sArr[b15]);
        }
    }

    public void POLmsg2BS(byte[] bArr, short[] sArr) {
        for (byte b15 = 0; b15 < this.SABER_KEYBYTES; b15 = (byte) (b15 + 1)) {
            for (byte b16 = 0; b16 < 8; b16 = (byte) (b16 + 1)) {
                bArr[b15] = (byte) (bArr[b15] | ((sArr[(b15 * 8) + b16] & 1) << b16));
            }
        }
    }
}
