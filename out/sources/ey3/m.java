package ey3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import i50.BaseScaffoldData;
import n50.DefaultSingleCardData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p046f2.c2;
import p046f2.vb;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ley3/d;", "viewModel", "Loq/i0;", "n", "(Ley3/d;Lm2/r;I)V", "Ley3/d$a;", "screenData", "Li70/p;", "snackBarState", "g", "(Ley3/d$a;Li70/p;Lm2/r;I)V", "Ley3/d$a$b;", "i", "(Ley3/d$a$b;Li70/p;Lm2/r;I)V", "makepayment_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void g(final d.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(541384848);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(541384848, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.deletecards.PaymentsDeleteCardsContent (PaymentsDeleteCardsScreen.kt:42)");
            }
            if (fr.t.c(aVar, d.a.C1279a.f54283a)) {
                rVarH.X(579802209);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(579800206);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(579804697);
                i((d.a.Initialized) aVar, pVar, rVarH, i16 & 126);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ey3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.h(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        g(aVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final d.a.Initialized initialized, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(788748995);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(788748995, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.deletecards.PaymentsDeleteCardsInitialized (PaymentsDeleteCardsScreen.kt:56)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, initialized.c(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(361839673, true, new er.p() { // from class: ey3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.j(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-26422096, true, new er.q() { // from class: ey3.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.k(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            q0.g(false, initialized.b(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ey3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.m(initialized, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(361839673, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.deletecards.PaymentsDeleteCardsInitialized.<anonymous> (PaymentsDeleteCardsScreen.kt:65)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-26422096, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.deletecards.PaymentsDeleteCardsInitialized.<anonymous> (PaymentsDeleteCardsScreen.kt:67)");
            }
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), null, rVar, 6, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(a3.l(w0.i.d(mVarS, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            c2.c(null, aVar.e(rVar, i17).getRadius200(), y1.f58315a.b(aVar.a(rVar, i17).getSurface().a(), 0L, 0L, 0L, rVar, y1.f58316b << 12, 14), null, null, y2.m.d(717011096, true, new er.q() { // from class: ey3.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.l(initialized, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 196608, 25);
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
    public static final i0 l(d.a.Initialized initialized, h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(717011096, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.deletecards.PaymentsDeleteCardsInitialized.<anonymous>.<anonymous>.<anonymous> (PaymentsDeleteCardsScreen.kt:87)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar.X(-1512117061);
            int i16 = 0;
            for (Object obj : initialized.a()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                n50.h0.v((DefaultSingleCardData) obj, null, rVar, 0, 2);
                if (pq.v.p(initialized.a()) != i16) {
                    rVar.X(-1669269434);
                    f3.m.Companion companion3 = f3.m.INSTANCE;
                    k70.a aVar = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    vb.h(a3.r(companion3, aVar.b(rVar, i18).getSpacing250(), 0.0f, aVar.b(rVar, i18).getSpacing250(), 0.0f, 10, null), aVar.b(rVar, i18).getStrokeWidth(), aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 0);
                } else {
                    rVar.X(-1672894512);
                }
                rVar.R();
                i16 = i17;
            }
            rVar.R();
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
    public static final i0 m(d.a.Initialized initialized, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        i(initialized, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-946906303);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-946906303, i16, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.deletecards.PaymentsDeleteCardsScreen (PaymentsDeleteCardsScreen.kt:30)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            g(o(f6VarC), p(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ey3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a o(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p p(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(d dVar, int i15, p076m2.r rVar, int i16) {
        n(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
