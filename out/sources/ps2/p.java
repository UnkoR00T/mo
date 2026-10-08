package ps2;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import o20.BaseDocumentComponentNewData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lps2/l;", "viewModel", "Loq/i0;", "d", "(Lps2/l;Lm2/r;I)V", "Lps2/l$a;", "screenState", "Li70/p;", "snackBarState", "pensionercard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, l.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((l) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void d(final l lVar, p076m2.r rVar, final int i15) {
        int i16;
        al alVar;
        int i17;
        boolean z15;
        f6 f6Var;
        int i18;
        p076m2.r rVarH = rVar.h(608419048);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z16 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(608419048, i16, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.screens.PensionerCardMainScreen (PensionerCardScreen.kt:26)");
            }
            f6 f6VarC = m7.b.c(lVar.getState(), null, null, null, rVarH, 0, 7);
            rVarH = rVarH;
            final f6 f6VarB = m7.b.b(lVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar2 = (al) objE;
            final l.a aVarE = e(f6VarC);
            if (fr.t.c(aVarE, l.a.C4002a.f162293a)) {
                rVarH.X(575165932);
                rVarH.R();
                f6Var = f6VarB;
                alVar = alVar2;
                i18 = 4;
                i17 = i16;
                z15 = true;
            } else {
                if (!(aVarE instanceof l.a.Initialized)) {
                    rVarH.X(575164192);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(575168528);
                alVar = alVar2;
                i17 = i16;
                z15 = true;
                f6Var = f6VarB;
                i18 = 4;
                i50.s.r(((l.a.Initialized) aVarE).getScaffoldData(), null, y2.m.d(-725739791, true, new er.p() { // from class: ps2.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return p.g(alVar2, f6VarB, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-222019942, true, new er.q() { // from class: ps2.n
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return p.h(aVarE, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
                rVarH = rVarH;
                rVarH.R();
            }
            i70.p pVarF = f(f6Var);
            if ((i17 & 14) == i18 || ((i17 & 8) != 0 && rVarH.G(lVar))) {
                z16 = z15;
            }
            Object objE2 = rVarH.E();
            if (z16 || objE2 == companion.a()) {
                objE2 = new a(lVar);
                rVarH.v(objE2);
            }
            i70.m.d(alVar, pVarF, (er.a) ((mr.g) objE2), null, null, rVarH, 6, 24);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ps2.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.i(lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final l.a e(f6<? extends l.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p f(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(al alVar, f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-725739791, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.screens.PensionerCardMainScreen.<anonymous> (PensionerCardScreen.kt:40)");
            }
            i70.d.d(alVar, f(f6Var), false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-222019942, i15, -1, "pl.gov.coi.mobywatel.feature.pensionercard.presentation.screens.PensionerCardMainScreen.<anonymous> (PensionerCardScreen.kt:43)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            l.a.Initialized initialized = (l.a.Initialized) aVar;
            o20.i.r(initialized.getScreenData(), initialized.getDocumentCardVMSAdapter(), rVar, BaseDocumentComponentNewData.f140736e);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(l lVar, int i15, p076m2.r rVar, int i16) {
        d(lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
