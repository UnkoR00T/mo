package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class FixedPointUtil {
    public static final String PRECOMP_NAME = "bc_fixed_point";

    public static int getCombSize(ECCurve eCCurve) {
        BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof FixedPointPreCompInfo) {
            return (FixedPointPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static FixedPointPreCompInfo precompute(final ECPoint eCPoint) {
        final ECCurve curve = eCPoint.getCurve();
        return (FixedPointPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.FixedPointUtil.1
            private boolean checkExisting(FixedPointPreCompInfo fixedPointPreCompInfo, int i15) {
                return fixedPointPreCompInfo != null && checkTable(fixedPointPreCompInfo.getLookupTable(), i15);
            }

            private boolean checkTable(ECLookupTable eCLookupTable, int i15) {
                return eCLookupTable != null && eCLookupTable.getSize() >= i15;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                FixedPointPreCompInfo fixedPointPreCompInfo = preCompInfo instanceof FixedPointPreCompInfo ? (FixedPointPreCompInfo) preCompInfo : null;
                int combSize = FixedPointUtil.getCombSize(curve);
                int i15 = combSize > 250 ? 6 : 5;
                int i16 = 1 << i15;
                if (checkExisting(fixedPointPreCompInfo, i16)) {
                    return fixedPointPreCompInfo;
                }
                int i17 = ((combSize + i15) - 1) / i15;
                ECPoint[] eCPointArr = new ECPoint[i15 + 1];
                eCPointArr[0] = eCPoint;
                for (int i18 = 1; i18 < i15; i18++) {
                    eCPointArr[i18] = eCPointArr[i18 - 1].timesPow2(i17);
                }
                eCPointArr[i15] = eCPointArr[0].subtract(eCPointArr[1]);
                curve.normalizeAll(eCPointArr);
                ECPoint[] eCPointArr2 = new ECPoint[i16];
                eCPointArr2[0] = eCPointArr[0];
                for (int i19 = i15 - 1; i19 >= 0; i19--) {
                    ECPoint eCPoint2 = eCPointArr[i19];
                    int i25 = 1 << i19;
                    for (int i26 = i25; i26 < i16; i26 += i25 << 1) {
                        eCPointArr2[i26] = eCPointArr2[i26 - i25].add(eCPoint2);
                    }
                }
                curve.normalizeAll(eCPointArr2);
                FixedPointPreCompInfo fixedPointPreCompInfo2 = new FixedPointPreCompInfo();
                fixedPointPreCompInfo2.setLookupTable(curve.createCacheSafeLookupTable(eCPointArr2, 0, i16));
                fixedPointPreCompInfo2.setOffset(eCPointArr[i15]);
                fixedPointPreCompInfo2.setWidth(i15);
                return fixedPointPreCompInfo2;
            }
        });
    }
}
