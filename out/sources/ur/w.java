package ur;

import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ot.b0;
import ot.z;
import vr.i0;
import vr.n0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends ot.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f200112f = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public w(rt.n nVar, ss.v vVar, i0 i0Var, n0 n0Var, xr.a aVar, xr.c cVar, ot.o oVar, tt.p pVar, kt.a aVar2) {
        super(nVar, vVar, i0Var);
        ot.q qVar = new ot.q(this);
        pt.a aVar3 = pt.a.f162502r;
        k(new ot.n(nVar, i0Var, oVar, qVar, new ot.f(i0Var, n0Var, aVar3), this, b0.a.f149729a, ot.w.f149868a, ds.c.a.f44264a, ot.x.a.f149870a, pq.v.q(new tr.a(nVar, i0Var), new g(nVar, i0Var, null, 4, null)), n0Var, ot.m.f149790a.a(), aVar, cVar, aVar3.e(), pVar, aVar2, null, z.f149885a, PKIFailureInfo.transactionIdInUse, null));
    }

    @Override // ot.c
    protected ot.r e(zs.c cVar) {
        InputStream inputStreamA = h().a(cVar);
        if (inputStreamA != null) {
            return pt.c.f162504q.a(cVar, j(), i(), inputStreamA, false);
        }
        return null;
    }
}
