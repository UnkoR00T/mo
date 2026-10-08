package f72;

import d1.a3;
import d1.d3;
import d1.h0;
import d1.i0;
import d1.r3;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0011\u001a\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lf72/p;", "viewModel", "Loq/i0;", "j", "(Lf72/p;Lm2/r;I)V", "Lf72/p$a;", "data", "m", "(Lf72/p$a;Lm2/r;I)V", "Lf72/p$a$b;", "o", "(Lf72/p$a$b;Lm2/r;I)V", "", "Lmx/a;", "", "Ln50/g;", "hydroWarnings", "s", "(Ljava/util/Map;Lm2/r;I)V", "Lf3/m;", "modifier", "title", "description", "h", "(Lf3/m;Lmx/a;Lmx/a;Lm2/r;I)V", "floodalert_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    private static final void h(final f3.m mVar, Label label, Label label2, p076m2.r rVar, final int i15) {
        int i16;
        final Label label3;
        p076m2.r rVar2;
        final Label label4 = label2;
        p076m2.r rVarH = rVar.h(1483508608);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(label4) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1483508608, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.EmptyHydroWarnings (FloodAlertAlarmStatesScreen.kt:125)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVar);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            f3.m.Companion companion3 = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, companion3);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            i0 i0Var = i0.f39176a;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion3, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            long jI = aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            TextStyle textStyleH = aVar.f(rVarH, i17).h();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            rVar2 = rVarH;
            int i18 = i16;
            j70.h.g(mVarH, null, label, null, null, jI, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleH, null, null, false, false, null, rVar2, ((i16 << 3) & 896) | 6, 0, 0, 33026010);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i17).getSpacing100()), rVar2, 0);
            label3 = label;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion3, 0.0f, 1, null), null, label2, null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar2, (i18 & 896) | 6, 0, 0, 33026010);
            label4 = label2;
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            label3 = label;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f72.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.i(mVar, label3, label4, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(f3.m mVar, Label label, Label label2, int i15, p076m2.r rVar, int i16) {
        h(mVar, label, label2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1051373192);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1051373192, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.FloodAlertAlarmStatesScreen (FloodAlertAlarmStatesScreen.kt:35)");
            }
            m(k(m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f72.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.l(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.a k(f6<? extends p.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(p pVar, int i15, p076m2.r rVar, int i16) {
        j(pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void m(final p.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1868868101);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1868868101, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.FloodAlertAlarmStatesScreenContent (FloodAlertAlarmStatesScreen.kt:46)");
            }
            if (fr.t.c(aVar, p.a.C1348a.f59819a)) {
                rVarH.X(685920406);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof p.a.Initialized)) {
                    rVarH.X(685918482);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(685922911);
                o((p.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: f72.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.n(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(p.a aVar, int i15, p076m2.r rVar, int i16) {
        m(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void o(final p.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(954871123);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(954871123, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.FloodAlertAlarmStatesScreenContentInitialized (FloodAlertAlarmStatesScreen.kt:56)");
            }
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-876815104, true, new er.q() { // from class: f72.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return x.p(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: f72.t
                    @Override // er.a
                    public final Object a() {
                        return x.q(initialized);
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
            d5VarM.a(new er.p() { // from class: f72.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.r(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(p.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        int i17;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-876815104, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.FloodAlertAlarmStatesScreenContentInitialized.<anonymous> (FloodAlertAlarmStatesScreen.kt:58)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), null, rVar2, 6, 1);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarQ = a3.q(a3.l(w0.i.d(mVarS, aVar.a(rVar2, i18).getBase().a(), null, 2, null), d3Var), aVar.b(rVar2, i18).getSpacing200(), aVar.b(rVar2, i18).getSpacing100(), aVar.b(rVar2, i18).getSpacing200(), aVar.b(rVar2, i18).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarQ);
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
            i0 i0Var = i0.f39176a;
            if (initialized.getVoivodeshipPickerVisible()) {
                rVar2.X(877664585);
                h72.d.c(initialized.getHeaderData(), rVar2, 0);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i18).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, initialized.getVoivodeshipPickerSectionHeader(), null, null, aVar.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
                rVar2 = rVar;
                companion = companion2;
                i17 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i18).getSpacing200()), rVar2, 0);
                j40.l.m(initialized.getDropDownButtonData(), rVar2, DropDownButtonData.f99359i);
            } else {
                companion = companion2;
                i17 = 0;
                rVar2.X(874858124);
            }
            rVar2.R();
            if (initialized.e().isEmpty()) {
                rVar2.X(878207302);
                h(h0.b(i0Var, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), initialized.getEmptyStateTitle(), initialized.getEmptyStateDescription(), rVar2, i17);
                rVar2.R();
            } else {
                rVar2.X(878436578);
                s(initialized.e(), rVar2, i17);
                rVar2.R();
            }
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(p.a.Initialized initialized) {
        initialized.f().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(p.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        o(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final Map<Label, ? extends List<DefaultSingleCardData>> map, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-162168339);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(map) ? 4 : 2);
        } else {
            i16 = i15;
        }
        int i17 = 0;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-162168339, i16, -1, "pl.gov.coi.mobywatel.feature.floodalert.presentation.alarmstates.HydroWarningsContent (FloodAlertAlarmStatesScreen.kt:102)");
            }
            Iterator<Map.Entry<Label, ? extends List<DefaultSingleCardData>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Label, ? extends List<DefaultSingleCardData>> next = it.next();
                Label key = next.getKey();
                List<DefaultSingleCardData> value = next.getValue();
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing300()), rVarH, i17);
                p076m2.r rVar3 = rVarH;
                j70.h.g(null, null, key, null, null, aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).p(), null, null, false, false, null, rVar3, 0, 0, 0, 33026011);
                rVarH = rVar3;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
                m30.i.d(new CardListData(value, null, false, null, null, 30, null), null, null, rVarH, 0, 6);
                it = it;
                i17 = 0;
            }
            rVar2 = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f72.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return x.t(map, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(Map map, int i15, p076m2.r rVar, int i16) {
        s(map, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
