package du1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.i0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import java.util.List;
import mx.Label;
import n50.h0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ldu1/d;", "viewModel", "Loq/i0;", "k", "(Ldu1/d;Lm2/r;I)V", "Ldu1/d$a;", "data", "n", "(Ldu1/d$a;Lm2/r;I)V", "", "Lc30/b;", "g", "(Ljava/util/List;Lm2/r;I)V", "Ldu1/d$a$a;", "i", "(Ldu1/d$a$a;Lm2/r;I)V", "Ldu1/d$a$b;", "q", "(Ldu1/d$a$b;Lm2/r;I)V", "driverqualifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void g(final List<? extends c30.b> list, r rVar, final int i15) {
        r rVarH = rVar.h(-436936441);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-436936441, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.qualifications.AlertsSection (QualificationsScreen.kt:60)");
            }
            List<? extends c30.b> list2 = list;
            if (list2.isEmpty()) {
                rVarH.X(1269978555);
            } else {
                rVarH.X(1272441164);
                d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                f3.m.Companion companion = f3.m.INSTANCE;
                w0 w0VarA = e0.a(fVarR, f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, companion);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
                n6.i(rVarC, w0VarA, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                i0 i0Var = i0.f39176a;
                rVarH.X(575959224);
                int size = list2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    c30.e.c(null, list.get(i17), rVarH, c30.b.f22944i << 3, 1);
                }
                rVarH.R();
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200()), rVarH, 0);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: du1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(list, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(List list, int i15, r rVar, int i16) {
        g(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void i(final d.Data.LicenceSectionData licenceSectionData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(870677541);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(licenceSectionData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(870677541, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.qualifications.LicenceSection (QualificationsScreen.kt:76)");
            }
            Label headerLabel = licenceSectionData.getHeaderLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, headerLabel, null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            m30.i.d(licenceSectionData.getCardListData(), null, null, rVar2, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: du1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(licenceSectionData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(d.Data.LicenceSectionData licenceSectionData, int i15, r rVar, int i16) {
        i(licenceSectionData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void k(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-830765349);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-830765349, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.qualifications.QualificationsScreen (QualificationsScreen.kt:26)");
            }
            n(l(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: du1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data l(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d dVar, int i15, r rVar, int i16) {
        k(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final d.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1560260136);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1560260136, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.qualifications.QualificationsScreenContent (QualificationsScreen.kt:34)");
            }
            rVar2 = rVarH;
            s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(174968651, true, new er.q() { // from class: du1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.o(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: du1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(d.Data data, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(174968651, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.qualifications.QualificationsScreenContent.<anonymous> (QualificationsScreen.kt:36)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(t70.i.S(companion, null, rVar, 6, 1), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(mVarL, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            i0 i0Var = i0.f39176a;
            g(data.a(), rVar, 0);
            i(data.getLicenceSectionData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            q(data.getQualificationsSectionData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, data.getRefreshDataInfoLabel(), null, null, aVar.a(rVar, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(d.Data data, int i15, r rVar, int i16) {
        n(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final d.Data.SectionData sectionData, r rVar, final int i15) {
        r rVarH = rVar.h(-2016672549);
        int i16 = (i15 & 6) == 0 ? i15 | (rVarH.G(sectionData) ? 4 : 2) : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-2016672549, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.qualifications.QualificationsSection (QualificationsScreen.kt:89)");
            }
            Label headerLabel = sectionData.getHeaderLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, headerLabel, null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            f3.m.Companion companion = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.r(aVar.b(rVarH, i17).getSpacing200()), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            rVarH.X(-218852824);
            List<n50.k> listB = sectionData.b();
            int size = listB.size();
            for (int i18 = 0; i18 < size; i18++) {
                h0.v(listB.get(i18), null, rVarH, 0, 2);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: du1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.r(sectionData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(d.Data.SectionData sectionData, int i15, r rVar, int i16) {
        q(sectionData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
