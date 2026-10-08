package ym2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n3.y2;
import n50.DefaultSingleCardData;
import oq.i0;
import p036e4.w0;
import p046f2.c2;
import p046f2.vb;
import p046f2.x1;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lym2/c;", "viewModel", "Loq/i0;", "o", "(Lym2/c;Lm2/r;I)V", "Lym2/c$a;", "screenData", "h", "(Lym2/c$a;Lm2/r;I)V", "networksecurityissues_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void h(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(928388153);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(928388153, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.address.NetworkSecurityIssuesIllegalContentAddressContent (NetworkSecurityIssuesIllegalContentAddressScreen.kt:40)");
            }
            i50.s.r(data.getBaseScaffoldData(), y2.m.d(33401316, true, new er.p() { // from class: ym2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1059395348, true, new er.q() { // from class: ym2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.j(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ym2.i
                    @Override // er.a
                    public final Object a() {
                        return m.m(data);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ym2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.n(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(33401316, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.address.NetworkSecurityIssuesIllegalContentAddressContent.<anonymous> (NetworkSecurityIssuesIllegalContentAddressScreen.kt:44)");
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(data.getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 j(final c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        final c.Data data2;
        f3.m.Companion companion;
        int i17;
        boolean z15;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1059395348, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.address.NetworkSecurityIssuesIllegalContentAddressContent.<anonymous> (NetworkSecurityIssuesIllegalContentAddressScreen.kt:49)");
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label contentHeader = data.getContentHeader();
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(null, null, contentHeader, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar, i18).getSpacing100()), rVar, 0);
            j70.h.g(null, null, data.getContentDescription(), null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            p076m2.r rVar2 = rVar;
            if (data.g().isEmpty()) {
                data2 = data;
                companion = companion2;
                i17 = i18;
                z15 = true;
                rVar2.X(-495096436);
            } else {
                rVar2.X(-492325873);
                i17 = i18;
                companion = companion2;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                y2 radius200 = aVar.e(rVar2, i17).getRadius200();
                x1 x1VarB = y1.f58315a.b(aVar.a(rVar2, i17).getSurface().a(), 0L, 0L, 0L, rVar, y1.f58316b << 12, 14);
                rVar2 = rVar;
                data2 = data;
                z15 = true;
                c2.c(null, radius200, x1VarB, null, null, y2.m.d(-731406583, true, new er.q() { // from class: ym2.k
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.k(data2, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar2, 54), rVar2, 196608, 25);
            }
            rVar2.R();
            DefaultSingleCardData addWebsiteAddressButtonData = data2.getAddWebsiteAddressButtonData();
            if (addWebsiteAddressButtonData == null) {
                rVar2.X(-491465252);
            } else {
                rVar2.X(-491465251);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                n50.h0.v(addWebsiteAddressButtonData, null, rVar2, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
                j70.h.g(null, null, data2.getCountLimitDescription(), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            }
            rVar2.R();
            p114t0.k.e(i0Var, data.getErrorData().getIsErrorVisible(), null, null, null, null, y2.m.d(-342498978, true, new er.q() { // from class: ym2.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.l(data, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 1572870, 30);
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
    public static final i0 k(c.Data data, h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-731406583, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.address.NetworkSecurityIssuesIllegalContentAddressContent.<anonymous>.<anonymous>.<anonymous> (NetworkSecurityIssuesIllegalContentAddressScreen.kt:75)");
            }
            int i16 = 0;
            for (Object obj : data.g()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                n50.h0.v((DefaultSingleCardData) obj, null, rVar, 0, 2);
                if (pq.v.p(data.g()) != i16) {
                    rVar.X(1740906749);
                    f3.m.Companion companion = f3.m.INSTANCE;
                    k70.a aVar = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    vb.f(a3.r(companion, aVar.b(rVar, i18).getSpacing250(), 0.0f, aVar.b(rVar, i18).getSpacing250(), 0.0f, 10, null), aVar.b(rVar, i18).getStrokeWidth(), aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 0);
                } else {
                    rVar.X(1737707549);
                }
                rVar.R();
                i16 = i17;
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(c.Data data, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-342498978, i15, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.address.NetworkSecurityIssuesIllegalContentAddressContent.<anonymous>.<anonymous>.<anonymous> (NetworkSecurityIssuesIllegalContentAddressScreen.kt:103)");
        }
        l40.d.d(null, data.getErrorData().getLabel(), false, rVar, 0, 5);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.Data data) {
        data.i().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void o(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1608242360);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1608242360, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.illegalcontent.address.NetworkSecurityIssuesIllegalContentAddressScreen (NetworkSecurityIssuesIllegalContentAddressScreen.kt:32)");
            }
            h(p(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ym2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data p(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c cVar, int i15, p076m2.r rVar, int i16) {
        o(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
