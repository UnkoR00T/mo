package nt2;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import mx.Label;
import n50.DefaultSingleCardData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import pt2.PeselRestrictionData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lnt2/d;", "viewModel", "Loq/i0;", "u", "(Lnt2/d;Lm2/r;I)V", "Lnt2/d$a;", "screenData", "Li70/p;", "snackbarState", "y", "(Lnt2/d$a;Li70/p;Lm2/r;I)V", "Lnt2/d$a$a;", "l", "(Lnt2/d$a$a;Lm2/r;I)V", "Lnt2/d$a$b;", "n", "(Lnt2/d$a$b;Li70/p;Lm2/r;I)V", "Lpt2/a;", "s", "(Lpt2/a;Lm2/r;I)V", "Lnt2/d$a$c;", "A", "(Lnt2/d$a$c;Lm2/r;I)V", "snackBarState", "peselrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {
    public static final void A(final d.a.Underage underage, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(308809080);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(underage) : rVarH.G(underage) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(308809080, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionStatusUnderageScreen (PeselRestrictionStatusScreen.kt:148)");
            }
            rVar2 = rVarH;
            i50.s.r(underage.getScaffoldData(), y2.m.d(1308657251, true, new er.p() { // from class: nt2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.B(underage, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-638889109, true, new er.q() { // from class: nt2.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.C(underage, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nt2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.D(underage, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(d.a.Underage underage, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1308657251, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionStatusUnderageScreen.<anonymous> (PeselRestrictionStatusScreen.kt:153)");
            }
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(w0.i.d(mVarH, aVar.a(rVar, i16).getBase().a(), null, 2, null), aVar.b(rVar, i16).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(underage.getBottomButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(d.a.Underage underage, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-638889109, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionStatusUnderageScreen.<anonymous> (PeselRestrictionStatusScreen.kt:165)");
            }
            f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(underage.b(), null, null, rVar, IconPageData.f164667h, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(d.a.Underage underage, int i15, p076m2.r rVar, int i16) {
        A(underage, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final d.a.Initial initial, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(623033102);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initial) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(623033102, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionScreenInitial (PeselRestrictionStatusScreen.kt:69)");
            }
            c60.b.b(rVarH, 0);
            cb4.i dialogVMS = initial.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(-2069373493);
            } else {
                rVarH.X(1734361334);
                dialogVMS.b(rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nt2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.m(initial, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d.a.Initial initial, int i15, p076m2.r rVar, int i16) {
        l(initial, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final d.a.Initialized initialized, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1032390322);
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
                p076m2.t.o(-1032390322, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionScreenInitialized (PeselRestrictionStatusScreen.kt:79)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, initialized.d(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(initialized.getBaseScaffoldData(), null, y2.m.d(807603358, true, new er.p() { // from class: nt2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.o(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1324088775, true, new er.q() { // from class: nt2.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.p(initialized, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            q0.g(false, initialized.e(), rVarH, 0, 1);
            cb4.i dialogVMS = initialized.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(429390405);
            } else {
                rVarH.X(706587964);
                dialogVMS.b(rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nt2.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(initialized, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(807603358, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionScreenInitialized.<anonymous>.<anonymous> (PeselRestrictionStatusScreen.kt:89)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(d.a.Initialized initialized, final d.a.Initialized initialized2, final d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1324088775, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionScreenInitialized.<anonymous>.<anonymous> (PeselRestrictionStatusScreen.kt:91)");
            }
            k2.t.o(initialized.getIsRefreshing(), initialized.g(), w0.i.d(androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), null, null, null, false, 0.0f, y2.m.d(843717867, true, new er.q() { // from class: nt2.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.q(d3Var, initialized2, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 100663296, 248);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(d3 d3Var, d.a.Initialized initialized, d1.w wVar, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(843717867, i15, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionScreenInitialized.<anonymous>.<anonymous>.<anonymous> (PeselRestrictionStatusScreen.kt:98)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            s(initialized.getPeselRestrictionData(), rVar, c30.b.f22944i);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(d.a.Initialized initialized, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        n(initialized, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final PeselRestrictionData peselRestrictionData, p076m2.r rVar, final int i15) {
        int i16;
        int i17;
        f3.m.Companion companion;
        int i18;
        p076m2.r rVarH = rVar.h(-1365615142);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(peselRestrictionData) : rVarH.G(peselRestrictionData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1365615142, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionScreenInitializedContent (PeselRestrictionStatusScreen.kt:116)");
            }
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), bVarG, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.b plannedRestrictionAlertData = peselRestrictionData.getPlannedRestrictionAlertData();
            if (plannedRestrictionAlertData == null) {
                rVarH.X(-782374098);
            } else {
                rVarH.X(-782374097);
                c30.e.c(null, plannedRestrictionAlertData, rVarH, c30.b.f22944i << 3, 1);
            }
            rVarH.R();
            DefaultSingleCardData restrictionCardData = peselRestrictionData.getRestrictionCardData();
            if (restrictionCardData == null) {
                rVarH.X(-782294335);
            } else {
                rVarH.X(-782294334);
                n50.h0.v(restrictionCardData, null, rVarH, 0, 2);
            }
            rVarH.R();
            Label restrictionExplanation = peselRestrictionData.getRestrictionExplanation();
            if (restrictionExplanation == null) {
                rVarH.X(-782193089);
                rVarH.R();
                companion = companion2;
                i17 = 1;
                i18 = 0;
            } else {
                rVarH.X(-782193088);
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                i17 = 1;
                companion = companion2;
                i18 = 0;
                j70.h.g(null, null, restrictionExplanation, null, null, aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                rVarH.R();
            }
            k70.a aVar2 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i25).getSpacing300()), rVarH, i18);
            p076m2.r rVar2 = rVarH;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, i17, null), null, peselRestrictionData.getHistoryText(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.d()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i25).j(), null, null, false, false, null, rVar2, 6, 0, 0, 33026042);
            rVarH = rVar2;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i25).getSpacing200()), rVarH, 0);
            m30.i.d(peselRestrictionData.getHistoryItems(), null, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i25).getSpacing100()), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nt2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.t(peselRestrictionData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(PeselRestrictionData peselRestrictionData, int i15, p076m2.r rVar, int i16) {
        s(peselRestrictionData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(782358846);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(782358846, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionStatusScreen (PeselRestrictionStatusScreen.kt:42)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            y(v(f6VarC), w(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: nt2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.x(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a v(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p w(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(d dVar, int i15, p076m2.r rVar, int i16) {
        u(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void y(final d.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(449343489);
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
                p076m2.t.o(449343489, i16, -1, "pl.gov.coi.mobywatel.feature.peselrestriction.presentation.restrictionstatus.PeselRestrictionStatusScreenContent (PeselRestrictionStatusScreen.kt:54)");
            }
            if (aVar instanceof d.a.Initial) {
                rVarH.X(-1972597257);
                l((d.a.Initial) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else if (aVar instanceof d.a.Initialized) {
                rVarH.X(-1972593523);
                n((d.a.Initialized) aVar, pVar, rVarH, i16 & 126);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Underage)) {
                    rVarH.X(-1972599307);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1972588213);
                A((d.a.Underage) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: nt2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.z(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(d.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        y(aVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
