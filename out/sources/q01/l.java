package q01;

import d1.a3;
import d1.d3;
import d1.x;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lq01/g;", "viewModel", "Loq/i0;", "e", "(Lq01/g;Lm2/r;I)V", "Lq01/g$a;", "state", "Li70/p;", "snackBarState", "apprating_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void e(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1628308722);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1628308722, i16, -1, "pl.gov.coi.mobywatel.feature.apprating.presentation.success.SendSuggestionSuccessScreen (SendSuggestionSuccessScreen.kt:27)");
            }
            final f6 f6VarC = m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            final f6 f6VarB = m7.b.b(gVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            s.r(f(f6VarC).getBaseScaffoldData(), null, y2.m.d(1223948860, true, new er.p() { // from class: q01.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(alVar, f6VarB, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-772320091, true, new er.q() { // from class: q01.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.i(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            rVarH = rVarH;
            boolean zW = rVarH.W(f6VarC);
            Object objE2 = rVarH.E();
            if (zW || objE2 == companion.a()) {
                objE2 = new er.a() { // from class: q01.j
                    @Override // er.a
                    public final Object a() {
                        return l.j(f6VarC);
                    }
                };
                rVarH.v(objE2);
            }
            q0.g(false, (er.a) objE2, rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q01.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data f(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p g(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(al alVar, f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1223948860, i15, -1, "pl.gov.coi.mobywatel.feature.apprating.presentation.success.SendSuggestionSuccessScreen.<anonymous> (SendSuggestionSuccessScreen.kt:38)");
            }
            i70.d.d(alVar, g(f6Var), false, rVar, 6, 4);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-772320091, i15, -1, "pl.gov.coi.mobywatel.feature.apprating.presentation.success.SendSuggestionSuccessScreen.<anonymous> (SendSuggestionSuccessScreen.kt:44)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            q40.i.b(f(f6Var).c(), null, b.f163397a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f6 f6Var) {
        f(f6Var).a().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(g gVar, int i15, p076m2.r rVar, int i16) {
        e(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
