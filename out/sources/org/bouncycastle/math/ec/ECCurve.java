package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ECFieldElement f149293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ECFieldElement f149294b;
    protected BigInteger cofactor;
    protected FiniteField field;
    protected BigInteger order;
    protected int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    public static abstract class AbstractF2m extends ECCurve {

        /* JADX INFO: renamed from: si, reason: collision with root package name */
        private BigInteger[] f149295si;

        protected AbstractF2m(int i15, int i16, int i17, int i18) {
            super(buildField(i15, i16, i17, i18));
            this.f149295si = null;
            if (Properties.isOverrideSet("org.bouncycastle.ec.disable")) {
                throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable\"");
            }
            if (Properties.isOverrideSet("org.bouncycastle.ec.disable_f2m")) {
                throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable_f2m\"");
            }
        }

        private static FiniteField buildField(int i15, int i16, int i17, int i18) {
            if (i15 <= Properties.asInteger("org.bouncycastle.ec.max_f2m_field_size", 1142)) {
                return FiniteFields.getBinaryExtensionField((i17 | i18) == 0 ? new int[]{0, i16, i15} : new int[]{0, i16, i17, i18, i15});
            }
            throw new IllegalArgumentException("field size out of range: " + i15);
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, int i15) {
            BigInteger bigIntegerCreateRandomBigInteger;
            do {
                bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(i15, secureRandom);
            } while (bigIntegerCreateRandomBigInteger.signum() <= 0);
            return bigIntegerCreateRandomBigInteger;
        }

        public static BigInteger inverse(int i15, int[] iArr, BigInteger bigInteger) {
            return new LongArray(bigInteger).modInverse(i15, iArr).toBigInteger();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!eCFieldElementFromBigInteger.isZero()) {
                    eCFieldElementFromBigInteger2 = eCFieldElementFromBigInteger2.divide(eCFieldElementFromBigInteger).add(eCFieldElementFromBigInteger);
                } else if (!eCFieldElementFromBigInteger2.square().equals(getB())) {
                    throw new IllegalArgumentException();
                }
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementFromBigInteger2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint decompressPoint(int i15, BigInteger bigInteger) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            if (eCFieldElementFromBigInteger.isZero()) {
                eCFieldElementAdd = getB().sqrt();
            } else {
                ECFieldElement eCFieldElementSolveQuadraticEquation = solveQuadraticEquation(eCFieldElementFromBigInteger.square().invert().multiply(getB()).add(getA()).add(eCFieldElementFromBigInteger));
                if (eCFieldElementSolveQuadraticEquation != null) {
                    if (eCFieldElementSolveQuadraticEquation.testBitZero() != (i15 == 1)) {
                        eCFieldElementSolveQuadraticEquation = eCFieldElementSolveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElementAdd = (coordinateSystem == 5 || coordinateSystem == 6) ? eCFieldElementSolveQuadraticEquation.add(eCFieldElementFromBigInteger) : eCFieldElementSolveQuadraticEquation.multiply(eCFieldElementFromBigInteger);
                } else {
                    eCFieldElementAdd = null;
                }
            }
            if (eCFieldElementAdd != null) {
                return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementAdd);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        synchronized BigInteger[] getSi() {
            try {
                if (this.f149295si == null) {
                    this.f149295si = Tnaf.getSi(this);
                }
            } catch (Throwable th4) {
                throw th4;
            }
            return this.f149295si;
        }

        public boolean isKoblitz() {
            if (this.order == null || this.cofactor == null || !this.f149294b.isOne()) {
                return false;
            }
            return this.f149293a.isZero() || this.f149293a.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            return fromBigInteger(BigIntegers.createRandomBigInteger(getFieldSize(), secureRandom));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            int fieldSize = getFieldSize();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)));
        }

        protected ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement.AbstractF2m abstractF2m = (ECFieldElement.AbstractF2m) eCFieldElement;
            boolean zHasFastTrace = abstractF2m.hasFastTrace();
            if (zHasFastTrace && abstractF2m.trace() != 0) {
                return null;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                ECFieldElement eCFieldElementHalfTrace = abstractF2m.halfTrace();
                if (zHasFastTrace || eCFieldElementHalfTrace.square().add(eCFieldElementHalfTrace).add(eCFieldElement).isZero()) {
                    return eCFieldElementHalfTrace;
                }
                return null;
            }
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(ECConstants.ZERO);
            Random random = new Random();
            do {
                ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                ECFieldElement eCFieldElementAdd2 = eCFieldElement;
                eCFieldElementAdd = eCFieldElementFromBigInteger;
                for (int i15 = 1; i15 < fieldSize; i15++) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
                    eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElementSquare.multiply(eCFieldElementFromBigInteger2));
                    eCFieldElementAdd2 = eCFieldElementSquare.add(eCFieldElement);
                }
                if (!eCFieldElementAdd2.isZero()) {
                    return null;
                }
            } while (eCFieldElementAdd.square().add(eCFieldElementAdd).isZero());
            return eCFieldElementAdd;
        }
    }

    public static abstract class AbstractFp extends ECCurve {
        protected AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        private static BigInteger implRandomFieldElement(SecureRandom secureRandom, BigInteger bigInteger) {
            BigInteger bigIntegerCreateRandomBigInteger;
            do {
                bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
            } while (bigIntegerCreateRandomBigInteger.compareTo(bigInteger) >= 0);
            return bigIntegerCreateRandomBigInteger;
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
                if (bigIntegerCreateRandomBigInteger.signum() > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigInteger) < 0) {
                    return bigIntegerCreateRandomBigInteger;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint decompressPoint(int i15, BigInteger bigInteger) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.square().add(this.f149293a).multiply(eCFieldElementFromBigInteger).add(this.f149294b).sqrt();
            if (eCFieldElementSqrt == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (eCFieldElementSqrt.testBitZero() != (i15 == 1)) {
                eCFieldElementSqrt = eCFieldElementSqrt.negate();
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementSqrt);
        }

        public BigInteger getQ() {
            return getField().getCharacteristic();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getQ()) < 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            BigInteger q15 = getQ();
            return fromBigInteger(implRandomFieldElement(secureRandom, q15)).multiply(fromBigInteger(implRandomFieldElement(secureRandom, q15)));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            BigInteger q15 = getQ();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, q15)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, q15)));
        }
    }

    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        Config(int i15, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.coord = i15;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            if (!ECCurve.this.supportsCoordinateSystem(this.coord)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECCurve eCCurveCloneCurve = ECCurve.this.cloneCurve();
            if (eCCurveCloneCurve == ECCurve.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (eCCurveCloneCurve) {
                eCCurveCloneCurve.coord = this.coord;
                eCCurveCloneCurve.endomorphism = this.endomorphism;
                eCCurveCloneCurve.multiplier = this.multiplier;
            }
            return eCCurveCloneCurve;
        }

        public Config setCoordinateSystem(int i15) {
            this.coord = i15;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }
    }

    public static class F2m extends AbstractF2m {
        private static final int F2M_DEFAULT_COORDS = 6;
        private ECPoint.F2m infinity;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private int f149296k1;

        /* JADX INFO: renamed from: k2, reason: collision with root package name */
        private int f149297k2;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private int f149298k3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f149299m;

        @Deprecated
        public F2m(int i15, int i16, int i17, int i18, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i15, i16, i17, i18, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECCurve cloneCurve() {
            return new F2m(this.f149299m, this.f149296k1, this.f149297k2, this.f149298k3, this.f149293a, this.f149294b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i15, final int i16) {
            final int i17 = (this.f149299m + 63) >>> 6;
            final int[] iArr = isTrinomial() ? new int[]{this.f149296k1} : new int[]{this.f149296k1, this.f149297k2, this.f149298k3};
            final long[] jArr = new long[i16 * i17 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                ECPoint eCPoint = eCPointArr[i15 + i19];
                ((ECFieldElement.F2m) eCPoint.getRawXCoord()).f149304x.copyTo(jArr, i18);
                int i25 = i18 + i17;
                ((ECFieldElement.F2m) eCPoint.getRawYCoord()).f149304x.copyTo(jArr, i25);
                i18 = i25 + i17;
            }
            return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.F2m.1
                private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                    return F2m.this.createRawPoint(new ECFieldElement.F2m(F2m.this.f149299m, iArr, new LongArray(jArr2)), new ECFieldElement.F2m(F2m.this.f149299m, iArr, new LongArray(jArr3)));
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public int getSize() {
                    return i16;
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookup(int i26) {
                    int i27;
                    long[] jArrCreate64 = Nat.create64(i17);
                    long[] jArrCreate65 = Nat.create64(i17);
                    int i28 = 0;
                    for (int i29 = 0; i29 < i16; i29++) {
                        long j15 = ((i29 ^ i26) - 1) >> 31;
                        int i35 = 0;
                        while (true) {
                            i27 = i17;
                            if (i35 < i27) {
                                long j16 = jArrCreate64[i35];
                                long[] jArr2 = jArr;
                                jArrCreate64[i35] = j16 ^ (jArr2[i28 + i35] & j15);
                                jArrCreate65[i35] = jArrCreate65[i35] ^ (jArr2[(i27 + i28) + i35] & j15);
                                i35++;
                            }
                        }
                        i28 += i27 * 2;
                    }
                    return createPoint(jArrCreate64, jArrCreate65);
                }

                @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookupVar(int i26) {
                    long[] jArrCreate64 = Nat.create64(i17);
                    long[] jArrCreate65 = Nat.create64(i17);
                    int i27 = i26 * i17 * 2;
                    int i28 = 0;
                    while (true) {
                        int i29 = i17;
                        if (i28 >= i29) {
                            return createPoint(jArrCreate64, jArrCreate65);
                        }
                        long[] jArr2 = jArr;
                        jArrCreate64[i28] = jArr2[i27 + i28];
                        jArrCreate65[i28] = jArr2[i29 + i27 + i28];
                        i28++;
                    }
                }
            };
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECMultiplier createDefaultMultiplier() {
            return isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0) {
                int iBitLength = bigInteger.bitLength();
                int i15 = this.f149299m;
                if (iBitLength <= i15) {
                    int i16 = this.f149297k2;
                    int i17 = this.f149298k3;
                    return new ECFieldElement.F2m(i15, (i16 | i17) == 0 ? new int[]{this.f149296k1} : new int[]{this.f149296k1, i16, i17}, new LongArray(bigInteger));
                }
            }
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f149299m;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public int getK1() {
            return this.f149296k1;
        }

        public int getK2() {
            return this.f149297k2;
        }

        public int getK3() {
            return this.f149298k3;
        }

        public int getM() {
            return this.f149299m;
        }

        public boolean isTrinomial() {
            return this.f149297k2 == 0 && this.f149298k3 == 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i15) {
            return i15 == 0 || i15 == 1 || i15 == 6;
        }

        public F2m(int i15, int i16, int i17, int i18, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i15, i16, i17, i18);
            this.f149299m = i15;
            this.f149296k1 = i16;
            this.f149297k2 = i17;
            this.f149298k3 = i18;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f149293a = fromBigInteger(bigInteger);
            this.f149294b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        protected F2m(int i15, int i16, int i17, int i18, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i15, i16, i17, i18);
            this.f149299m = i15;
            this.f149296k1 = i16;
            this.f149297k2 = i17;
            this.f149298k3 = i18;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f149293a = eCFieldElement;
            this.f149294b = eCFieldElement2;
            this.coord = 6;
        }

        @Deprecated
        public F2m(int i15, int i16, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i15, i16, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i15, int i16, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i15, i16, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    public static class Fp extends AbstractFp {
        private static final int FP_DEFAULT_COORDS = 4;
        private static final Set<BigInteger> knownQs = Collections.synchronizedSet(new HashSet());
        private static final BigIntegers.Cache validatedQs = new BigIntegers.Cache();
        ECPoint.Fp infinity;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        BigInteger f149300q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        BigInteger f149301r;

        @Deprecated
        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECCurve cloneCurve() {
            return new Fp(this.f149300q, this.f149301r, this.f149293a, this.f149294b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(this.f149300q) >= 0) {
                throw new IllegalArgumentException("x value invalid for Fp field element");
            }
            return new ECFieldElement.Fp(this.f149300q, this.f149301r, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f149300q.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp
        public BigInteger getQ() {
            return this.f149300q;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.Fp(this, fromBigInteger(eCPoint.f149308x.toBigInteger()), fromBigInteger(eCPoint.f149309y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.f149310zs[0].toBigInteger())});
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i15) {
            return i15 == 0 || i15 == 1 || i15 == 2 || i15 == 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, false);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, boolean z15) {
            super(bigInteger);
            if (z15) {
                knownQs.add(bigInteger);
            } else if (!knownQs.contains(bigInteger)) {
                BigIntegers.Cache cache = validatedQs;
                if (!cache.contains(bigInteger)) {
                    int iAsInteger = Properties.asInteger("org.bouncycastle.ec.fp_max_size", 1042);
                    int iAsInteger2 = Properties.asInteger("org.bouncycastle.ec.fp_certainty", 100);
                    int iBitLength = bigInteger.bitLength();
                    if (iAsInteger < iBitLength) {
                        throw new IllegalArgumentException("Fp q value out of range");
                    }
                    if (Primes.hasAnySmallFactors(bigInteger) || !Primes.isMRProbablePrime(bigInteger, CryptoServicesRegistrar.getSecureRandom(), ECCurve.getNumberOfIterations(iBitLength, iAsInteger2))) {
                        throw new IllegalArgumentException("Fp q value not prime");
                    }
                    cache.add(bigInteger);
                }
            }
            this.f149300q = bigInteger;
            this.f149301r = ECFieldElement.Fp.calculateResidue(bigInteger);
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f149293a = fromBigInteger(bigInteger2);
            this.f149294b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        protected Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f149300q = bigInteger;
            this.f149301r = bigInteger2;
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f149293a = eCFieldElement;
            this.f149294b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    protected ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfIterations(int i15, int i16) {
        if (i15 >= 1536) {
            if (i16 <= 100) {
                return 3;
            }
            if (i16 <= 128) {
                return 4;
            }
            return ((i16 - 127) / 2) + 4;
        }
        if (i15 >= 1024) {
            if (i16 <= 100) {
                return 4;
            }
            if (i16 <= 112) {
                return 5;
            }
            return ((i16 - 111) / 2) + 5;
        }
        if (i15 < 512) {
            if (i16 <= 80) {
                return 40;
            }
            return ((i16 - 79) / 2) + 40;
        }
        if (i16 <= 80) {
            return 5;
        }
        if (i16 <= 100) {
            return 7;
        }
        return ((i16 - 99) / 2) + 7;
    }

    protected void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    protected void checkPoints(ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    protected abstract ECCurve cloneCurve();

    public synchronized Config configure() {
        return new Config(this.coord, this.endomorphism, this.multiplier);
    }

    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i15, final int i16) {
        final int fieldElementEncodingLength = getFieldElementEncodingLength();
        final byte[] bArr = new byte[i16 * fieldElementEncodingLength * 2];
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            ECPoint eCPoint = eCPointArr[i15 + i18];
            eCPoint.getRawXCoord().encodeTo(bArr, i17);
            int i19 = i17 + fieldElementEncodingLength;
            eCPoint.getRawYCoord().encodeTo(bArr, i19);
            i17 = i19 + fieldElementEncodingLength;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.1
            private ECPoint createPoint(byte[] bArr2, byte[] bArr3) {
                ECCurve eCCurve = ECCurve.this;
                return eCCurve.createRawPoint(eCCurve.fromBigInteger(new BigInteger(1, bArr2)), ECCurve.this.fromBigInteger(new BigInteger(1, bArr3)));
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i16;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i25) {
                int i26;
                int i27 = fieldElementEncodingLength;
                byte[] bArr2 = new byte[i27];
                byte[] bArr3 = new byte[i27];
                int i28 = 0;
                for (int i29 = 0; i29 < i16; i29++) {
                    int i35 = ((i29 ^ i25) - 1) >> 31;
                    int i36 = 0;
                    while (true) {
                        i26 = fieldElementEncodingLength;
                        if (i36 < i26) {
                            byte b15 = bArr2[i36];
                            byte[] bArr4 = bArr;
                            bArr2[i36] = (byte) (b15 ^ (bArr4[i28 + i36] & i35));
                            bArr3[i36] = (byte) ((bArr4[(i26 + i28) + i36] & i35) ^ bArr3[i36]);
                            i36++;
                        }
                    }
                    i28 += i26 * 2;
                }
                return createPoint(bArr2, bArr3);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i25) {
                int i26 = fieldElementEncodingLength;
                byte[] bArr2 = new byte[i26];
                byte[] bArr3 = new byte[i26];
                int i27 = i25 * i26 * 2;
                int i28 = 0;
                while (true) {
                    int i29 = fieldElementEncodingLength;
                    if (i28 >= i29) {
                        return createPoint(bArr2, bArr3);
                    }
                    byte[] bArr4 = bArr;
                    bArr2[i28] = bArr4[i27 + i28];
                    bArr3[i28] = bArr4[i29 + i27 + i28];
                    i28++;
                }
            }
        };
    }

    protected ECMultiplier createDefaultMultiplier() {
        ECEndomorphism eCEndomorphism = this.endomorphism;
        return eCEndomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism) : new WNafL2RMultiplier();
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    protected abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2);

    protected abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr);

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldElementEncodingLength = getFieldElementEncodingLength();
        byte b15 = bArr[0];
        if (b15 != 0) {
            if (b15 == 2 || b15 == 3) {
                if (bArr.length != fieldElementEncodingLength + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                infinity = decompressPoint(b15 & 1, BigIntegers.fromUnsignedByteArray(bArr, 1, fieldElementEncodingLength));
                if (!infinity.implIsValid(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b15 != 4) {
                if (b15 != 6 && b15 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b15, 16));
                }
                if (bArr.length != (fieldElementEncodingLength * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 1, fieldElementEncodingLength);
                BigInteger bigIntegerFromUnsignedByteArray2 = BigIntegers.fromUnsignedByteArray(bArr, fieldElementEncodingLength + 1, fieldElementEncodingLength);
                if (bigIntegerFromUnsignedByteArray2.testBit(0) != (b15 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                infinity = validatePoint(bigIntegerFromUnsignedByteArray, bigIntegerFromUnsignedByteArray2);
            } else {
                if (bArr.length != (fieldElementEncodingLength * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                infinity = validatePoint(BigIntegers.fromUnsignedByteArray(bArr, 1, fieldElementEncodingLength), BigIntegers.fromUnsignedByteArray(bArr, fieldElementEncodingLength + 1, fieldElementEncodingLength));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            infinity = getInfinity();
        }
        if (b15 == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    protected abstract ECPoint decompressPoint(int i15, BigInteger bigInteger);

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ECCurve) && equals((ECCurve) obj);
        }
        return true;
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f149293a;
    }

    public int getAffinePointEncodingLength(boolean z15) {
        int fieldElementEncodingLength = getFieldElementEncodingLength();
        return z15 ? fieldElementEncodingLength + 1 : (fieldElementEncodingLength * 2) + 1;
    }

    public ECFieldElement getB() {
        return this.f149294b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public FiniteField getField() {
        return this.field;
    }

    public int getFieldElementEncodingLength() {
        return (getFieldSize() + 7) / 8;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public ECMultiplier getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        Hashtable hashtable;
        PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            preCompInfo = (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return createPoint(eCPointNormalize.getXCoord().toBigInteger(), eCPointNormalize.getYCoord().toBigInteger());
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public PreCompInfo precompute(ECPoint eCPoint, String str, PreCompCallback preCompCallback) {
        Hashtable hashtable;
        PreCompInfo preCompInfoPrecompute;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            try {
                hashtable = eCPoint.preCompTable;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    eCPoint.preCompTable = hashtable;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        synchronized (hashtable) {
            try {
                PreCompInfo preCompInfo = (PreCompInfo) hashtable.get(str);
                preCompInfoPrecompute = preCompCallback.precompute(preCompInfo);
                if (preCompInfoPrecompute != preCompInfo) {
                    hashtable.put(str, preCompInfoPrecompute);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return preCompInfoPrecompute;
    }

    public abstract ECFieldElement randomFieldElement(SecureRandom secureRandom);

    public abstract ECFieldElement randomFieldElementMult(SecureRandom secureRandom);

    public boolean supportsCoordinateSystem(int i15) {
        return i15 == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint eCPointCreatePoint = createPoint(bigInteger, bigInteger2);
        if (eCPointCreatePoint.isValid()) {
            return eCPointCreatePoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    protected void checkPoints(ECPoint[] eCPointArr, int i15, int i16) {
        if (eCPointArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i15 < 0 || i16 < 0 || i15 > eCPointArr.length - i16) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i17 = 0; i17 < i16; i17++) {
            ECPoint eCPoint = eCPointArr[i15 + i17];
            if (eCPoint != null && this != eCPoint.getCurve()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public boolean equals(ECCurve eCCurve) {
        if (this != eCCurve) {
            return eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger());
        }
        return true;
    }

    public void normalizeAll(ECPoint[] eCPointArr, int i15, int i16, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i15, i16);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i16];
        int[] iArr = new int[i16];
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = i15 + i18;
            ECPoint eCPoint = eCPointArr[i19];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i17] = eCPoint.getZCoord(0);
                iArr[i17] = i19;
                i17++;
            }
        }
        if (i17 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i17, eCFieldElement);
        for (int i25 = 0; i25 < i17; i25++) {
            int i26 = iArr[i25];
            eCPointArr[i26] = eCPointArr[i26].normalize(eCFieldElementArr[i25]);
        }
    }
}
