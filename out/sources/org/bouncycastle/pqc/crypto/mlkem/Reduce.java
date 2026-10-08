package org.bouncycastle.pqc.crypto.mlkem;

/* JADX INFO: loaded from: classes5.dex */
class Reduce {
    Reduce() {
    }

    public static short barretReduce(short s15) {
        return (short) (s15 - ((short) (((short) ((((short) 20159) * s15) >> 26)) * 3329)));
    }

    static int checkModulus(short s15) {
        return s15 - 3329;
    }

    public static short conditionalSubQ(short s15) {
        short s16 = (short) (s15 - 3329);
        return (short) (s16 + ((s16 >> 15) & MLKEMEngine.KyberQ));
    }

    public static short montgomeryReduce(int i15) {
        return (short) ((i15 - (((short) (MLKEMEngine.KyberQinv * i15)) * 3329)) >> 16);
    }
}
