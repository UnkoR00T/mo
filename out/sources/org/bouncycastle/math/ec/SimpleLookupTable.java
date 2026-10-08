package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes5.dex */
public class SimpleLookupTable extends AbstractECLookupTable {
    private final ECPoint[] points;

    public SimpleLookupTable(ECPoint[] eCPointArr, int i15, int i16) {
        this.points = copy(eCPointArr, i15, i16);
    }

    private static ECPoint[] copy(ECPoint[] eCPointArr, int i15, int i16) {
        ECPoint[] eCPointArr2 = new ECPoint[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            eCPointArr2[i17] = eCPointArr[i15 + i17];
        }
        return eCPointArr2;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public int getSize() {
        return this.points.length;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookup(int i15) {
        throw new UnsupportedOperationException("Constant-time lookup not supported");
    }

    @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i15) {
        return this.points[i15];
    }
}
