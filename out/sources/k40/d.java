package k40;

import d1.e0;
import d1.i;
import d1.r3;
import er.l;
import er.p;
import f3.j;
import f3.m;
import h30.ButtonData;
import h30.q;
import j70.h;
import mx.Label;
import n4.f0;
import n4.i0;
import n4.v;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Lk40/a;", "data", "Loq/i0;", "c", "(Lf3/m;Lk40/a;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void c(m mVar, final EmptyStateData emptyStateData, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        r rVar2;
        m mVar3;
        int i18;
        r rVarH = rVar.h(811235160);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = i15 | (rVarH.W(mVar2) ? 4 : 2);
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(emptyStateData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar4 = i19 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(811235160, i17, -1, "pl.gov.coi.common.ui.ds.emptystate.EmptyState (EmptyState.kt:27)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: k40.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.d((i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD = v.d(mVarH, false, (l) objE, 1, null);
            w0 w0VarA = e0.a(i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
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
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = emptyStateData.getTitle();
            if (title == null) {
                rVarH.X(1511140790);
                rVarH.R();
                mVar3 = mVar4;
                i18 = 0;
            } else {
                rVarH.X(1511140791);
                k70.a aVar = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                mVar3 = mVar4;
                i18 = 0;
                h.g(null, null, title, null, null, aVar.a(rVarH, i25).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i25).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, aVar.b(rVarH, i25).getSpacing200()), rVarH, 0);
                rVarH.R();
            }
            Label body = emptyStateData.getBody();
            k70.a aVar2 = k70.a.f108864a;
            int i26 = k70.a.f108865b;
            r rVar3 = rVarH;
            h.g(null, null, body, null, null, aVar2.a(rVarH, i26).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i26).d(), null, null, false, false, null, rVar3, 0, 0, 0, 33026011);
            ButtonData buttonData = emptyStateData.getButtonData();
            if (buttonData == null) {
                rVar3.X(1511624359);
                rVar3.R();
                rVar2 = rVar3;
            } else {
                rVar3.X(1511624360);
                r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, aVar2.b(rVar3, i26).getSpacing200()), rVar3, i18);
                q.p(buttonData, false, null, rVar3, 0, 6);
                rVar2 = rVar3;
                rVar2.R();
            }
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar3;
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.e(mVar2, emptyStateData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(i0 i0Var) {
        f0.H0(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(m mVar, EmptyStateData emptyStateData, int i15, int i16, r rVar, int i17) {
        c(mVar, emptyStateData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
