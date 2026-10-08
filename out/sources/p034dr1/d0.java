package p034dr1;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.p;
import er.q;
import f3.c;
import f3.j;
import i50.BaseScaffoldData;
import i50.s;
import j70.h;
import k70.a;
import m7.b;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.i;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ldr1/p;", "viewModel", "Loq/i0;", "c", "(Ldr1/p;Lm2/r;I)V", "Ldr1/p$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {
    public static final void c(final p pVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(217677651);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(217677651, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.topappbar.DeveloperTopAppBarScreen (DeveloperTopAppBarScreen.kt:26)");
            }
            final f6 f6VarC = b.c(pVar.getState(), null, null, null, rVarH, 0, 7);
            rVar2 = rVarH;
            s.r(d(f6VarC).getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(278785344, true, new q() { // from class: dr1.b0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.e(f6VarC, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: dr1.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.f(pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.Data d(f6<p.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(f6 f6Var, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(278785344, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.topappbar.DeveloperTopAppBarScreen.<anonymous> (DeveloperTopAppBarScreen.kt:32)");
            }
            c.b bVarK = c.INSTANCE.k();
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(d.f(companion, 0.0f, 1, null), d3Var);
            a aVar = a.f108864a;
            int i17 = a.f108865b;
            f3.m mVarS = i.S(a3.r(w0.i.d(mVarL, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 0.0f, 10, null), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), bVarK, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarS);
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
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            h.g(null, null, mx.b.b("Top App Bar (1.1.0)", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, mx.b.b("Stosowany do nawigowania między oknami lub informowania o aktualnym kontekście. Ma stałą pozycję - znajduje się na samej górze ekranu i jest ułożony horyzontalnie. Elementy obecne na pasku nawigacyjnym, np. przycisk wstecz, mogą zostać uwidocznione lub ukryte.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(d(f6Var).getSmallButtonData(), false, null, rVar, 0, 6);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(d(f6Var).getMediumButtonData(), false, null, rVar, 0, 6);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(d(f6Var).getLargeButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 f(p pVar, int i15, r rVar, int i16) {
        c(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
