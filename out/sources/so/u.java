package so;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class u extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t[] f182808g;

    u(n0 n0Var) {
        super(n0Var);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) throws IOException {
        int iN = i0Var.N();
        if (iN != 0) {
            iN = (iN << 16) | i0Var.N();
        }
        int iN2 = iN == 0 ? i0Var.N() : iN == 1 ? (int) i0Var.M() : 0;
        if (iN2 > 0) {
            this.f182808g = new t[iN2];
            for (int i15 = 0; i15 < iN2; i15++) {
                t tVar = new t();
                tVar.c(i0Var, iN);
                this.f182808g[i15] = tVar;
            }
        }
        this.f182681e = true;
    }
}
