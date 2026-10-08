package c50;

import androidx.compose.foundation.layout.d;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import er.q;
import f3.j;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p114t0.a0;
import p114t0.k;
import p114t0.l;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "isSelected", "Lkotlin/Function0;", "Loq/i0;", "content", "c", "(ZLer/p;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void c(final boolean z15, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-620667972);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-620667972, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttoncontent.RadioButtonContent (RadioButtonContent.kt:18)");
            }
            if (pVar == null) {
                rVarH.X(-485236660);
            } else {
                rVarH.X(-485236659);
                k.g(z15, null, a0.o(null, 0.0f, 3, null).c(a0.m(null, null, false, null, 15, null)), a0.q(null, 0.0f, 3, null).c(a0.A(null, null, false, null, 15, null)), null, m.d(172390270, true, new q() { // from class: c50.a
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return c.d(pVar, (l) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, (i16 & 14) | 200064, 18);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: c50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(z15, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(p pVar, l lVar, r rVar, int i15) {
        if (t.k()) {
            t.o(172390270, i15, -1, "pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttoncontent.RadioButtonContent.<anonymous>.<anonymous> (RadioButtonContent.kt:25)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = j.e(rVar, companion);
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
        r rVarC = n6.c(rVar);
        n6.i(rVarC, w0VarA, companion2.d());
        n6.i(rVarC, e0VarT, companion2.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
        n6.g(rVarC, companion2.a());
        n6.i(rVarC, mVarE, companion2.e());
        d1.i0 i0Var = d1.i0.f39176a;
        r3.a(d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
        pVar.B(rVar, 0);
        rVar.x();
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(boolean z15, p pVar, int i15, r rVar, int i16) {
        c(z15, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
