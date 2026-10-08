package xr3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lxr3/h;", "viewModel", "Loq/i0;", "i", "(Lxr3/h;Lm2/r;I)V", "Lxr3/h$a;", "screenData", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "e", "(Lxr3/h$a;Li70/p;Ler/a;Lm2/r;I)V", "zusvisit_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, h.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((h) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void e(final h.Data data, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(419668782);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(419668782, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitoutro.NewVisitOutroDisplayed (NewVisitOutroScreen.kt:49)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(data.getBaseScaffoldData(), null, y2.m.d(1810859428, true, new er.p() { // from class: xr3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.f(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1395992421, true, new er.q() { // from class: xr3.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.g(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xr3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.h(data, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1810859428, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitoutro.NewVisitOutroDisplayed.<anonymous> (NewVisitOutroScreen.kt:58)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(h.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1395992421, i15, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitoutro.NewVisitOutroDisplayed.<anonymous> (NewVisitOutroScreen.kt:63)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarB = h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            IconPageData<CardListData, IconPageBottomContentData> iconPageDataB = data.b();
            c cVar = c.f220609a;
            q40.i.b(iconPageDataB, cVar.c(), cVar.d(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | 432, 0);
            rVar.x();
            rVar.x();
            q0.g(false, data.c(), rVar, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(h.Data data, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        e(data, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(45064185);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(45064185, i16, -1, "pl.gov.coi.mobywatel.feature.zusvisit.presentation.screens.newvisitoutro.NewVisitOutroScreen (NewVisitOutroScreen.kt:31)");
            }
            f6 f6VarC = m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(hVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            h.Data dataJ = j(f6VarC);
            i70.p pVarK = k(f6VarB);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(hVar))) {
                z15 = true;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(hVar);
                rVarH.v(objE);
            }
            e(dataJ, pVarK, (er.a) ((mr.g) objE), rVarH, BaseScaffoldData.f89350g | IconPageData.f164667h | IconPageBottomContentData.f164663d);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xr3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.l(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.Data j(f6<h.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p k(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(h hVar, int i15, p076m2.r rVar, int i16) {
        i(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
