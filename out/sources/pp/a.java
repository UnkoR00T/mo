package pp;

import bp.d;
import bp.f;
import bp.i;
import bp.o;
import gp.j;
import hp.g;
import hp.h;
import java.io.InputStream;
import np.c;

/* JADX INFO: loaded from: classes4.dex */
public class a extends c implements zo.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f161583b;

    public a(h hVar) {
        super(hVar, i.S3);
        this.f161583b = null;
    }

    @Override // zo.a
    public InputStream a() {
        return D1().l5();
    }

    public g e() {
        bp.a aVar = (bp.a) D1().p4(i.f20919x0);
        if (aVar != null) {
            return new g(aVar);
        }
        return null;
    }

    public h f() {
        return new h(D1());
    }

    public gp.h g() {
        o oVarC = D1();
        i iVar = i.f20948z7;
        d dVarK4 = oVarC.k4(iVar);
        if (dVarK4 != null) {
            return new gp.h(dVarK4, this.f161583b);
        }
        if (D1().J3(iVar)) {
            return new gp.h();
        }
        return null;
    }

    public void h(g gVar) {
        if (gVar == null) {
            D1().P4(i.f20919x0);
        } else {
            D1().Y4(i.f20919x0, gVar.b());
        }
    }

    public void i(int i15) {
        D1().W4(i.T3, i15);
    }

    public void j(wo.a aVar) {
        bp.a aVar2 = new bp.a();
        double[] dArr = new double[6];
        aVar.c(dArr);
        for (int i15 = 0; i15 < 6; i15++) {
            aVar2.A3(new f((float) dArr[i15]));
        }
        D1().Y4(i.f20902v5, aVar2);
    }

    public void k(gp.h hVar) {
        D1().Z4(i.f20948z7, hVar);
    }

    public a(o oVar) {
        super(oVar, i.S3);
        this.f161583b = null;
    }

    public a(o oVar, j jVar) {
        super(oVar, i.S3);
        this.f161583b = jVar;
    }

    public a(gp.c cVar) {
        super(cVar, i.S3);
        this.f161583b = null;
    }
}
