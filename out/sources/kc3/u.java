package kc3;

import d1.a3;
import d1.d3;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lkc3/k;", "viewModel", "Loq/i0;", "u", "(Lkc3/k;Lm2/r;I)V", "Lkc3/k$a$b;", "data", "l", "(Lkc3/k$a$b;Lm2/r;I)V", "Lf3/m;", "modifier", "Lkc3/k$a$b$a$a;", "j", "(Lf3/m;Lkc3/k$a$b$a$a;Lm2/r;II)V", "Lkc3/k$a$b$a$b;", "p", "(Lf3/m;Lkc3/k$a$b$a$b;Lm2/r;II)V", "Lkc3/k$a;", "state", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class u {
    private static final void j(final f3.m mVar, final k.a.Initialized.InterfaceC2632a.EmptyState emptyState, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(1658888726);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(emptyState) : rVarH.G(emptyState) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1658888726, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.EmptyStateContent (YourTripsScreen.kt:70)");
            }
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVar);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            q40.i.b(emptyState.a(), null, null, rVarH, IconPageData.f164667h, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kc3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.k(mVar, emptyState, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(f3.m mVar, k.a.Initialized.InterfaceC2632a.EmptyState emptyState, int i15, int i16, p076m2.r rVar, int i17) {
        j(mVar, emptyState, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void l(final k.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1519248885);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1519248885, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.InitializedState (YourTripsScreen.kt:41)");
            }
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), y2.m.d(-946936672, true, new er.p() { // from class: kc3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.m(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-277152856, true, new er.q() { // from class: kc3.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.n(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: kc3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(k.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-946936672, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.InitializedState.<anonymous> (YourTripsScreen.kt:45)");
            }
            ButtonData buttonData = initialized.getButtonData();
            if (buttonData == null) {
                rVar.X(-845165849);
                rVar.R();
            } else {
                rVar.X(-845165848);
                f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
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
                n6.i(rVarC, w0VarI, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.x xVar = d1.x.f39368a;
                h30.q.p(buttonData, false, null, rVar, 0, 6);
                rVar.x();
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(k.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-277152856, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.InitializedState.<anonymous> (YourTripsScreen.kt:52)");
            }
            k.a.Initialized.InterfaceC2632a content = initialized.getContent();
            if (content instanceof k.a.Initialized.InterfaceC2632a.EmptyState) {
                rVar.X(-55918391);
                j(a3.l(f3.m.INSTANCE, d3Var), (k.a.Initialized.InterfaceC2632a.EmptyState) initialized.getContent(), rVar, 0, 0);
                rVar.R();
            } else {
                if (!(content instanceof k.a.Initialized.InterfaceC2632a.Trips)) {
                    rVar.X(-55921045);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-55912156);
                p(a3.l(f3.m.INSTANCE, d3Var), (k.a.Initialized.InterfaceC2632a.Trips) initialized.getContent(), rVar, 0, 0);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(k.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(f3.m mVar, final k.a.Initialized.InterfaceC2632a.Trips trips, p076m2.r rVar, final int i15, final int i16) {
        final f3.m mVar2;
        int i17;
        p076m2.r rVarH = rVar.h(-1442869914);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(trips) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            f3.m mVar3 = i18 != 0 ? f3.m.INSTANCE : mVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(-1442869914, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.TripsContent (YourTripsScreen.kt:80)");
            }
            f3.m mVarB = qa3.b.b(mVar3);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarB, aVar.b(rVarH, i19).getSpacing200(), 0.0f, 2, null);
            d3 d3VarI = a3.i(0.0f, aVar.b(rVarH, i19).getSpacing100(), 0.0f, aVar.b(rVarH, i19).getSpacing200(), 5, null);
            boolean zG = rVarH.G(trips);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: kc3.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.q(trips, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarP, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 506);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar2 = mVar3;
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kc3.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.t(mVar2, trips, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(final k.a.Initialized.InterfaceC2632a.Trips trips, f1.q0 q0Var) {
        List<k.a.Initialized.InterfaceC2632a.Trips.Section> listB = trips.b();
        int size = listB.size();
        for (int i15 = 0; i15 < size; i15++) {
            final k.a.Initialized.InterfaceC2632a.Trips.Section section = listB.get(i15);
            f1.q0.c(q0Var, null, null, y2.m.b(1523287127, true, new er.q() { // from class: kc3.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return u.r(section, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
            m30.m.h(q0Var, section.getCards());
            f1.q0.c(q0Var, null, null, b.f109998a.b(), 3, null);
        }
        f1.q0.c(q0Var, null, null, y2.m.b(668943291, true, new er.q() { // from class: kc3.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return u.s(trips, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(k.a.Initialized.InterfaceC2632a.Trips.Section section, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1523287127, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.TripsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourTripsScreen.kt:94)");
            }
            Label header = section.getHeader();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(k.a.Initialized.InterfaceC2632a.Trips trips, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(668943291, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.TripsContent.<anonymous>.<anonymous>.<anonymous> (YourTripsScreen.kt:107)");
            }
            Label info = trips.getInfo();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, info, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(f3.m mVar, k.a.Initialized.InterfaceC2632a.Trips trips, int i15, int i16, p076m2.r rVar, int i17) {
        p(mVar, trips, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void u(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2122134003);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2122134003, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.yourtrips.YourTripsScreen (YourTripsScreen.kt:29)");
            }
            k.a aVarV = v(m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarV, k.a.c.f110096a)) {
                rVarH.X(-738682684);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarV instanceof k.a.Error) {
                rVarH.X(-738680293);
                ((k.a.Error) aVarV).getVmsAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarV instanceof k.a.Initialized)) {
                    rVarH.X(-738684583);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-738678480);
                l((k.a.Initialized) aVarV, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: kc3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.w(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final k.a v(f6<? extends k.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(k kVar, int i15, p076m2.r rVar, int i16) {
        u(kVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
