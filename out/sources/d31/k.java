package d31;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import t40.InfoRowListData;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Ld31/g;", "viewModel", "Loq/i0;", "g", "(Ld31/g;Lm2/r;I)V", "Ld31/g$a$b;", "data", "d", "(Ld31/g$a$b;Lm2/r;I)V", "Ld31/g$a;", "state", "checkvehicleinsurance_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void d(final g.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1211922399);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1211922399, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.moreinfo.MoreInfoContent (MoreInfoScreen.kt:38)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, f3VarB, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(113789844, true, new er.q() { // from class: d31.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.e(f3VarB, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: d31.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.f(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(f3 f3Var, g.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        int i17;
        Object obj;
        char c15;
        k70.a aVar;
        int i18;
        f3.m.Companion companion2;
        char c16;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(113789844, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.moreinfo.MoreInfoContent.<anonymous> (MoreInfoScreen.kt:44)");
            }
            f3.m.Companion companion3 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion3, 0.0f, 1, null), d3Var), f3Var, rVar2, 0, 0), rVar2, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label description = initialized.getDescription();
            if (description == null) {
                rVar2.X(-516659645);
                rVar2.R();
                companion = companion3;
                i17 = 0;
            } else {
                rVar2.X(-516659644);
                k70.a aVar2 = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                j70.h.g(null, null, description, null, null, aVar2.a(rVar2, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i19).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                companion = companion3;
                i17 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i19).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            DefaultSingleCardData toCollisionButton = initialized.getToCollisionButton();
            if (toCollisionButton == null) {
                rVar2.X(-516344778);
                rVar2.R();
                obj = null;
                c15 = 2;
            } else {
                rVar2.X(-516344777);
                obj = null;
                c15 = 2;
                h0.v(toCollisionButton, null, rVar2, i17, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, i17);
                rVar2.R();
            }
            rVar2.X(-1956312013);
            List<g.a.Initialized.Section> listD = initialized.d();
            int size = listD.size();
            int i25 = i17;
            while (i25 < size) {
                g.a.Initialized.Section section = listD.get(i25);
                Label header = section.getHeader();
                k70.a aVar3 = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                List<g.a.Initialized.Section> list = listD;
                int i27 = i25;
                int i28 = size;
                j70.h.g(null, null, header, null, null, aVar3.a(rVar2, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i26).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                f3.m.Companion companion5 = f3.m.INSTANCE;
                r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar2, i26).getSpacing200()), rVar2, 0);
                Label description2 = section.getDescription();
                if (description2 == null) {
                    rVar2.X(671226457);
                    rVar2.R();
                    companion2 = companion5;
                    aVar = aVar3;
                    i18 = i26;
                    i17 = 0;
                } else {
                    rVar2.X(671226458);
                    j70.h.g(null, null, description2, null, null, aVar3.a(rVar2, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i26).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                    rVar2 = rVar;
                    aVar = aVar3;
                    i18 = i26;
                    companion2 = companion5;
                    i17 = 0;
                    r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i18).getSpacing300()), rVar2, 0);
                    rVar2.R();
                }
                InfoRowListData bulletPoints = section.getBulletPoints();
                if (bulletPoints == null) {
                    rVar2.X(671567426);
                    rVar2.R();
                    c16 = 2;
                } else {
                    rVar2.X(671567427);
                    c16 = 2;
                    s40.g.c(bulletPoints, 0.0f, rVar2, InfoRowListData.f187643b, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i18).getSpacing300()), rVar2, i17);
                    rVar2.R();
                }
                i25 = i27 + 1;
                c15 = c16;
                size = i28;
                listD = list;
                obj = null;
            }
            rVar2.R();
            c30.b alertData = initialized.getAlertData();
            if (alertData == null) {
                rVar2.X(-515314555);
            } else {
                rVar2.X(-515314554);
                c30.e.c(null, alertData, rVar2, c30.b.f22944i << 3, 1);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(g.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        d(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1827306012);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1827306012, i16, -1, "pl.gov.coi.mobywatel.feature.checkvehicleinsurance.presentation.moreinfo.MoreInfoScreen (MoreInfoScreen.kt:28)");
            }
            g.a aVarH = h(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarH, g.a.c.f39566a)) {
                rVarH.X(-600540755);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarH instanceof g.a.Error) {
                rVarH.X(-600538396);
                ((g.a.Error) aVarH).getVmsAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof g.a.Initialized)) {
                    rVarH.X(-600542626);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-600536616);
                d((g.a.Initialized) aVarH, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: d31.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.a h(f6<? extends g.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(g gVar, int i15, p076m2.r rVar, int i16) {
        g(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
