package so;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class s extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long[] f182801g;

    s(n0 n0Var) {
        super(n0Var);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) throws IOException {
        p pVarK = n0Var.K();
        if (pVarK == null) {
            throw new IOException("Could not get head table");
        }
        int iZ = n0Var.Z() + 1;
        this.f182801g = new long[iZ];
        for (int i15 = 0; i15 < iZ; i15++) {
            if (pVarK.o() == 0) {
                this.f182801g[i15] = i0Var.N() * 2;
            } else {
                if (pVarK.o() != 1) {
                    throw new IOException("Error:TTF.loca unknown offset format.");
                }
                this.f182801g[i15] = i0Var.M();
            }
        }
        this.f182681e = true;
    }

    public long[] j() {
        return this.f182801g;
    }
}
