package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes5.dex */
class PolyVecK {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecK() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).addPoly(polyVecK.getVectorIndex(i15));
        }
    }

    public boolean checkNorm(int i15) {
        for (int i16 = 0; i16 < this.dilithiumK; i16++) {
            if (getVectorIndex(i16).checkNorm(i15)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).decompose(polyVecK.getVectorIndex(i15));
        }
    }

    public Poly getVectorIndex(int i15) {
        return this.vec[i15];
    }

    public void invNttToMont() {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            iPolyMakeHint += getVectorIndex(i15).polyMakeHint(polyVecK.getVectorIndex(i15), polyVecK2.getVectorIndex(i15));
        }
        return iPolyMakeHint;
    }

    public byte[] packW1() {
        byte[] bArr = new byte[this.dilithiumK * this.engine.getDilithiumPolyW1PackedBytes()];
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            System.arraycopy(getVectorIndex(i15).w1Pack(), 0, bArr, this.engine.getDilithiumPolyW1PackedBytes() * i15, this.engine.getDilithiumPolyW1PackedBytes());
        }
        return bArr;
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i15));
        }
    }

    public void polyVecNtt() {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            this.vec[i15].polyNtt();
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).power2Round(polyVecK.getVectorIndex(i15));
        }
    }

    public void reduce() {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).reduce();
        }
    }

    public void setVectorIndex(int i15, Poly poly) {
        this.vec[i15] = poly;
    }

    public void shiftLeft() {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).subtract(polyVecK.getVectorIndex(i15));
        }
    }

    public String toString() {
        String str = "[";
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            str = str + i15 + " " + getVectorIndex(i15).toString();
            if (i15 != this.dilithiumK - 1) {
                str = str + ",\n";
            }
        }
        return str + "]";
    }

    public void uniformEta(byte[] bArr, short s15) {
        int i15 = 0;
        while (i15 < this.dilithiumK) {
            getVectorIndex(i15).uniformEta(bArr, s15);
            i15++;
            s15 = (short) (s15 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            getVectorIndex(i15).polyUseHint(polyVecK.getVectorIndex(i15), polyVecK2.getVectorIndex(i15));
        }
    }

    public PolyVecK(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.vec = new Poly[this.dilithiumK];
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            this.vec[i15] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        return str + ": " + toString();
    }
}
