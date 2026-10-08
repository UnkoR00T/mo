package q30;

import d1.a3;
import d1.e0;
import er.p;
import er.q;
import f3.j;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p114t0.a0;
import p114t0.k;
import p114t0.l;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "isChecked", "Lkotlin/Function0;", "Loq/i0;", "checkboxCustomContent", "b", "(ZLer/p;Lm2/r;I)Loq/i0;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final i0 b(boolean z15, final p<? super r, ? super Integer, i0> pVar, r rVar, int i15) {
        if (t.k()) {
            t.o(703002154, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.common.CheckBoxContent (CheckBoxContent.kt:17)");
        }
        i0 i0Var = null;
        if (pVar == null) {
            rVar.X(876764626);
            rVar.R();
        } else {
            rVar.X(876764627);
            k.g(z15, null, a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null)), a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null)), null, m.d(1218439404, true, new q() { // from class: q30.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.c(pVar, (l) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, (i15 & 14) | 200064, 18);
            rVar.R();
            i0Var = i0.f148189a;
        }
        if (t.k()) {
            t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(p pVar, l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1218439404, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.common.CheckBoxContent.<anonymous>.<anonymous> (CheckBoxContent.kt:23)");
        }
        f3.m mVarR = a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 0.0f, 13, null);
        w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = j.e(rVar, mVarR);
        androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
        er.a<androidx.compose.ui.node.c> aVarB = companion.b();
        if (rVar.l() == null) {
            p076m2.m.d();
        }
        rVar.K();
        if (rVar.getInserting()) {
            rVar.H(aVarB);
        } else {
            rVar.u();
        }
        r rVarC = n6.c(rVar);
        n6.i(rVarC, w0VarA, companion.d());
        n6.i(rVarC, e0VarT, companion.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
        n6.g(rVarC, companion.a());
        n6.i(rVarC, mVarE, companion.e());
        d1.i0 i0Var = d1.i0.f39176a;
        pVar.B(rVar, 0);
        rVar.x();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }
}
