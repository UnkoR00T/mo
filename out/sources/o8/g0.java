package o8;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w7.c0 f143094a = new w7.c0(10);

    private boolean b(q qVar, int i15) {
        int i16 = 0;
        do {
            int i17 = i16 % 10;
            int i18 = i17 + 10;
            if (i17 == 0 && i16 != 0) {
                System.arraycopy(this.f143094a.f(), 10, this.f143094a.f(), 0, 9);
            }
            int i19 = i16 != 0 ? 1 : 10;
            try {
                qVar.p(this.f143094a.f(), i18 - i19, i19);
                this.f143094a.f0(i17);
                this.f143094a.e0(i18);
                if (this.f143094a.r() == 4801587) {
                    return true;
                }
                if (i0.j(this.f143094a.p()) != -1) {
                    return false;
                }
                if (i16 == 0) {
                    this.f143094a.d(20);
                }
                i16++;
            } catch (EOFException unused) {
            }
        } while (i16 <= i15);
        return false;
    }

    public t7.v a(q qVar, c9.h.a aVar, int i15) throws Throwable {
        t7.v vVarE = null;
        int i16 = 0;
        while (b(qVar, i15)) {
            int iG = this.f143094a.g();
            this.f143094a.g0(6);
            int iP = this.f143094a.P();
            int i17 = iP + 10;
            if (vVarE == null) {
                byte[] bArr = new byte[i17];
                System.arraycopy(this.f143094a.f(), iG, bArr, 0, 10);
                qVar.p(bArr, 10, iP);
                vVarE = new c9.h(aVar).e(bArr, i17);
            } else {
                qVar.k(iP);
            }
            i16 += i17;
        }
        qVar.g();
        qVar.k(i16);
        return vVarE;
    }
}
