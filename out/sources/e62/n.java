package e62;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Le62/d;", "viewModel", "Loq/i0;", "s", "(Le62/d;Lm2/r;I)V", "Le62/d$a;", "screenData", "Li70/p;", "snackBarState", "Lf2/al;", "snackBarHostState", "i", "(Le62/d$a;Li70/p;Lf2/al;Lm2/r;I)V", "Le62/d$a$c;", "o", "(Le62/d$a$c;Li70/p;Lf2/al;Lm2/r;I)V", "Le62/d$a$a;", "k", "(Le62/d$a$a;Li70/p;Lf2/al;Lm2/r;I)V", "epayments_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final void i(final d.a aVar, final i70.p pVar, final al alVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1329906474);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(alVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1329906474, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsContent (PaymentsYourCardsScreen.kt:53)");
            }
            if (fr.t.c(aVar, d.a.b.f47751a)) {
                rVarH.X(-1860125522);
                rVarH.R();
            } else if (aVar instanceof d.a.Initialized) {
                rVarH.X(-1860123458);
                o((d.a.Initialized) aVar, pVar, alVar, rVarH, i16 & 1022);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Empty)) {
                    rVarH.X(-1860127224);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1860117122);
                k((d.a.Empty) aVar, pVar, alVar, rVarH, i16 & 1022);
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
            d5VarM.a(new er.p() { // from class: e62.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.j(aVar, pVar, alVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d.a aVar, i70.p pVar, al alVar, int i15, p076m2.r rVar, int i16) {
        i(aVar, pVar, alVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final d.a.Empty empty, final i70.p pVar, final al alVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1883326799);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(alVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1883326799, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsEmptyScreen (PaymentsYourCardsScreen.kt:127)");
            }
            i70.m.d(alVar, pVar, empty.c(), null, null, rVarH, ((i16 >> 6) & 14) | (i16 & 112), 24);
            i50.s.r(empty.getScaffoldData(), null, y2.m.d(1773557189, true, new er.p() { // from class: e62.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.l(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1725513284, true, new er.q() { // from class: e62.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.m(empty, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e62.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.n(empty, pVar, alVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1773557189, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsEmptyScreen.<anonymous> (PaymentsYourCardsScreen.kt:135)");
            }
            i70.d.d(alVar, pVar, false, rVar, 0, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(d.a.Empty empty, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1725513284, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsEmptyScreen.<anonymous> (PaymentsYourCardsScreen.kt:137)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarD = androidx.compose.foundation.layout.d.d(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(a3.l(w0.i.d(mVarD, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.e(), bVarG, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            f3.m mVarD2 = w0.i.d(h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.d(companion, 0.0f, 1, null), 1.0f, false, 2, null), aVar.a(rVar, i17).getBase().a(), null, 2, null);
            w0 w0VarA2 = e0.a(iVar.e(), companion2.g(), rVar, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarD2);
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
            q40.i.b(empty.b(), null, null, rVar, IconPageData.f164667h, 6);
            rVar.x();
            h30.q.p(empty.getAddCardButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 n(d.a.Empty empty, i70.p pVar, al alVar, int i15, p076m2.r rVar, int i16) {
        k(empty, pVar, alVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final d.a.Initialized initialized, final i70.p pVar, final al alVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1900430413);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(alVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1900430413, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsInitialized (PaymentsYourCardsScreen.kt:74)");
            }
            i70.m.d(alVar, pVar, initialized.d(), null, null, rVarH, ((i16 >> 6) & 14) | (i16 & 112), 24);
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(-337534909, true, new er.p() { // from class: e62.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(205059834, true, new er.q() { // from class: e62.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.q(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e62.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.r(initialized, pVar, alVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-337534909, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsInitialized.<anonymous> (PaymentsYourCardsScreen.kt:82)");
            }
            i70.d.d(alVar, pVar, false, rVar, 0, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(d.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(205059834, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsInitialized.<anonymous> (PaymentsYourCardsScreen.kt:84)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarL = a3.l(a3.r(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null), d3Var);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            f3.m mVarR = a3.r(h0.b(d1.i0.f39176a, t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), 1.0f, false, 2, null), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing100(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
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
            m30.i.d(initialized.getCards(), null, null, rVar, 0, 6);
            rVar.x();
            r3.a(a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, 0.0f, 13, null), rVar, 0);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(initialized.getAddCardButtonLabel(), null, 2, null), k30.d.a.f107773a, null, initialized.c(), 35, null), false, null, rVar, 0, 6);
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
    public static final i0 r(d.a.Initialized initialized, i70.p pVar, al alVar, int i15, p076m2.r rVar, int i16) {
        o(initialized, pVar, alVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void s(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1575987859);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1575987859, i16, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.yourcards.PaymentsYourCardsScreen (PaymentsYourCardsScreen.kt:35)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            i(t(f6VarC), u(f6VarB), (al) objE, rVarH, MLKEMEngine.KyberPolyBytes);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: e62.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.v(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a t(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p u(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(d dVar, int i15, p076m2.r rVar, int i16) {
        s(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
