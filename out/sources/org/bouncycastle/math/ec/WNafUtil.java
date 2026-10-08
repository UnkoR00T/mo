package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class WNafUtil {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];
    private static final int MAX_WIDTH = 16;
    public static final String PRECOMP_NAME = "bc_wnaf";

    public static void configureBasepoint(ECPoint eCPoint) {
        ECCurve curve = eCPoint.getCurve();
        if (curve == null) {
            return;
        }
        BigInteger order = curve.getOrder();
        final int iMin = Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3);
        curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                if (wNafPreCompInfo != null && wNafPreCompInfo.getConfWidth() == iMin) {
                    wNafPreCompInfo.setPromotionCountdown(0);
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                wNafPreCompInfo2.setPromotionCountdown(0);
                wNafPreCompInfo2.setConfWidth(iMin);
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPreComp(wNafPreCompInfo.getPreComp());
                    wNafPreCompInfo2.setPreCompNeg(wNafPreCompInfo.getPreCompNeg());
                    wNafPreCompInfo2.setTwice(wNafPreCompInfo.getTwice());
                    wNafPreCompInfo2.setWidth(wNafPreCompInfo.getWidth());
                }
                return wNafPreCompInfo2;
            }
        });
    }

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i15 = iBitLength >> 1;
        int[] iArr = new int[i15];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i16 = iBitLength - 1;
        int i17 = 0;
        int i18 = 1;
        int i19 = 0;
        while (i18 < i16) {
            if (bigIntegerXor.testBit(i18)) {
                iArr[i17] = i19 | ((bigInteger.testBit(i18) ? -1 : 1) << 16);
                i18++;
                i19 = 1;
                i17++;
            } else {
                i19++;
            }
            i18++;
        }
        int i25 = i17 + 1;
        iArr[i17] = 65536 | i19;
        return i15 > i25 ? trim(iArr, i25) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i15, BigInteger bigInteger) {
        if (i15 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i15 < 2 || i15 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int iBitLength = (bigInteger.bitLength() / i15) + 1;
        int[] iArr = new int[iBitLength];
        int i16 = 1 << i15;
        int i17 = i16 - 1;
        int i18 = i16 >>> 1;
        int i19 = 0;
        int i25 = 0;
        boolean z15 = false;
        while (i19 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i19) == z15) {
                i19++;
            } else {
                bigInteger = bigInteger.shiftRight(i19);
                int iIntValue = bigInteger.intValue() & i17;
                if (z15) {
                    iIntValue++;
                }
                z15 = (iIntValue & i18) != 0;
                if (z15) {
                    iIntValue -= i16;
                }
                if (i25 > 0) {
                    i19--;
                }
                iArr[i25] = i19 | (iIntValue << 16);
                i19 = i15;
                i25++;
            }
        }
        return iBitLength > i25 ? trim(iArr, i25) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int iMax = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[iMax];
        BigInteger bigIntegerShiftRight = bigInteger;
        BigInteger bigIntegerShiftRight2 = bigInteger2;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if ((i15 | i16) == 0 && bigIntegerShiftRight.bitLength() <= i17 && bigIntegerShiftRight2.bitLength() <= i17) {
                break;
            }
            int iIntValue = (bigIntegerShiftRight.intValue() >>> i17) + i15;
            int i19 = iIntValue & 7;
            int iIntValue2 = (bigIntegerShiftRight2.intValue() >>> i17) + i16;
            int i25 = iIntValue2 & 7;
            int i26 = iIntValue & 1;
            if (i26 != 0) {
                i26 -= iIntValue & 2;
                if (i19 + i26 == 4 && (iIntValue2 & 3) == 2) {
                    i26 = -i26;
                }
            }
            int i27 = iIntValue2 & 1;
            if (i27 != 0) {
                i27 -= iIntValue2 & 2;
                if (i25 + i27 == 4 && (iIntValue & 3) == 2) {
                    i27 = -i27;
                }
            }
            if ((i15 << 1) == i26 + 1) {
                i15 ^= 1;
            }
            if ((i16 << 1) == i27 + 1) {
                i16 ^= 1;
            }
            i17++;
            if (i17 == 30) {
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(30);
                bigIntegerShiftRight2 = bigIntegerShiftRight2.shiftRight(30);
                i17 = 0;
            }
            bArr[i18] = (byte) ((i27 & 15) | (i26 << 4));
            i18++;
        }
        return iMax > i18 ? trim(bArr, i18) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i15 = iBitLength - 1;
        byte[] bArr = new byte[i15];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i16 = 1;
        while (i16 < i15) {
            if (bigIntegerXor.testBit(i16)) {
                bArr[i16 - 1] = (byte) (bigInteger.testBit(i16) ? -1 : 1);
                i16++;
            }
            i16++;
        }
        bArr[iBitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i15, BigInteger bigInteger) {
        if (i15 == 2) {
            return generateNaf(bigInteger);
        }
        if (i15 < 2 || i15 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i16 = 1 << i15;
        int i17 = i16 - 1;
        int i18 = i16 >>> 1;
        int i19 = 0;
        int i25 = 0;
        boolean z15 = false;
        while (i19 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i19) == z15) {
                i19++;
            } else {
                bigInteger = bigInteger.shiftRight(i19);
                int iIntValue = bigInteger.intValue() & i17;
                if (z15) {
                    iIntValue++;
                }
                z15 = (iIntValue & i18) != 0;
                if (z15) {
                    iIntValue -= i16;
                }
                if (i25 > 0) {
                    i19--;
                }
                int i26 = i25 + i19;
                bArr[i26] = (byte) iIntValue;
                i25 = i26 + 1;
                i19 = i15;
            }
        }
        return iBitLength > i25 ? trim(bArr, i25) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, PRECOMP_NAME));
    }

    public static int getWindowSize(int i15) {
        return getWindowSize(i15, DEFAULT_WINDOW_SIZE_CUTOFFS, 16);
    }

    public static WNafPreCompInfo precompute(final ECPoint eCPoint, final int i15, final boolean z15) {
        final ECCurve curve = eCPoint.getCurve();
        return (WNafPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.2
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo, int i16, int i17, boolean z16) {
                if (wNafPreCompInfo == null || wNafPreCompInfo.getWidth() < Math.max(wNafPreCompInfo.getConfWidth(), i16) || !checkTable(wNafPreCompInfo.getPreComp(), i17)) {
                    return false;
                }
                return !z16 || checkTable(wNafPreCompInfo.getPreCompNeg(), i17);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i16) {
                return eCPointArr != null && eCPointArr.length >= i16;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x00ef A[PHI: r14
              0x00ef: PHI (r14v6 org.bouncycastle.math.ec.ECPoint) = 
              (r14v4 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
              (r14v9 org.bouncycastle.math.ec.ECPoint)
             binds: [B:28:0x0091, B:30:0x009d, B:32:0x00a5, B:34:0x00af, B:40:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                ECPoint eCPointTwice;
                ECPoint[] eCPointArrResizeTable;
                ECPoint[] eCPointArrResizeTable2;
                int length;
                int i16;
                ECPoint eCPointCreatePoint;
                int coordinateSystem;
                ECFieldElement zCoord = null;
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int iMax = Math.max(2, Math.min(16, i15));
                if (checkExisting(wNafPreCompInfo, iMax, 1 << (iMax - 2), z15)) {
                    wNafPreCompInfo.decrementPromotionCountdown();
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPromotionCountdown(wNafPreCompInfo.decrementPromotionCountdown());
                    wNafPreCompInfo2.setConfWidth(wNafPreCompInfo.getConfWidth());
                    eCPointArrResizeTable = wNafPreCompInfo.getPreComp();
                    eCPointArrResizeTable2 = wNafPreCompInfo.getPreCompNeg();
                    eCPointTwice = wNafPreCompInfo.getTwice();
                } else {
                    eCPointTwice = null;
                    eCPointArrResizeTable = null;
                    eCPointArrResizeTable2 = null;
                }
                int iMin = Math.min(16, Math.max(wNafPreCompInfo2.getConfWidth(), iMax));
                int i17 = 1 << (iMin - 2);
                int length2 = 0;
                if (eCPointArrResizeTable == null) {
                    eCPointArrResizeTable = WNafUtil.EMPTY_POINTS;
                    length = 0;
                } else {
                    length = eCPointArrResizeTable.length;
                }
                if (length < i17) {
                    eCPointArrResizeTable = WNafUtil.resizeTable(eCPointArrResizeTable, i17);
                    if (i17 == 1) {
                        eCPointArrResizeTable[0] = eCPoint.normalize();
                    } else {
                        if (length == 0) {
                            eCPointArrResizeTable[0] = eCPoint;
                            i16 = 1;
                        } else {
                            i16 = length;
                        }
                        if (i17 == 2) {
                            eCPointArrResizeTable[1] = eCPoint.threeTimes();
                        } else {
                            ECPoint eCPointAdd = eCPointArrResizeTable[i16 - 1];
                            if (eCPointTwice == null) {
                                eCPointTwice = eCPointArrResizeTable[0].twice();
                                if (eCPointTwice.isInfinity() || !ECAlgorithms.isFpCurve(curve) || curve.getFieldSize() < 64 || !((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                                    eCPointCreatePoint = eCPointTwice;
                                } else {
                                    zCoord = eCPointTwice.getZCoord(0);
                                    eCPointCreatePoint = curve.createPoint(eCPointTwice.getXCoord().toBigInteger(), eCPointTwice.getYCoord().toBigInteger());
                                    ECFieldElement eCFieldElementSquare = zCoord.square();
                                    eCPointAdd = eCPointAdd.scaleX(eCFieldElementSquare).scaleY(eCFieldElementSquare.multiply(zCoord));
                                    if (length == 0) {
                                        eCPointArrResizeTable[0] = eCPointAdd;
                                    }
                                }
                            } else {
                                eCPointCreatePoint = eCPointTwice;
                            }
                            while (i16 < i17) {
                                eCPointAdd = eCPointAdd.add(eCPointCreatePoint);
                                eCPointArrResizeTable[i16] = eCPointAdd;
                                i16++;
                            }
                        }
                        curve.normalizeAll(eCPointArrResizeTable, length, i17 - length, zCoord);
                    }
                }
                if (z15) {
                    if (eCPointArrResizeTable2 == null) {
                        eCPointArrResizeTable2 = new ECPoint[i17];
                    } else {
                        length2 = eCPointArrResizeTable2.length;
                        if (length2 < i17) {
                            eCPointArrResizeTable2 = WNafUtil.resizeTable(eCPointArrResizeTable2, i17);
                        }
                    }
                    while (length2 < i17) {
                        eCPointArrResizeTable2[length2] = eCPointArrResizeTable[length2].negate();
                        length2++;
                    }
                }
                wNafPreCompInfo2.setPreComp(eCPointArrResizeTable);
                wNafPreCompInfo2.setPreCompNeg(eCPointArrResizeTable2);
                wNafPreCompInfo2.setTwice(eCPointTwice);
                wNafPreCompInfo2.setWidth(iMin);
                return wNafPreCompInfo2;
            }
        });
    }

    public static WNafPreCompInfo precomputeWithPointMap(ECPoint eCPoint, final ECPointMap eCPointMap, final WNafPreCompInfo wNafPreCompInfo, final boolean z15) {
        return (WNafPreCompInfo) eCPoint.getCurve().precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.3
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo2, int i15, int i16, boolean z16) {
                if (wNafPreCompInfo2 == null || wNafPreCompInfo2.getWidth() < i15 || !checkTable(wNafPreCompInfo2.getPreComp(), i16)) {
                    return false;
                }
                return !z16 || checkTable(wNafPreCompInfo2.getPreCompNeg(), i16);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i15) {
                return eCPointArr != null && eCPointArr.length >= i15;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo2 = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int width = wNafPreCompInfo.getWidth();
                if (checkExisting(wNafPreCompInfo2, width, wNafPreCompInfo.getPreComp().length, z15)) {
                    wNafPreCompInfo2.decrementPromotionCountdown();
                    return wNafPreCompInfo2;
                }
                WNafPreCompInfo wNafPreCompInfo3 = new WNafPreCompInfo();
                wNafPreCompInfo3.setPromotionCountdown(wNafPreCompInfo.getPromotionCountdown());
                ECPoint twice = wNafPreCompInfo.getTwice();
                if (twice != null) {
                    wNafPreCompInfo3.setTwice(eCPointMap.map(twice));
                }
                ECPoint[] preComp = wNafPreCompInfo.getPreComp();
                int length = preComp.length;
                ECPoint[] eCPointArr = new ECPoint[length];
                for (int i15 = 0; i15 < preComp.length; i15++) {
                    eCPointArr[i15] = eCPointMap.map(preComp[i15]);
                }
                wNafPreCompInfo3.setPreComp(eCPointArr);
                wNafPreCompInfo3.setWidth(width);
                if (z15) {
                    ECPoint[] eCPointArr2 = new ECPoint[length];
                    for (int i16 = 0; i16 < length; i16++) {
                        eCPointArr2[i16] = eCPointArr[i16].negate();
                    }
                    wNafPreCompInfo3.setPreCompNeg(eCPointArr2);
                }
                return wNafPreCompInfo3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i15) {
        ECPoint[] eCPointArr2 = new ECPoint[i15];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i15) {
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        return bArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof WNafPreCompInfo) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static int getWindowSize(int i15, int i16) {
        return getWindowSize(i15, DEFAULT_WINDOW_SIZE_CUTOFFS, i16);
    }

    private static int[] trim(int[] iArr, int i15) {
        int[] iArr2 = new int[i15];
        System.arraycopy(iArr, 0, iArr2, 0, i15);
        return iArr2;
    }

    public static int getWindowSize(int i15, int[] iArr) {
        return getWindowSize(i15, iArr, 16);
    }

    public static int getWindowSize(int i15, int[] iArr, int i16) {
        int i17 = 0;
        while (i17 < iArr.length && i15 >= iArr[i17]) {
            i17++;
        }
        return Math.max(2, Math.min(i16, i17 + 2));
    }
}
