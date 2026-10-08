package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes5.dex */
class PolyVecL {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            getVectorIndex(i15).addPoly(polyVecL.getVectorIndex(i15));
        }
    }

    public boolean checkNorm(int i15) {
        for (int i16 = 0; i16 < this.dilithiumL; i16++) {
            if (getVectorIndex(i16).checkNorm(i15)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            for (int i16 = 0; i16 < 256; i16++) {
                polyVecL.getVectorIndex(i15).setCoeffIndex(i16, getVectorIndex(i15).getCoeffIndex(i16));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i15) {
        for (int i16 = 0; i16 < this.dilithiumL; i16++) {
            this.vec[i16].uniformBlocks(bArr, (short) ((i15 << 8) + i16));
        }
    }

    public Poly getVectorIndex(int i15) {
        return this.vec[i15];
    }

    public void invNttToMont() {
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            getVectorIndex(i15).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            getVectorIndex(i15).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i15));
        }
    }

    public void polyVecNtt() {
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            this.vec[i15].polyNtt();
        }
    }

    public void reduce() {
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            getVectorIndex(i15).reduce();
        }
    }

    public String toString() {
        String str = "\n[";
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            str = str + "Inner Matrix " + i15 + " " + getVectorIndex(i15).toString();
            if (i15 != this.dilithiumL - 1) {
                str = str + ",\n";
            }
        }
        return str + "]";
    }

    public void uniformEta(byte[] bArr, short s15) {
        int i15 = 0;
        while (i15 < this.dilithiumL) {
            getVectorIndex(i15).uniformEta(bArr, s15);
            i15++;
            s15 = (short) (s15 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s15) {
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            getVectorIndex(i15).uniformGamma1(bArr, (short) ((this.dilithiumL * s15) + i15));
        }
    }

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.vec = new Poly[this.dilithiumL];
        for (int i15 = 0; i15 < this.dilithiumL; i15++) {
            this.vec[i15] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        return str + ": " + toString();
    }
}
