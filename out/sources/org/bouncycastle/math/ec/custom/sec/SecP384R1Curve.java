package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class SecP384R1Curve extends ECCurve.AbstractFp {
    private static final int SECP384R1_DEFAULT_COORDS = 2;
    protected SecP384R1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f149336q = SecP384R1FieldElement.Q;
    private static final ECFieldElement[] SECP384R1_AFFINE_ZS = {new SecP384R1FieldElement(ECConstants.ONE)};

    public SecP384R1Curve() {
        super(f149336q);
        this.infinity = new SecP384R1Point(this, null, null);
        this.f149293a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f149294b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECCurve cloneCurve() {
        return new SecP384R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i15, final int i16) {
        final int[] iArr = new int[i16 * 24];
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            ECPoint eCPoint = eCPointArr[i15 + i18];
            Nat.copy(12, ((SecP384R1FieldElement) eCPoint.getRawXCoord()).f149337x, 0, iArr, i17);
            Nat.copy(12, ((SecP384R1FieldElement) eCPoint.getRawYCoord()).f149337x, 0, iArr, i17 + 12);
            i17 += 24;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP384R1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP384R1Curve.this.createRawPoint(new SecP384R1FieldElement(iArr2), new SecP384R1FieldElement(iArr3), SecP384R1Curve.SECP384R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i16;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i19) {
                int[] iArrCreate = Nat.create(12);
                int[] iArrCreate2 = Nat.create(12);
                int i25 = 0;
                for (int i26 = 0; i26 < i16; i26++) {
                    int i27 = ((i26 ^ i19) - 1) >> 31;
                    for (int i28 = 0; i28 < 12; i28++) {
                        int i29 = iArrCreate[i28];
                        int[] iArr2 = iArr;
                        iArrCreate[i28] = i29 ^ (iArr2[i25 + i28] & i27);
                        iArrCreate2[i28] = iArrCreate2[i28] ^ (iArr2[(i25 + 12) + i28] & i27);
                    }
                    i25 += 24;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i19) {
                int[] iArrCreate = Nat.create(12);
                int[] iArrCreate2 = Nat.create(12);
                int i25 = i19 * 24;
                for (int i26 = 0; i26 < 12; i26++) {
                    int[] iArr2 = iArr;
                    iArrCreate[i26] = iArr2[i25 + i26];
                    iArrCreate2[i26] = iArr2[i25 + 12 + i26];
                }
                return createPoint(iArrCreate, iArrCreate2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP384R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP384R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f149336q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp
    public BigInteger getQ() {
        return f149336q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.random(secureRandom, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat.create(12);
        SecP384R1Field.randomMult(secureRandom, iArrCreate);
        return new SecP384R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i15) {
        return i15 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP384R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
