package org.bouncycastle.pqc.crypto.mldsa;

/* JADX INFO: loaded from: classes5.dex */
class PolyVecMatrix {
    private final PolyVecL[] matrix;

    PolyVecMatrix(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.matrix = new PolyVecL[dilithiumK];
        for (int i15 = 0; i15 < dilithiumK; i15++) {
            this.matrix[i15] = new PolyVecL(mLDSAEngine);
        }
    }

    private String addString() {
        StringBuilder sb5;
        String string = "[";
        for (int i15 = 0; i15 < this.matrix.length; i15++) {
            String str = (string + "Outer Matrix " + i15 + " [") + this.matrix[i15].toString();
            if (i15 == this.matrix.length - 1) {
                sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("]\n");
            } else {
                sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("],\n");
            }
            string = sb5.toString();
        }
        return string + "]\n";
    }

    public void expandMatrix(byte[] bArr) {
        int i15 = 0;
        while (true) {
            PolyVecL[] polyVecLArr = this.matrix;
            if (i15 >= polyVecLArr.length) {
                return;
            }
            polyVecLArr[i15].uniformBlocks(bArr, i15 << 8);
            i15++;
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i15 = 0; i15 < this.matrix.length; i15++) {
            polyVecK.getVectorIndex(i15).pointwiseAccountMontgomery(this.matrix[i15], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
