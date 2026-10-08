package org.bouncycastle.pqc.crypto.mldsa;

/* JADX INFO: loaded from: classes5.dex */
class PolyVecK {
    private final Poly[] vec;

    PolyVecK(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.vec = new Poly[dilithiumK];
        for (int i15 = 0; i15 < dilithiumK; i15++) {
            this.vec[i15] = new Poly(mLDSAEngine);
        }
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).addPoly(polyVecK.getVectorIndex(i15));
        }
    }

    public boolean checkNorm(int i15) {
        for (int i16 = 0; i16 < this.vec.length; i16++) {
            if (getVectorIndex(i16).checkNorm(i15)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).decompose(polyVecK.getVectorIndex(i15));
        }
    }

    Poly getVectorIndex(int i15) {
        return this.vec[i15];
    }

    public void invNttToMont() {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            iPolyMakeHint += getVectorIndex(i15).polyMakeHint(polyVecK.getVectorIndex(i15), polyVecK2.getVectorIndex(i15));
        }
        return iPolyMakeHint;
    }

    public void packW1(MLDSAEngine mLDSAEngine, byte[] bArr, int i15) {
        for (int i16 = 0; i16 < this.vec.length; i16++) {
            getVectorIndex(i16).packW1(bArr, (mLDSAEngine.getDilithiumPolyW1PackedBytes() * i16) + i15);
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i15));
        }
    }

    public void polyVecNtt() {
        int i15 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i15 >= polyArr.length) {
                return;
            }
            polyArr[i15].polyNtt();
            i15++;
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).power2Round(polyVecK.getVectorIndex(i15));
        }
    }

    public void reduce() {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).reduce();
        }
    }

    void setVectorIndex(int i15, Poly poly) {
        this.vec[i15] = poly;
    }

    public void shiftLeft() {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).subtract(polyVecK.getVectorIndex(i15));
        }
    }

    public String toString() {
        String str = "[";
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            str = str + i15 + " " + getVectorIndex(i15).toString();
            if (i15 != this.vec.length - 1) {
                str = str + ",\n";
            }
        }
        return str + "]";
    }

    public void uniformEta(byte[] bArr, short s15) {
        int i15 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i15 >= polyArr.length) {
                return;
            }
            polyArr[i15].uniformEta(bArr, s15);
            i15++;
            s15 = (short) (s15 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).polyUseHint(polyVecK.getVectorIndex(i15), polyVecK2.getVectorIndex(i15));
        }
    }

    public String toString(String str) {
        return str + ": " + toString();
    }
}
