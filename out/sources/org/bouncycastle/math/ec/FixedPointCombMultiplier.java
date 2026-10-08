package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes5.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = fixedPointPreCompInfoPrecompute.getLookupTable();
        int width = fixedPointPreCompInfoPrecompute.getWidth();
        int i15 = ((combSize + width) - 1) / width;
        ECPoint infinity = curve.getInfinity();
        int i16 = width * i15;
        int[] iArrFromBigInteger = Nat.fromBigInteger(i16, bigInteger);
        int i17 = i16 - 1;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = 0;
            for (int i25 = i17 - i18; i25 >= 0; i25 -= i15) {
                int i26 = iArrFromBigInteger[i25 >>> 5] >>> (i25 & 31);
                i19 = ((i19 ^ (i26 >>> 1)) << 1) ^ i26;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i19));
        }
        return infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
    }
}
