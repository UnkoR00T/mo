package org.bouncycastle.pqc.crypto.crystals.dilithium;

/* JADX INFO: loaded from: classes5.dex */
class PolyVecMatrix {
    private final int dilithiumK;
    private final int dilithiumL;
    private final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            this.mat[i15] = new PolyVecL(dilithiumEngine);
        }
    }

    private String addString() {
        StringBuilder sb5;
        String string = "[";
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            String str = (string + "Outer Matrix " + i15 + " [") + this.mat[i15].toString();
            if (i15 == this.dilithiumK - 1) {
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
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            for (int i16 = 0; i16 < this.dilithiumL; i16++) {
                this.mat[i15].getVectorIndex(i16).uniformBlocks(bArr, (short) ((i15 << 8) + i16));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i15 = 0; i15 < this.dilithiumK; i15++) {
            polyVecK.getVectorIndex(i15).pointwiseAccountMontgomery(this.mat[i15], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
