package az1;

import b30.AccordionData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Laz1/v;", "viewModel", "Loq/i0;", "g", "(Laz1/v;Lm2/r;I)V", "Laz1/v$a;", "screenData", "Li70/p;", "snackBarState", "k", "(Laz1/v$a;Li70/p;Lm2/r;I)V", "m", "data", "f", "(Laz1/v$a;Lm2/r;I)Loq/i0;", "electoralregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final i0 f(v.Data data, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-796079246, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.personaldata.ElectoralPersonalContent (ElectoralPersonalDataScreen.kt:83)");
        }
        rVar.X(-527973307);
        Label mainSectionTitle = data.getMainSectionTitle();
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        j70.h.g(null, null, mainSectionTitle, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
        f3.m.Companion companion = f3.m.INSTANCE;
        r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
        m30.i.d(data.getMainSectionList(), null, null, rVar, 0, 6);
        r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
        AccordionData votingDistrictsAccordionData = data.getVotingDistrictsAccordionData();
        if (votingDistrictsAccordionData == null) {
            rVar.X(-354340362);
        } else {
            rVar.X(-354340361);
            b30.j.g(votingDistrictsAccordionData, rVar, AccordionData.f16343b);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
        }
        rVar.R();
        AccordionData personalAccordionData = data.getPersonalAccordionData();
        if (personalAccordionData == null) {
            rVar.X(-354181642);
        } else {
            rVar.X(-354181641);
            b30.j.g(personalAccordionData, rVar, AccordionData.f16343b);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
        }
        rVar.R();
        c30.b alertData = data.getAlertData();
        i0 i0Var = null;
        if (alertData == null) {
            rVar.X(-354035198);
            rVar.R();
        } else {
            rVar.X(-354035197);
            c30.e.c(null, alertData, rVar, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing400()), rVar, 0);
            rVar.R();
            i0Var = i0.f148189a;
        }
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    public static final void g(final v vVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-924542279);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(vVar) : rVarH.G(vVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-924542279, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.personaldata.ElectoralPersonalDataScreen (ElectoralPersonalDataScreen.kt:33)");
            }
            f6 f6VarC = m7.b.c(vVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(vVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            v.Data dataH = h(f6VarC);
            i70.p pVarI = i(f6VarB);
            int i17 = c30.b.f22944i | BaseScaffoldData.f89350g;
            int i18 = AccordionData.f16343b;
            k(dataH, pVarI, rVarH, i17 | i18 | i18);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: az1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.j(vVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final v.Data h(f6<v.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p i(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(v vVar, int i15, p076m2.r rVar, int i16) {
        g(vVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final v.Data data, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(75966723);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(75966723, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.personaldata.ElectoralPersonalScreen (ElectoralPersonalDataScreen.kt:46)");
            }
            int i17 = c30.b.f22944i | BaseScaffoldData.f89350g;
            int i18 = AccordionData.f16343b;
            m(data, pVar, rVarH, i17 | i18 | i18 | (i16 & 14) | (i16 & 112));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: az1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.l(data, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(v.Data data, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        k(data, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final v.Data data, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(212801734);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(212801734, i16, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.personaldata.ElectoralPersonalScreenContent (ElectoralPersonalDataScreen.kt:55)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, data.d(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(data.getScaffoldData(), null, y2.m.d(-136485360, true, new er.p() { // from class: az1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.n(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(712301689, true, new er.q() { // from class: az1.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.o(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: az1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.p(data, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-136485360, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.personaldata.ElectoralPersonalScreenContent.<anonymous> (ElectoralPersonalDataScreen.kt:66)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(v.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(712301689, i15, -1, "pl.gov.coi.mobywatel.feature.electoralregister.presentation.screen.personaldata.ElectoralPersonalScreenContent.<anonymous> (ElectoralPersonalDataScreen.kt:69)");
            }
            f3.m mVarN = t70.s.n(a3.l(w0.i.d(t70.i.S(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), null, rVar, 6, 1), k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().a(), null, 2, null), d3Var), rVar, 0);
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
            int i16 = c30.b.f22944i | BaseScaffoldData.f89350g;
            int i17 = AccordionData.f16343b;
            f(data, rVar, i16 | i17 | i17);
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
    public static final i0 p(v.Data data, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        m(data, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
