package az0;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.r3;
import d1.x;
import i50.BaseScaffoldData;
import java.util.Iterator;
import mx.Label;
import n50.SingleCardConfig;
import n50.h0;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Laz0/c;", "viewModel", "Loq/i0;", "k", "(Laz0/c;Lm2/r;I)V", "Laz0/c$a$b;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "hideSnackBar", "f", "(Laz0/c$a$b;Li70/p;Ler/a;Lm2/r;I)V", "Laz0/c$a;", "state", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, c.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((c) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void f(final c.a.Initialized initialized, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1580077814);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
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
                t.o(1580077814, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.NewPointDetailsScreenContent (PointDetailsScreen.kt:61)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(initialized.getBaseScaffoldData(), y2.m.d(48557985, true, new er.p() { // from class: az0.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1230790720, true, new er.p() { // from class: az0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2079577769, true, new er.q() { // from class: az0.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.i(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 432, 196608, 32760);
            q0.g(false, initialized.g(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: az0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(initialized, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(48557985, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.NewPointDetailsScreenContent.<anonymous> (PointDetailsScreen.kt:72)");
            }
            if (initialized.getIsFavourite()) {
                rVar2 = rVar;
                rVar2.X(-815959135);
            } else {
                rVar.X(-813009547);
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                f3.m mVarN = a3.n(w0.i.d(companion, aVar.a(rVar, i16).getBase().a(), null, 2, null), aVar.b(rVar, i16).getSpacing200());
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                e0 e0VarT = rVar.t();
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
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                x xVar = x.f39368a;
                rVar2 = rVar;
                h30.q.p(initialized.getSaveButtonData(), false, null, rVar2, 0, 6);
                rVar2.x();
            }
            rVar2.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1230790720, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.NewPointDetailsScreenContent.<anonymous> (PointDetailsScreen.kt:83)");
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
    public static final i0 i(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        d1.i iVar;
        int i17;
        int i18;
        int i19;
        SingleCardConfig singleCardConfig;
        int i25;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(2079577769, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.NewPointDetailsScreenContent.<anonymous> (PointDetailsScreen.kt:89)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar2, 0, 1), rVar2, 0);
            d1.i iVar2 = d1.i.f39152a;
            d1.i.n nVarK = iVar2.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label timeStampLabel = initialized.getTimeStampLabel();
            if (timeStampLabel == null) {
                rVar2.X(-1497730720);
                rVar2.R();
                i17 = 0;
                iVar = iVar2;
            } else {
                rVar2.X(-1497730719);
                iVar = iVar2;
                j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, timeStampLabel, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 6, 0, 0, 33550330);
                rVar2 = rVar;
                companion = companion;
                i17 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                i0 i0Var2 = i0.f148189a;
                rVar2.R();
            }
            bz0.c.b(initialized.getPointInfoData(), rVar2, d40.b.f39676g);
            k70.a aVar = k70.a.f108864a;
            int i26 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i26).getSpacing300()), rVar2, i17);
            f3.m.Companion companion4 = companion;
            j70.h.g(null, null, initialized.getMeasurementDetailsLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i26).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            p076m2.r rVar3 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVar3, i26).getSpacing200()), rVar3, 0);
            m30.i.d(initialized.getMeasurementDetailsCardListData(), null, null, rVar3, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVar3, i26).getSpacing200()), rVar3, 0);
            b30.j.g(initialized.getOtherAccordionData(), rVar3, AccordionData.f16343b);
            if (initialized.d().isEmpty()) {
                i18 = -1501305329;
                i19 = 0;
                singleCardConfig = null;
                i25 = 2;
                rVar3.X(-1501305329);
                rVar3.R();
            } else {
                rVar3.X(-1496946047);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVar3, i26).getSpacing300()), rVar3, 0);
                j70.h.g(null, null, initialized.getClosePointsLabel(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i26).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar3 = rVar;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVar3, i26).getSpacing200()), rVar3, 0);
                w0 w0VarA2 = d1.e0.a(iVar.r(aVar.b(rVar3, i26).getSpacing100()), companion2.k(), rVar3, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar3, 0));
                e0 e0VarT2 = rVar3.t();
                f3.m mVarE2 = f3.j.e(rVar3, companion4);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar3.l() == null) {
                    p076m2.m.d();
                }
                rVar3.K();
                if (rVar3.getInserting()) {
                    rVar3.H(aVarB2);
                } else {
                    rVar3.u();
                }
                p076m2.r rVarC2 = n6.c(rVar3);
                n6.i(rVarC2, w0VarA2, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                rVar3.X(-1413468807);
                Iterator<T> it = initialized.d().iterator();
                while (it.hasNext()) {
                    h0.v((n50.k) it.next(), null, rVar3, 0, 2);
                }
                singleCardConfig = null;
                i25 = 2;
                rVar3.R();
                rVar3.x();
                rVar3.R();
                i18 = -1501305329;
            }
            if (initialized.getIsFavourite()) {
                rVar3.X(-1496404911);
                f3.m.Companion companion5 = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i27 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar2.b(rVar3, i27).getSpacing200()), rVar3, i19);
                h0.v(initialized.getDeleteButtonCardData(), singleCardConfig, rVar3, i19, i25);
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar2.b(rVar3, i27).getSpacing200()), rVar3, i19);
            } else {
                rVar3.X(i18);
            }
            rVar3.R();
            rVar3.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Initialized initialized, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        f(initialized, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1334051933);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1334051933, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.pointdetails.PointDetailsScreen (PointDetailsScreen.kt:41)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            c.a aVarL = l(f6VarC);
            if (fr.t.c(aVarL, c.a.C0359a.f15278a)) {
                rVarH.X(2123663905);
                rVarH.R();
            } else {
                if (!(aVarL instanceof c.a.Initialized)) {
                    rVarH.X(2123661958);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2123665798);
                c.a.Initialized initialized = (c.a.Initialized) aVarL;
                i70.p pVarM = m(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(cVar))) {
                    z15 = false;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(cVar);
                    rVarH.v(objE);
                }
                f(initialized, pVarM, (er.a) ((mr.g) objE), rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: az0.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a l(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p m(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c cVar, int i15, p076m2.r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
