package cn2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import n50.DefaultSingleCardData;
import oq.i0;
import p036e4.w0;
import p046f2.c2;
import p046f2.vb;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcn2/c;", "viewModel", "Loq/i0;", "k", "(Lcn2/c;Lm2/r;I)V", "Lcn2/c$a;", "screenData", "f", "(Lcn2/c$a;Lm2/r;I)V", "networksecurityissues_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    private static final void f(final c.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1293033991);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1293033991, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.summary.NetworkSecurityIssuesIllegalContentSummaryContent (NetworkSecurityIssuesIllegalContentSummaryScreen.kt:37)");
            }
            rVar2 = rVarH;
            s.r(data.getBaseScaffoldData(), y2.m.d(398047154, true, new er.p() { // from class: cn2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.g(data, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-694749510, true, new er.q() { // from class: cn2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.h(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cn2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.j(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.Data data, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(398047154, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.summary.NetworkSecurityIssuesIllegalContentSummaryContent.<anonymous> (NetworkSecurityIssuesIllegalContentSummaryScreen.kt:41)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(data.getSendButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 h(final c.Data data, d3 d3Var, r rVar, int i15) {
        int i16;
        k70.a aVar;
        int i17;
        f3.m.Companion companion;
        int i18;
        char c15;
        Object obj;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-694749510, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.summary.NetworkSecurityIssuesIllegalContentSummaryContent.<anonymous> (NetworkSecurityIssuesIllegalContentSummaryScreen.kt:46)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label header = data.getHeader();
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i19).getSpacing200()), rVar, 0);
            j70.h.g(null, null, data.getReportedWebsitesHeader(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i19).getSpacing200()), rVar, 0);
            r rVar2 = rVar;
            c2.c(null, aVar2.e(rVar, i19).getRadius200(), y1.f58315a.b(aVar2.a(rVar, i19).getSurface().a(), 0L, 0L, 0L, rVar, y1.f58316b << 12, 14), null, null, y2.m.d(16422866, true, new er.q() { // from class: cn2.i
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return j.i(data, (h0) obj2, (r) obj3, ((Integer) obj4).intValue());
                }
            }, rVar2, 54), rVar2, 196608, 25);
            DefaultSingleCardData issueRemarks = data.getIssueRemarks();
            if (issueRemarks == null) {
                rVar2.X(700247371);
                rVar2.R();
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
                c15 = 2;
                obj = null;
            } else {
                rVar2.X(700247372);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i19).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, data.getIssueRemarksHeader(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                aVar = aVar2;
                i17 = i19;
                companion = companion2;
                i18 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                c15 = 2;
                obj = null;
                n50.h0.v(issueRemarks, null, rVar2, 0, 2);
                rVar2.R();
            }
            DefaultSingleCardData contactData = data.getContactData();
            if (contactData == null) {
                rVar2.X(700645380);
            } else {
                rVar2.X(700645381);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing300()), rVar2, i18);
                j70.h.g(null, null, data.getContactDataHeader(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                n50.h0.v(contactData, null, rVar2, 0, 2);
            }
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.Data data, h0 h0Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(16422866, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.summary.NetworkSecurityIssuesIllegalContentSummaryContent.<anonymous>.<anonymous>.<anonymous> (NetworkSecurityIssuesIllegalContentSummaryScreen.kt:69)");
            }
            int i16 = 0;
            for (Object obj : data.g()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                n50.h0.v((DefaultSingleCardData) obj, null, rVar, 0, 2);
                if (i16 != v.p(data.g())) {
                    rVar.X(682178054);
                    f3.m.Companion companion = f3.m.INSTANCE;
                    k70.a aVar = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    vb.f(a3.r(companion, aVar.b(rVar, i18).getSpacing250(), 0.0f, aVar.b(rVar, i18).getSpacing250(), 0.0f, 10, null), aVar.b(rVar, i18).getStrokeWidth(), aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 0);
                } else {
                    rVar.X(679224436);
                }
                rVar.R();
                i16 = i17;
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.Data data, int i15, r rVar, int i16) {
        f(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final c cVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(353931286);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(353931286, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.summary.NetworkSecurityIssuesIllegalContentSummaryScreen (NetworkSecurityIssuesIllegalContentSummaryScreen.kt:29)");
            }
            f(l(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cn2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(cVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data l(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c cVar, int i15, r rVar, int i16) {
        k(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
