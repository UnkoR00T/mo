package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupCiphertext {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    BigInteger f149025e;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    BigInteger f149026u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    BigInteger f149027u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    BigInteger f149028v;

    public CramerShoupCiphertext() {
    }

    public BigInteger getE() {
        return this.f149025e;
    }

    public BigInteger getU1() {
        return this.f149026u1;
    }

    public BigInteger getU2() {
        return this.f149027u2;
    }

    public BigInteger getV() {
        return this.f149028v;
    }

    public void setE(BigInteger bigInteger) {
        this.f149025e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f149026u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f149027u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f149028v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f149026u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f149027u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f149025e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f149028v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i15 = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i15, length2);
        int i16 = i15 + length2;
        Pack.intToBigEndian(length3, bArr, i16);
        int i17 = i16 + 4;
        System.arraycopy(byteArray3, 0, bArr, i17, length3);
        int i18 = i17 + length3;
        Pack.intToBigEndian(length4, bArr, i18);
        System.arraycopy(byteArray4, 0, bArr, i18 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("u1: " + this.f149026u1.toString());
        sb5.append("\nu2: " + this.f149027u2.toString());
        sb5.append("\ne: " + this.f149025e.toString());
        sb5.append("\nv: " + this.f149028v.toString());
        return sb5.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f149026u1 = bigInteger;
        this.f149027u2 = bigInteger2;
        this.f149025e = bigInteger3;
        this.f149028v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i15 = 4 + iBigEndianToInt;
        this.f149026u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i15));
        int i16 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i15) + i16;
        this.f149027u2 = new BigInteger(Arrays.copyOfRange(bArr, i16, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i17 = iBigEndianToInt2 + 4;
        int i18 = iBigEndianToInt3 + i17;
        this.f149025e = new BigInteger(Arrays.copyOfRange(bArr, i17, i18));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i18);
        int i19 = i18 + 4;
        this.f149028v = new BigInteger(Arrays.copyOfRange(bArr, i19, iBigEndianToInt4 + i19));
    }
}
