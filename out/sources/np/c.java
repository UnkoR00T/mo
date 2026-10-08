package np;

import bp.i;
import bp.o;
import gp.j;
import hp.h;
import java.io.IOException;
import qp.d;

/* JADX INFO: loaded from: classes4.dex */
public class c implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f137581a;

    protected c(o oVar, i iVar) {
        this.f137581a = new h(oVar);
        oVar.d5(i.f20732e9, i.N9.A3());
        oVar.d5(i.f20938y8, iVar.A3());
    }

    public static c b(bp.b bVar, gp.h hVar) throws IOException {
        if (bVar == null) {
            return null;
        }
        if (!(bVar instanceof o)) {
            throw new IOException("Unexpected object type: " + bVar.getClass().getName());
        }
        o oVar = (o) bVar;
        String strH4 = oVar.H4(i.f20938y8);
        if (i.f20912w4.A3().equals(strH4)) {
            return new d(new h(oVar), hVar);
        }
        if (i.S3.A3().equals(strH4)) {
            j jVarN = hVar != null ? hVar.n() : null;
            bp.d dVarK4 = oVar.k4(i.f20698b4);
            return (dVarK4 == null || !i.X8.equals(dVarK4.l4(i.J7))) ? new pp.a(oVar, jVarN) : new pp.b(oVar, jVarN);
        }
        if (i.f20761h7.A3().equals(strH4)) {
            return new b(oVar);
        }
        throw new IOException("Invalid XObject Subtype: " + strH4);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final o D1() {
        return this.f137581a.D1();
    }

    public final h d() {
        return this.f137581a;
    }

    protected c(h hVar, i iVar) {
        this.f137581a = hVar;
        hVar.D1().d5(i.f20732e9, i.N9.A3());
        hVar.D1().d5(i.f20938y8, iVar.A3());
    }

    protected c(gp.c cVar, i iVar) {
        h hVar = new h(cVar);
        this.f137581a = hVar;
        hVar.D1().d5(i.f20732e9, i.N9.A3());
        hVar.D1().d5(i.f20938y8, iVar.A3());
    }
}
