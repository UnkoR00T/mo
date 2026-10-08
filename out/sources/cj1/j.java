package cj1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
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
import p088nul.q0;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\f\u0010\u0006\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lcj1/c;", "viewModel", "Loq/i0;", "g", "(Lcj1/c;Lm2/r;I)V", "Lcj1/c$a$c;", "data", "j", "(Lcj1/c$a$c;Lm2/r;I)V", "Lcj1/c$a$c$a;", "n", "(Lcj1/c$a$c$a;Lm2/r;I)V", "Lcj1/c$a$c$b;", "p", "(Lcj1/c$a$c$b;Lm2/r;I)V", "Lcj1/c$a;", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void g(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1160861224);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1160861224, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.individualtraining.IndividualTrainingScreen (IndividualTrainingScreen.kt:30)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            c.a aVarH = h(f6VarC);
            if (aVarH instanceof c.a.b) {
                rVarH.X(1103869225);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarH instanceof c.a.InterfaceC0709c) {
                rVarH.X(1103871627);
                j((c.a.InterfaceC0709c) aVarH, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof c.a.Error)) {
                    rVarH.X(1103866906);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1103875520);
                ((c.a.Error) aVarH).getErrorVMS().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: cj1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a h(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, int i15, p076m2.r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final c.a.InterfaceC0709c interfaceC0709c, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(283249865);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(interfaceC0709c) : rVarH.G(interfaceC0709c) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(283249865, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.individualtraining.IndividualTrainingScreenContent (IndividualTrainingScreen.kt:45)");
            }
            q0.g(false, interfaceC0709c.a(), rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(interfaceC0709c.getBaseScaffoldData(), y2.m.d(-1563012620, true, new er.p() { // from class: cj1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(interfaceC0709c, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-167672580, true, new er.q() { // from class: cj1.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.l(interfaceC0709c, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: cj1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(interfaceC0709c, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a.InterfaceC0709c interfaceC0709c, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1563012620, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.individualtraining.IndividualTrainingScreenContent.<anonymous> (IndividualTrainingScreen.kt:51)");
            }
            ButtonData registerButtonData = interfaceC0709c.getRegisterButtonData();
            if (registerButtonData == null) {
                rVar.X(-1968468384);
                rVar.R();
            } else {
                rVar.X(-1968468383);
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
                h30.q.p(registerButtonData, false, null, rVar, 0, 6);
                rVar.x();
                rVar.R();
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
    public static final i0 l(c.a.InterfaceC0709c interfaceC0709c, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-167672580, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.individualtraining.IndividualTrainingScreenContent.<anonymous> (IndividualTrainingScreen.kt:58)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
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
            if (interfaceC0709c instanceof c.a.InterfaceC0709c.Empty) {
                rVar.X(2142417711);
                n((c.a.InterfaceC0709c.Empty) interfaceC0709c, rVar, 0);
                rVar.R();
            } else {
                if (!(interfaceC0709c instanceof c.a.InterfaceC0709c.List)) {
                    rVar.X(2142415046);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(2142421486);
                p((c.a.InterfaceC0709c.List) interfaceC0709c, rVar, 0);
                rVar.R();
            }
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
    public static final i0 m(c.a.InterfaceC0709c interfaceC0709c, int i15, p076m2.r rVar, int i16) {
        j(interfaceC0709c, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final c.a.InterfaceC0709c.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        f3.m mVar;
        int i17;
        p076m2.r rVarH = rVar.h(1216912240);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1216912240, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.individualtraining.TrainingDashboardScreenContentEmpty (IndividualTrainingScreen.kt:80)");
            }
            Label header = empty.getHeader();
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            c.EmptyInfoData emptyInfoData = empty.getEmptyInfoData();
            if (emptyInfoData == null) {
                rVarH.X(-786169428);
                rVarH.R();
                mVar = null;
                i17 = 1;
            } else {
                rVarH.X(-786169427);
                f3.m.Companion companion = f3.m.INSTANCE;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
                j70.h.g(null, null, emptyInfoData.getDescription(), null, null, aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
                s40.g.c(emptyInfoData.getInfoRowListData(), 0.0f, rVarH, InfoRowListData.f187643b, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
                mVar = null;
                i17 = 1;
                c30.e.c(null, emptyInfoData.getInfoAlertData(), rVarH, c30.b.f22944i << 3, 1);
                rVarH.R();
            }
            if (empty.getAlertData() == null) {
                rVarH.X(-785650240);
            } else {
                rVarH.X(-785650239);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i18).getSpacing300()), rVarH, 0);
                c30.e.c(mVar, empty.getAlertData(), rVarH, c30.b.f22944i << 3, i17);
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
            d5VarM.a(new er.p() { // from class: cj1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.o(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c.a.InterfaceC0709c.Empty empty, int i15, p076m2.r rVar, int i16) {
        n(empty, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final c.a.InterfaceC0709c.List list, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(1028066682);
        int i16 = (i15 & 6) == 0 ? i15 | (rVarH.G(list) ? 4 : 2) : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1028066682, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.individualtraining.TrainingDashboardScreenContentList (IndividualTrainingScreen.kt:108)");
            }
            if (list.getAlertData() == null) {
                rVarH.X(-277139786);
            } else {
                rVarH.X(-277139785);
                c30.e.c(null, list.getAlertData(), rVarH, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            }
            rVarH.R();
            Label header = list.getHeader();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, header, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).i(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            List<DefaultSingleCardData> listE = list.e();
            ArrayList arrayList = new ArrayList(pq.v.y(listE, 10));
            int i18 = 0;
            for (Object obj : listE) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                h0.v((DefaultSingleCardData) obj, null, rVarH, 0, 2);
                if (i18 != list.e().size() - 1) {
                    rVarH.X(-1572432575);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                } else {
                    rVarH.X(-1576685062);
                }
                rVarH.R();
                arrayList.add(i0.f148189a);
                i18 = i19;
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cj1.h
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return j.q(list, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c.a.InterfaceC0709c.List list, int i15, p076m2.r rVar, int i16) {
        p(list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
