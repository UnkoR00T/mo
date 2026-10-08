package so;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class r extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f182795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private short[] f182796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private short[] f182797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f182798j;

    r(n0 n0Var) {
        super(n0Var);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) throws IOException {
        int i15;
        q qVarL = n0Var.L();
        if (qVarL == null) {
            throw new IOException("Could not get hmtx table");
        }
        this.f182798j = qVarL.s();
        int iZ = n0Var.Z();
        int i16 = this.f182798j;
        this.f182795g = new int[i16];
        this.f182796h = new short[i16];
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i15 = this.f182798j;
            if (i17 >= i15) {
                break;
            }
            this.f182795g[i17] = i0Var.N();
            this.f182796h[i17] = i0Var.E();
            i18 += 4;
            i17++;
        }
        int i19 = iZ - i15;
        if (i19 >= 0) {
            iZ = i19;
        }
        this.f182797i = new short[iZ];
        if (i18 < b()) {
            for (int i25 = 0; i25 < iZ; i25++) {
                if (i18 < b()) {
                    this.f182797i[i25] = i0Var.E();
                    i18 += 2;
                }
            }
        }
        this.f182681e = true;
    }

    public int j(int i15) {
        int[] iArr = this.f182795g;
        if (iArr.length == 0) {
            return 250;
        }
        return i15 < this.f182798j ? iArr[i15] : iArr[iArr.length - 1];
    }

    public int k(int i15) {
        short[] sArr = this.f182796h;
        if (sArr.length == 0) {
            return 0;
        }
        int i16 = this.f182798j;
        return i15 < i16 ? sArr[i15] : this.f182797i[i15 - i16];
    }
}
