package org.bouncycastle.pqc.crypto.bike;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class BIKERing {
    private static final int PERMUTATION_CUTOFF = 64;
    private final int bits;
    private final Map<Integer, Integer> halfPowers;
    private final int size;
    private final int sizeExt;

    BIKERing(int i15) {
        HashMap map = new HashMap();
        this.halfPowers = map;
        if (((-65535) & i15) != 1) {
            throw new IllegalArgumentException();
        }
        this.bits = i15;
        int i16 = (i15 + 63) >>> 6;
        this.size = i16;
        this.sizeExt = i16 * 2;
        generateHalfPowersInv(map, i15);
    }

    private static int generateHalfPower(int i15, int i16, int i17) {
        int i18 = 1;
        while (i17 >= 32) {
            i18 = (int) ((((BodyPartID.bodyIdMax & ((long) (i16 * i18))) * ((long) i15)) + ((long) i18)) >>> 32);
            i17 -= 32;
        }
        if (i17 <= 0) {
            return i18;
        }
        return (int) ((((BodyPartID.bodyIdMax & ((long) ((i16 * i18) & ((-1) >>> (-i17))))) * ((long) i15)) + ((long) i18)) >>> i17);
    }

    private static void generateHalfPowersInv(Map<Integer, Integer> map, int i15) {
        int i16;
        int i17 = i15 - 2;
        int iNumberOfLeadingZeros = 32 - Integers.numberOfLeadingZeros(i17);
        int iInverse32 = Mod.inverse32(-i15);
        for (int i18 = 1; i18 < iNumberOfLeadingZeros; i18++) {
            int i19 = 1 << (i18 - 1);
            if (i19 >= 64 && !map.containsKey(Integers.valueOf(i19))) {
                map.put(Integers.valueOf(i19), Integers.valueOf(generateHalfPower(i15, iInverse32, i19)));
            }
            int i25 = 1 << i18;
            if ((i17 & i25) != 0 && (i16 = (i25 - 1) & i17) >= 64 && !map.containsKey(Integers.valueOf(i16))) {
                map.put(Integers.valueOf(i16), Integers.valueOf(generateHalfPower(i15, iInverse32, i16)));
            }
        }
    }

    private static int implModAdd(int i15, int i16, int i17) {
        int i18 = (i16 + i17) - i15;
        return i18 + (i15 & (i18 >> 31));
    }

    private static void implMulwAcc(long[] jArr, long j15, long j16, long[] jArr2, int i15) {
        long j17 = j15;
        jArr[1] = j16;
        for (int i16 = 2; i16 < 16; i16 += 2) {
            long j18 = jArr[i16 >>> 1] << 1;
            jArr[i16] = j18;
            jArr[i16 + 1] = j18 ^ j16;
        }
        int i17 = (int) j17;
        long j19 = jArr[i17 & 15] ^ (jArr[(i17 >>> 4) & 15] << 4);
        long j25 = 0;
        int i18 = 56;
        do {
            int i19 = (int) (j17 >>> i18);
            long j26 = jArr[i19 & 15] ^ (jArr[(i19 >>> 4) & 15] << 4);
            j19 ^= j26 << i18;
            j25 ^= j26 >>> (-i18);
            i18 -= 8;
        } while (i18 > 0);
        for (int i25 = 0; i25 < 7; i25++) {
            j17 = (j17 & (-72340172838076674L)) >>> 1;
            j25 ^= ((j16 << i25) >> 63) & j17;
        }
        jArr2[i15] = jArr2[i15] ^ j19;
        int i26 = i15 + 1;
        jArr2[i26] = jArr2[i26] ^ j25;
    }

    private void implPermute(long[] jArr, int i15, long[] jArr2) {
        int i16 = this.bits;
        int iIntValue = this.halfPowers.get(Integers.valueOf(i15)).intValue();
        int iImplModAdd = implModAdd(i16, iIntValue, iIntValue);
        int iImplModAdd2 = implModAdd(i16, iImplModAdd, iImplModAdd);
        int iImplModAdd3 = implModAdd(i16, iImplModAdd2, iImplModAdd2);
        int iImplModAdd4 = i16 - iImplModAdd3;
        int iImplModAdd5 = implModAdd(i16, iImplModAdd4, iIntValue);
        int iImplModAdd6 = implModAdd(i16, iImplModAdd4, iImplModAdd);
        int iImplModAdd7 = implModAdd(i16, iImplModAdd5, iImplModAdd);
        int iImplModAdd8 = implModAdd(i16, iImplModAdd4, iImplModAdd2);
        int iImplModAdd9 = implModAdd(i16, iImplModAdd5, iImplModAdd2);
        int iImplModAdd10 = implModAdd(i16, iImplModAdd6, iImplModAdd2);
        int iImplModAdd11 = implModAdd(i16, iImplModAdd7, iImplModAdd2);
        int i17 = 0;
        while (true) {
            int i18 = this.size;
            if (i17 >= i18) {
                int i19 = i18 - 1;
                jArr2[i19] = jArr2[i19] & ((-1) >>> (-i16));
                return;
            }
            long j15 = 0;
            for (int i25 = 0; i25 < 64; i25 += 8) {
                iImplModAdd4 = implModAdd(i16, iImplModAdd4, iImplModAdd3);
                iImplModAdd5 = implModAdd(i16, iImplModAdd5, iImplModAdd3);
                iImplModAdd6 = implModAdd(i16, iImplModAdd6, iImplModAdd3);
                iImplModAdd7 = implModAdd(i16, iImplModAdd7, iImplModAdd3);
                iImplModAdd8 = implModAdd(i16, iImplModAdd8, iImplModAdd3);
                iImplModAdd9 = implModAdd(i16, iImplModAdd9, iImplModAdd3);
                iImplModAdd10 = implModAdd(i16, iImplModAdd10, iImplModAdd3);
                iImplModAdd11 = implModAdd(i16, iImplModAdd11, iImplModAdd3);
                j15 = j15 | (((jArr[iImplModAdd4 >>> 6] >>> iImplModAdd4) & 1) << i25) | (((jArr[iImplModAdd5 >>> 6] >>> iImplModAdd5) & 1) << (i25 + 1)) | (((jArr[iImplModAdd6 >>> 6] >>> iImplModAdd6) & 1) << (i25 + 2)) | (((jArr[iImplModAdd7 >>> 6] >>> iImplModAdd7) & 1) << (i25 + 3)) | (((jArr[iImplModAdd8 >>> 6] >>> iImplModAdd8) & 1) << (i25 + 4)) | (((jArr[iImplModAdd9 >>> 6] >>> iImplModAdd9) & 1) << (i25 + 5)) | (((jArr[iImplModAdd10 >>> 6] >>> iImplModAdd10) & 1) << (i25 + 6)) | (((jArr[iImplModAdd11 >>> 6] >>> iImplModAdd11) & 1) << (i25 + 7));
            }
            jArr2[i17] = j15;
            i17++;
        }
    }

    private void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, this.size, jArr2, 0);
    }

    void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i15 = 0; i15 < this.size; i15++) {
            jArr3[i15] = jArr[i15] ^ jArr2[i15];
        }
    }

    void addTo(long[] jArr, long[] jArr2) {
        for (int i15 = 0; i15 < this.size; i15++) {
            jArr2[i15] = jArr2[i15] ^ jArr[i15];
        }
    }

    void copy(long[] jArr, long[] jArr2) {
        for (int i15 = 0; i15 < this.size; i15++) {
            jArr2[i15] = jArr[i15];
        }
    }

    long[] create() {
        return new long[this.size];
    }

    long[] createExt() {
        return new long[this.sizeExt];
    }

    void decodeBytes(byte[] bArr, long[] jArr) {
        int i15 = this.bits & 63;
        Pack.littleEndianToLong(bArr, 0, jArr, 0, this.size - 1);
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, (this.size - 1) << 3, bArr2, 0, (i15 + 7) >>> 3);
        jArr[this.size - 1] = Pack.littleEndianToLong(bArr2, 0);
    }

    byte[] encodeBitsTransposed(long[] jArr) {
        byte[] bArr = new byte[this.bits];
        bArr[0] = (byte) (jArr[0] & 1);
        int i15 = 1;
        while (true) {
            int i16 = this.bits;
            if (i15 >= i16) {
                return bArr;
            }
            bArr[i16 - i15] = (byte) ((jArr[i15 >>> 6] >>> (i15 & 63)) & 1);
            i15++;
        }
    }

    void encodeBytes(long[] jArr, byte[] bArr) {
        int i15 = this.bits & 63;
        Pack.longToLittleEndian(jArr, 0, this.size - 1, bArr, 0);
        byte[] bArr2 = new byte[8];
        Pack.longToLittleEndian(jArr[this.size - 1], bArr2, 0);
        System.arraycopy(bArr2, 0, bArr, (this.size - 1) << 3, (i15 + 7) >>> 3);
    }

    int getSize() {
        return this.size;
    }

    int getSizeExt() {
        return this.sizeExt;
    }

    protected void implMultiplyAcc(long[] jArr, long[] jArr2, long[] jArr3) {
        int i15;
        long[] jArr4 = new long[16];
        int i16 = 0;
        for (int i17 = 0; i17 < this.size; i17++) {
            implMulwAcc(jArr4, jArr[i17], jArr2[i17], jArr3, i17 << 1);
        }
        long j15 = jArr3[0];
        long j16 = jArr3[1];
        for (int i18 = 1; i18 < this.size; i18++) {
            int i19 = i18 << 1;
            j15 ^= jArr3[i19];
            jArr3[i18] = j15 ^ j16;
            j16 ^= jArr3[i19 + 1];
        }
        long j17 = j15 ^ j16;
        while (true) {
            i15 = this.size;
            if (i16 >= i15) {
                break;
            }
            jArr3[i15 + i16] = jArr3[i16] ^ j17;
            i16++;
        }
        int i25 = i15 - 1;
        for (int i26 = 1; i26 < i25 * 2; i26++) {
            int iMin = Math.min(i25, i26);
            int i27 = i26 - iMin;
            while (i27 < iMin) {
                implMulwAcc(jArr4, jArr[i27] ^ jArr[iMin], jArr2[i27] ^ jArr2[iMin], jArr3, i26);
                i27++;
                iMin--;
            }
        }
    }

    void inv(long[] jArr, long[] jArr2) {
        long[] jArrCreate = create();
        long[] jArrCreate2 = create();
        long[] jArrCreate3 = create();
        copy(jArr, jArrCreate);
        copy(jArr, jArrCreate3);
        int i15 = this.bits - 2;
        int iNumberOfLeadingZeros = 32 - Integers.numberOfLeadingZeros(i15);
        for (int i16 = 1; i16 < iNumberOfLeadingZeros; i16++) {
            squareN(jArrCreate, 1 << (i16 - 1), jArrCreate2);
            multiply(jArrCreate, jArrCreate2, jArrCreate);
            int i17 = 1 << i16;
            if ((i15 & i17) != 0) {
                squareN(jArrCreate, (i17 - 1) & i15, jArrCreate2);
                multiply(jArrCreate3, jArrCreate2, jArrCreate3);
            }
        }
        square(jArrCreate3, jArr2);
    }

    void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt = createExt();
        implMultiplyAcc(jArr, jArr2, jArrCreateExt);
        reduce(jArrCreateExt, jArr3);
    }

    void reduce(long[] jArr, long[] jArr2) {
        int i15 = 64 - (this.bits & 63);
        int i16 = this.size;
        Nat.shiftUpBits64(i16, jArr, i16, i15, jArr[i16 - 1], jArr2, 0);
        addTo(jArr, jArr2);
        int i17 = this.size - 1;
        jArr2[i17] = jArr2[i17] & ((-1) >>> i15);
    }

    void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt = createExt();
        implSquare(jArr, jArrCreateExt);
        reduce(jArrCreateExt, jArr2);
    }

    void squareN(long[] jArr, int i15, long[] jArr2) {
        if (i15 >= 64) {
            implPermute(jArr, i15, jArr2);
            return;
        }
        long[] jArrCreateExt = createExt();
        implSquare(jArr, jArrCreateExt);
        while (true) {
            reduce(jArrCreateExt, jArr2);
            i15--;
            if (i15 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt);
            }
        }
    }
}
