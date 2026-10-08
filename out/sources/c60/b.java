package c60;

import androidx.compose.foundation.layout.d;
import d1.e0;
import d1.i0;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Loq/i0;", "b", "(Lm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final void b(r rVar, final int i15) {
        r rVarH = rVar.h(-1571812720);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (t.k()) {
                t.o(-1571812720, i15, -1, "pl.gov.coi.common.ui.emptyfullscreen.EmptyFullScreen (EmptyFullScreen.kt:10)");
            }
            m mVarD = i.d(d.f(m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().a(), null, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: c60.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(int i15, r rVar, int i16) {
        b(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
