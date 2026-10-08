package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class SecT239K1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT239K1_AFFINE_ZS = {new SecT239FieldElement(ECConstants.ONE)};
    private static final int SECT239K1_DEFAULT_COORDS = 6;
    protected SecT239K1Point infinity;

    public SecT239K1Curve() {
        super(239, 158, 0, 0);
        this.infinity = new SecT239K1Point(this, null, null);
        this.f149293a = fromBigInteger(BigInteger.valueOf(0L));
        this.f149294b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decodeStrict("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECCurve cloneCurve() {
        return new SecT239K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i15, final int i16) {
        final long[] jArr = new long[i16 * 8];
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            ECPoint eCPoint = eCPointArr[i15 + i18];
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawXCoord()).f149345x, 0, jArr, i17);
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawYCoord()).f149345x, 0, jArr, i17 + 4);
            i17 += 8;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT239K1Curve.this.createRawPoint(new SecT239FieldElement(jArr2), new SecT239FieldElement(jArr3), SecT239K1Curve.SECT239K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i16;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i19) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate65 = Nat256.create64();
                int i25 = 0;
                for (int i26 = 0; i26 < i16; i26++) {
                    long j15 = ((i26 ^ i19) - 1) >> 31;
                    for (int i27 = 0; i27 < 4; i27++) {
                        long j16 = jArrCreate64[i27];
                        long[] jArr2 = jArr;
                        jArrCreate64[i27] = j16 ^ (jArr2[i25 + i27] & j15);
                        jArrCreate65[i27] = jArrCreate65[i27] ^ (jArr2[(i25 + 4) + i27] & j15);
                    }
                    i25 += 8;
                }
                return createPoint(jArrCreate64, jArrCreate65);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i19) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate65 = Nat256.create64();
                int i25 = i19 * 8;
                for (int i26 = 0; i26 < 4; i26++) {
                    long[] jArr2 = jArr;
                    jArrCreate64[i26] = jArr2[i25 + i26];
                    jArrCreate65[i26] = jArr2[4 + i25 + i26];
                }
                return createPoint(jArrCreate64, jArrCreate65);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT239FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i15) {
        return i15 == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
