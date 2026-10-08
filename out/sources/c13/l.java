package c13;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.i0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p088nul.q0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lc13/g;", "viewModel", "Loq/i0;", "j", "(Lc13/g;Lm2/r;I)V", "Lc13/g$a;", "data", "g", "(Lc13/g$a;Lm2/r;I)V", "Lc13/g$a$a;", "e", "(Lc13/g$a$a;Lm2/r;I)V", "safebus_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final g.Data.ContentData contentData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1437538913);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(contentData) : rVarH.G(contentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1437538913, i16, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.verified.BusVerifiedContent (SafeBusVerifiedScreen.kt:59)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            i0 i0Var = i0.f39176a;
            m30.i.d(contentData.getMainDataDetails(), null, null, rVarH, 0, 6);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            if (contentData.getBasicDataVisible()) {
                rVarH.X(-1861799600);
                b30.j.g(contentData.getBasicAccordionData(), rVarH, AccordionData.f16343b);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            } else {
                rVarH.X(-1863885063);
            }
            rVarH.R();
            if (contentData.getTechnicalDataVisible()) {
                rVarH.X(-1861626868);
                b30.j.g(contentData.getTechnicalAccordionData(), rVarH, AccordionData.f16343b);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            } else {
                rVarH.X(-1863885063);
            }
            rVarH.R();
            if (contentData.getDocumentsVisible()) {
                rVarH.X(-1861454291);
                b30.j.g(contentData.getDocumentAccordionData(), rVarH, AccordionData.f16343b);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            } else {
                rVarH.X(-1863885063);
            }
            rVarH.R();
            c30.e.c(null, contentData.getInfoAboutAlert(), rVarH, 0, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c13.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.f(contentData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(g.Data.ContentData contentData, int i15, p076m2.r rVar, int i16) {
        e(contentData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void g(final g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1659840418);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1659840418, i16, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.verified.SafeBusScreenVerified (SafeBusVerifiedScreen.kt:35)");
            }
            s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(563986129, true, new er.q() { // from class: c13.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.h(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, data.c(), rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c13.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(g.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(563986129, i15, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.verified.SafeBusScreenVerified.<anonymous> (SafeBusVerifiedScreen.kt:40)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            i0 i0Var = i0.f39176a;
            q40.i.b(data.b(), b.f22584a.b(), null, rVar, IconPageData.f164667h | AccordionData.f16343b | 48, 4);
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
    public static final oq.i0 i(g.Data data, int i15, p076m2.r rVar, int i16) {
        g(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2020365498);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2020365498, i16, -1, "pl.gov.coi.mobywatel.feature.safebus.presentation.verified.SafeBusVerifiedScreen (SafeBusVerifiedScreen.kt:26)");
            }
            g(k(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | IconPageData.f164667h | AccordionData.f16343b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: c13.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data k(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(g gVar, int i15, p076m2.r rVar, int i16) {
        j(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
