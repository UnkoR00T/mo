package bo2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import i50.s;
import j60.BulletItemStyle;
import java.util.List;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lbo2/d;", "viewModel", "Loq/i0;", "g", "(Lbo2/d;Lm2/r;I)V", "Lbo2/d$a;", "screenData", "d", "(Lbo2/d$a;Lm2/r;I)V", "networksecurityissues_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void d(final d.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1936385916);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1936385916, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.welcome.NetworkSecurityIssuesWelcomePageContent (NetworkSecurityIssuesWelcomePageScreen.kt:35)");
            }
            rVar2 = rVarH;
            s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(456817577, true, new er.q() { // from class: bo2.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.e(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: bo2.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.f(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        Object obj;
        boolean z15;
        p076m2.r rVar2 = rVar;
        int i16 = (i15 & 6) == 0 ? i15 | (rVar2.W(d3Var) ? 4 : 2) : i15;
        boolean z16 = true;
        int i17 = 0;
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(456817577, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.welcome.NetworkSecurityIssuesWelcomePageContent.<anonymous> (NetworkSecurityIssuesWelcomePageScreen.kt:37)");
            }
            Object obj2 = null;
            f3.m mVarN = t70.s.n(a3.l(w0.i.d(t70.i.S(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), null, rVar2, 6, 1), k70.a.f108864a.a(rVar2, k70.a.f108865b).getBase().a(), null, 2, null), d3Var), rVar2, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2.X(-598328352);
            for (d.b bVar : data.c()) {
                if (bVar instanceof d.b.Title) {
                    rVar2.X(1923246675);
                    Label text = ((d.b.Title) bVar).getText();
                    k70.a aVar = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    j70.h.g(null, null, text, null, null, aVar.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                    rVar2 = rVar;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i18).getSpacing200()), rVar2, 0);
                    rVar2.R();
                    i17 = 0;
                } else {
                    int i19 = i17;
                    if (bVar instanceof d.b.Text) {
                        rVar2.X(1923582994);
                        Label text2 = ((d.b.Text) bVar).getText();
                        k70.a aVar2 = k70.a.f108864a;
                        int i25 = k70.a.f108865b;
                        j70.h.g(null, null, text2, null, null, aVar2.a(rVar2, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i25).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                        rVar2 = rVar;
                        i17 = 0;
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar2.b(rVar2, i25).getSpacing200()), rVar2, 0);
                        rVar2.R();
                    } else {
                        i17 = i19;
                        if (bVar instanceof d.b.BulletList) {
                            rVar2.X(-215032012);
                            List<Label> listA = ((d.b.BulletList) bVar).a();
                            k70.a aVar3 = k70.a.f108864a;
                            int i26 = k70.a.f108865b;
                            obj = null;
                            j60.c.b(listA, new BulletItemStyle(aVar3.f(rVar2, i26).b(), aVar3.a(rVar2, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), null), a3.r(f3.m.INSTANCE, aVar3.b(rVar2, i26).getSpacing100(), 0.0f, 0.0f, aVar3.b(rVar2, i26).getSpacing200(), 6, null), rVar2, BulletItemStyle.f99759c << 3, 0);
                            rVar2.R();
                            z15 = true;
                        } else {
                            obj = null;
                            if (!(bVar instanceof d.b.Alert)) {
                                rVar2.X(-215055369);
                                rVar2.R();
                                throw new oq.p();
                            }
                            rVar2.X(1924402758);
                            z15 = true;
                            c30.e.c(null, ((d.b.Alert) bVar).getAlertData(), rVar2, c30.b.f22944i << 3, 1);
                            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, i17);
                            rVar2.R();
                        }
                    }
                    obj2 = obj;
                    z16 = z15;
                }
                obj = null;
                z15 = true;
                obj2 = obj;
                z16 = z15;
            }
            rVar2.R();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            r3.a(h0.b(i0Var, companion2, 1.0f, false, 2, null), rVar2, i17);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing250()), rVar2, i17);
            h30.q.p(data.getNextButtonData(), false, null, rVar2, 0, 6);
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
    public static final i0 f(d.Data data, int i15, p076m2.r rVar, int i16) {
        d(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1402353037);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1402353037, i16, -1, "pl.gov.coi.mobywatel.feature.networksecurityissues.report.presentation.welcome.NetworkSecurityIssuesWelcomePageScreen (NetworkSecurityIssuesWelcomePageScreen.kt:27)");
            }
            d(h(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: bo2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data h(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar, int i15, p076m2.r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
