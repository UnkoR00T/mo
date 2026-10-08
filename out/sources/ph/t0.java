package ph;

import com.google.android.gms.internal.oss_licenses.j4;
import d1.a3;
import java.util.List;
import p046f2.oo;
import p046f2.vb;
import p076m2.n6;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements er.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f157615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ er.l f157616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f157617c;

    public t0(List list, er.l lVar, z zVar) {
        this.f157615a = list;
        this.f157616b = lVar;
        this.f157617c = zVar;
    }

    public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        boolean z15 = true;
        if ((i16 & 6) == 0) {
            i17 = i16 | (true != rVar.W(eVar) ? 2 : 4);
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= true != rVar.c(i15) ? 16 : 32;
        }
        if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
            rVar.O();
            return;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
        }
        j4 j4Var = (j4) this.f157615a.get(i15);
        rVar.X(663005396);
        f3.m.Companion companion = f3.m.INSTANCE;
        p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = f3.j.e(rVar, companion);
        androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
        er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
        if (rVar.l() == null) {
            p076m2.m.d();
        }
        rVar.K();
        if (rVar.getInserting()) {
            rVar.H(aVarB);
        } else {
            rVar.u();
        }
        p076m2.r rVarC = n6.c(rVar);
        n6.i(rVarC, w0VarA, companion2.d());
        n6.i(rVarC, e0VarT, companion2.f());
        n6.e(rVarC, Integer.valueOf(iHashCode), companion2.c());
        n6.g(rVarC, companion2.a());
        n6.i(rVarC, mVarE, companion2.e());
        d1.i0 i0Var = d1.i0.f39176a;
        String strE = j4Var.e();
        f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
        er.l lVar = this.f157616b;
        boolean zW = rVar.W(lVar);
        if ((((i17 & 112) ^ 48) <= 32 || !rVar.c(i15)) && (i17 & 48) != 32) {
            z15 = false;
        }
        boolean z16 = zW | z15;
        Object objE = rVar.E();
        if (z16 || objE == p076m2.r.INSTANCE.a()) {
            objE = new r0(lVar, i15);
            rVar.v(objE);
        }
        oo.j(strE, a3.n(androidx.compose.foundation.b.n(mVarH, false, null, null, null, (er.a) objE, 15, null), c5.h.n(16.0f)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.material3.d.f9816a.e(rVar, androidx.compose.material3.d.f9817b).getBodyLarge(), rVar, 0, 0, 131068);
        if (i15 < pq.v.p(((w) this.f157617c).a())) {
            rVar.X(90335340);
            vb.h(null, 0.0f, 0L, rVar, 0, 7);
        } else {
            rVar.X(86199785);
        }
        rVar.R();
        rVar.x();
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
    }

    @Override // er.r
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        c((f1.e) obj, ((Number) obj2).intValue(), (p076m2.r) obj3, ((Number) obj4).intValue());
        return oq.i0.f148189a;
    }
}
