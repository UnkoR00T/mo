package org.bouncycastle.pqc.crypto.mldsa;

/* JADX INFO: loaded from: classes5.dex */
class PolyVecL {
    private final Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).addPoly(polyVecL.getVectorIndex(i15));
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

    void copyTo(PolyVecL polyVecL) {
        int i15 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i15 >= polyArr.length) {
                return;
            }
            polyArr[i15].copyTo(polyVecL.vec[i15]);
            i15++;
        }
    }

    public Poly getVectorIndex(int i15) {
        return this.vec[i15];
    }

    public void invNttToMont() {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i15));
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

    public void reduce() {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).reduce();
        }
    }

    public String toString() {
        String str = "\n[";
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            str = str + "Inner Matrix " + i15 + " " + getVectorIndex(i15).toString();
            if (i15 != this.vec.length - 1) {
                str = str + ",\n";
            }
        }
        return str + "]";
    }

    void uniformBlocks(byte[] bArr, int i15) {
        int i16 = 0;
        while (true) {
            Poly[] polyArr = this.vec;
            if (i16 >= polyArr.length) {
                return;
            }
            polyArr[i16].uniformBlocks(bArr, (short) (i15 + i16));
            i16++;
        }
    }

    public void uniformEta(byte[] bArr, short s15) {
        int i15 = 0;
        while (i15 < this.vec.length) {
            getVectorIndex(i15).uniformEta(bArr, s15);
            i15++;
            s15 = (short) (s15 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s15) {
        for (int i15 = 0; i15 < this.vec.length; i15++) {
            getVectorIndex(i15).uniformGamma1(bArr, (short) ((this.vec.length * s15) + i15));
        }
    }

    PolyVecL(MLDSAEngine mLDSAEngine) {
        int dilithiumL = mLDSAEngine.getDilithiumL();
        this.vec = new Poly[dilithiumL];
        for (int i15 = 0; i15 < dilithiumL; i15++) {
            this.vec[i15] = new Poly(mLDSAEngine);
        }
    }

    public String toString(String str) {
        return str + ": " + toString();
    }
}
